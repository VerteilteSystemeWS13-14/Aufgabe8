package blatt8.genclient;


/**
* blatt8/gen/PositionedAvatar.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from forum.idl
* Mittwoch, 11. Dezember 2013 11:18 Uhr MEZ
*/

public final class PositionedAvatar implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public blatt8.genclient.Position position = null;

  public PositionedAvatar ()
  {
  } // ctor

  public PositionedAvatar (String _name, blatt8.genclient.Position _position)
  {
    name = _name;
    position = _position;
  } // ctor

} // class PositionedAvatar
