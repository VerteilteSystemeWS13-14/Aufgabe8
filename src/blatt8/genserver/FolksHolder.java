package blatt8.genserver;


/**
* blatt8/gen/FolksHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from forum.idl
* Mittwoch, 11. Dezember 2013 09:46 Uhr MEZ
*/

public final class FolksHolder implements org.omg.CORBA.portable.Streamable
{
  public blatt8.genserver.PositionedAvatar value[] = null;

  public FolksHolder ()
  {
  }

  public FolksHolder (blatt8.genserver.PositionedAvatar[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = blatt8.genserver.FolksHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    blatt8.genserver.FolksHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return blatt8.genserver.FolksHelper.type ();
  }

}
