/*
 * Java core library component.
 *
 * Copyright (c) 1997, 1998
 *      Transvirtual Technologies, Inc.  All rights reserved.
 *
 * See the file "license.terms" for information on usage and redistribution
 * of this file.
 */

package javax.servlet;

public class ServletException
  extends Exception {

public ServletException(String m) {
	super(m);
}

public ServletException() {
	super();
}

}
