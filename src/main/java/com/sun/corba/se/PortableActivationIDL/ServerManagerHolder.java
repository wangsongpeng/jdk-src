package com.sun.corba.se.PortableActivationIDL;

/**
* com/sun/corba/se/PortableActivationIDL/ServerManagerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u121/8372/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Monday, December 12, 2016 4:37:46 PM PST
*/


/** Interface used to combine the Activator and Locator when both are
    * implemented together in the same process, as is currently the case
    * for our implementation.
    */
public final class ServerManagerHolder implements org.omg.CORBA.portable.Streamable
{
  public ServerManager value = null;

  public ServerManagerHolder ()
  {
  }

  public ServerManagerHolder (ServerManager initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServerManagerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServerManagerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServerManagerHelper.type ();
  }

}
