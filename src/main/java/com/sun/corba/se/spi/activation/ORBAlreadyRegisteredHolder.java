package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ORBAlreadyRegisteredHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u121/8372/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Monday, December 12, 2016 4:37:46 PM PST
*/

public final class ORBAlreadyRegisteredHolder implements org.omg.CORBA.portable.Streamable
{
  public ORBAlreadyRegistered value = null;

  public ORBAlreadyRegisteredHolder ()
  {
  }

  public ORBAlreadyRegisteredHolder (ORBAlreadyRegistered initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ORBAlreadyRegisteredHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ORBAlreadyRegisteredHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ORBAlreadyRegisteredHelper.type ();
  }

}
