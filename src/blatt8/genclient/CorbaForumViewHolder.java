package blatt8.genclient;

/**
* blatt8/gen/CorbaForumViewHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from forum.idl
* Mittwoch, 11. Dezember 2013 11:18 Uhr MEZ
*/

public final class CorbaForumViewHolder implements org.omg.CORBA.portable.Streamable
{
  public blatt8.genclient.CorbaForumView value = null;

  public CorbaForumViewHolder ()
  {
  }

  public CorbaForumViewHolder (blatt8.genclient.CorbaForumView initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = blatt8.genclient.CorbaForumViewHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    blatt8.genclient.CorbaForumViewHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return blatt8.genclient.CorbaForumViewHelper.type ();
  }

}
