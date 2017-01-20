package org.omg.CosNaming;

/**
* org/omg/CosNaming/BindingTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u121/8372/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Monday, December 12, 2016 4:37:46 PM PST
*/


/**
   * Specifies whether the given binding is for a object (that is not a
   * naming context) or for a naming context.
   */
public final class BindingTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public BindingType value = null;

  public BindingTypeHolder ()
  {
  }

  public BindingTypeHolder (BindingType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = BindingTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    BindingTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return BindingTypeHelper.type ();
  }

}
