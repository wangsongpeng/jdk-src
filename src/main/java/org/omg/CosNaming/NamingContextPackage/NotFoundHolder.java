package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/NotFoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u121/8372/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Monday, December 12, 2016 4:37:46 PM PST
*/

public final class NotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public NotFound value = null;

  public NotFoundHolder ()
  {
  }

  public NotFoundHolder (NotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotFoundHelper.type ();
  }

}