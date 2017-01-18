package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerManagerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON3/workspace/8-2-build-linux-amd64/jdk8u121/8372/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Monday, December 12, 2016 4:37:46 PM PST
*/


/** Interface used to combine the Activator and Locator when both are
    * implemented together in the same process, as is currently the case
    * for our implementation.
    */
abstract public class ServerManagerHelper
{
  private static String  _id = "IDL:PortableActivationIDL/ServerManager:1.0";

  public static void insert (org.omg.CORBA.Any a, ServerManager that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ServerManager extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ServerManagerHelper.id (), "ServerManager");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ServerManager read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ServerManagerStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ServerManager value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ServerManager narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ServerManager)
      return (ServerManager)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _ServerManagerStub stub = new _ServerManagerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ServerManager unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ServerManager)
      return (ServerManager)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _ServerManagerStub stub = new _ServerManagerStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
