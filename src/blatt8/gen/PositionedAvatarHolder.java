package blatt8.gen;

/**
* blatt8/gen/PositionedAvatarHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from forum.idl
* Mittwoch, 11. Dezember 2013 09:46 Uhr MEZ
*/

public final class PositionedAvatarHolder implements org.omg.CORBA.portable.Streamable
{
  public blatt8.gen.PositionedAvatar value = null;

  public PositionedAvatarHolder ()
  {
  }

  public PositionedAvatarHolder (blatt8.gen.PositionedAvatar initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = blatt8.gen.PositionedAvatarHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    blatt8.gen.PositionedAvatarHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return blatt8.gen.PositionedAvatarHelper.type ();
  }

}
