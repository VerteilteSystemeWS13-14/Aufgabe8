package blatt8.genserver;


/**
* blatt8/gen/PositionedAvatarHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from forum.idl
* Mittwoch, 11. Dezember 2013 09:46 Uhr MEZ
*/

abstract public class PositionedAvatarHelper
{
  private static String  _id = "IDL:blatt8/gen/PositionedAvatar:1.0";

  public static void insert (org.omg.CORBA.Any a, blatt8.genserver.PositionedAvatar that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static blatt8.genserver.PositionedAvatar extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = blatt8.genserver.PositionHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "position",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (blatt8.genserver.PositionedAvatarHelper.id (), "PositionedAvatar", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static blatt8.genserver.PositionedAvatar read (org.omg.CORBA.portable.InputStream istream)
  {
    blatt8.genserver.PositionedAvatar value = new blatt8.genserver.PositionedAvatar ();
    value.name = istream.read_string ();
    value.position = blatt8.genserver.PositionHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, blatt8.genserver.PositionedAvatar value)
  {
    ostream.write_string (value.name);
    blatt8.genserver.PositionHelper.write (ostream, value.position);
  }

}
