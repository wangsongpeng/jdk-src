package org.omg.IOP;

/**
* org/omg/IOP/ServiceContextHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u121/8372/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Monday, December 12, 2016 4:37:46 PM PST
*/

public final class ServiceContextHolder implements org.omg.CORBA.portable.Streamable
{
  public ServiceContext value = null;

  public ServiceContextHolder ()
  {
  }

  public ServiceContextHolder (ServiceContext initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServiceContextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServiceContextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServiceContextHelper.type ();
  }

}