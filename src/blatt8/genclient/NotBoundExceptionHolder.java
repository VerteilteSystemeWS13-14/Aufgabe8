package blatt8.genclient;

/**
* blatt8/gen/NotBoundExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from forum.idl
* Mittwoch, 11. Dezember 2013 11:18 Uhr MEZ
*/

public final class NotBoundExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public blatt8.genclient.NotBoundException value = null;

  public NotBoundExceptionHolder ()
  {
  }

  public NotBoundExceptionHolder (blatt8.genclient.NotBoundException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = blatt8.genclient.NotBoundExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    blatt8.genclient.NotBoundExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return blatt8.genclient.NotBoundExceptionHelper.type ();
  }

}
