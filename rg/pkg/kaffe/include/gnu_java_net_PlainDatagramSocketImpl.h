/* DO NOT EDIT THIS FILE - it is machine generated */
#include <native.h>

#ifndef _Included_gnu_java_net_PlainDatagramSocketImpl
#define _Included_gnu_java_net_PlainDatagramSocketImpl

#ifdef __cplusplus
extern "C" {
#endif

/* Header for class gnu_java_net_PlainDatagramSocketImpl */

typedef struct Hgnu_java_net_PlainDatagramSocketImpl {
  /* Fields from java/lang/Object: */
  Hjava_lang_Object base;

  /* Fields from java/net/DatagramSocketImpl: */
  jint localPort;
  struct Hjava_io_FileDescriptor* fd;

  /* Fields from gnu/java/net/PlainDatagramSocketImpl: */
  jint timeout;
  jint native_fd;
  struct Hjava_lang_Object* RECEIVE_LOCK;
  struct Hjava_lang_Object* SEND_LOCK;
} Hgnu_java_net_PlainDatagramSocketImpl;

extern jint gnu_java_net_PlainDatagramSocketImpl_peekData(struct Hgnu_java_net_PlainDatagramSocketImpl*, struct Hjava_net_DatagramPacket*);
extern void gnu_java_net_PlainDatagramSocketImpl_bind(struct Hgnu_java_net_PlainDatagramSocketImpl*, jint, struct Hjava_net_InetAddress*);
extern void gnu_java_net_PlainDatagramSocketImpl_send0(struct Hgnu_java_net_PlainDatagramSocketImpl*, struct Hjava_net_DatagramPacket*);
extern jint gnu_java_net_PlainDatagramSocketImpl_peek(struct Hgnu_java_net_PlainDatagramSocketImpl*, struct Hjava_net_InetAddress*);
extern void gnu_java_net_PlainDatagramSocketImpl_receive0(struct Hgnu_java_net_PlainDatagramSocketImpl*, struct Hjava_net_DatagramPacket*);
extern void gnu_java_net_PlainDatagramSocketImpl_setTTL(struct Hgnu_java_net_PlainDatagramSocketImpl*, jbyte);
extern jbyte gnu_java_net_PlainDatagramSocketImpl_getTTL(struct Hgnu_java_net_PlainDatagramSocketImpl*);
extern void gnu_java_net_PlainDatagramSocketImpl_join(struct Hgnu_java_net_PlainDatagramSocketImpl*, struct Hjava_net_InetAddress*);
extern void gnu_java_net_PlainDatagramSocketImpl_leave(struct Hgnu_java_net_PlainDatagramSocketImpl*, struct Hjava_net_InetAddress*);
extern void gnu_java_net_PlainDatagramSocketImpl_joinGroup(struct Hgnu_java_net_PlainDatagramSocketImpl*, struct Hjava_net_SocketAddress*, struct Hjava_net_NetworkInterface*);
extern void gnu_java_net_PlainDatagramSocketImpl_leaveGroup(struct Hgnu_java_net_PlainDatagramSocketImpl*, struct Hjava_net_SocketAddress*, struct Hjava_net_NetworkInterface*);
extern void gnu_java_net_PlainDatagramSocketImpl_socketSetOption(struct Hgnu_java_net_PlainDatagramSocketImpl*, jint, struct Hjava_lang_Object*);
extern jint gnu_java_net_PlainDatagramSocketImpl_socketGetOption(struct Hgnu_java_net_PlainDatagramSocketImpl*, jint);
extern void gnu_java_net_PlainDatagramSocketImpl_datagramSocketCreate(struct Hgnu_java_net_PlainDatagramSocketImpl*);
extern void gnu_java_net_PlainDatagramSocketImpl_datagramSocketClose(struct Hgnu_java_net_PlainDatagramSocketImpl*);
extern void gnu_java_net_PlainDatagramSocketImpl_setBlocking(struct Hgnu_java_net_PlainDatagramSocketImpl*, jboolean);

#ifdef __cplusplus
}
#endif

#endif
