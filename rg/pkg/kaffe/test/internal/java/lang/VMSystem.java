/* VMSystem.java -- helper for java.lang.system
   Copyright (C) 1998, 2002, 2004 Free Software Foundation

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */

package java.lang;

import java.lang.reflect.Array;

/**
 * VMSystem is a package-private helper class for System that the
 * VM must implement.
 *
 * @author John Keiser
 */
final class VMSystem
{
  /**
   * Copy one array onto another from <code>src[srcStart]</code> ...
   * <code>src[srcStart+len-1]</code> to <code>dest[destStart]</code> ...
   * <code>dest[destStart+len-1]</code>. First, the arguments are validated:
   * neither array may be null, they must be of compatible types, and the
   * start and length must fit within both arrays. Then the copying starts,
   * and proceeds through increasing slots.  If src and dest are the same
   * array, this will appear to copy the data to a temporary location first.
   * An ArrayStoreException in the middle of copying will leave earlier
   * elements copied, but later elements unchanged.
   *
   * @param src the array to copy elements from
   * @param srcStart the starting position in src
   * @param dest the array to copy elements to
   * @param destStart the starting position in dest
   * @param len the number of elements to copy
   * @throws NullPointerException if src or dest is null
   * @throws ArrayStoreException if src or dest is not an array, if they are
   *         not compatible array types, or if an incompatible runtime type
   *         is stored in dest
   * @throws IndexOutOfBoundsException if len is negative, or if the start or
   *         end copy position in either array is out of bounds
   */
  static void arraycopy(Object src, int srcStart,
			Object dest, int destStart, int len)
    {
	if (src == null)
	    throw new NullPointerException("src == null");

	if (dest == null)
	    throw new NullPointerException("dest == null");

	if (len == 0)
	    return; 	 

	final Class source_class = src.getClass();

	if (!source_class.isArray())
	    throw new ArrayStoreException("source is not an array: " + source_class.getName());

	final Class destination_class = dest.getClass();

	if (!destination_class.isArray())
	    throw new ArrayStoreException("destination is not an array: " + destination_class.getName());

	if (srcStart < 0)
	    throw new ArrayIndexOutOfBoundsException("srcStart < 0: " + srcStart);

	final int src_len = Array.getLength(src);

	if ((long)srcStart + (long)len > (long)src_len)
	    throw new ArrayIndexOutOfBoundsException("srcStart + len > src.len: " + srcStart + " + " + len + " > " + src_len);

	if (destStart < 0)
	    throw new ArrayIndexOutOfBoundsException("destStart < 0: " + destStart);

	final int dest_len = Array.getLength(dest);

	if ((long)destStart + (long)len > (long)dest_len)
	    throw new ArrayIndexOutOfBoundsException("destStart + len > dest.len: " + destStart + " + " + len + " > " + dest_len);

	if (len < 0)
	    throw new ArrayIndexOutOfBoundsException("len < 0: " + len);

	arraycopy0(src, srcStart, dest, destStart, len);
    }

  static native void arraycopy0(Object src, int srcStart,
				Object dest, int destStart, int len);

}
