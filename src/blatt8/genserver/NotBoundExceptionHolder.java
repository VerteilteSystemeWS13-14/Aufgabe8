package blatt8.genserver;

/**
* blatt8/gen/NotBoundExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from forum.idl
* Mittwoch, 11. Dezember 2013 09:46 Uhr MEZ
*/

public final class NotBoundExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public blatt8.genserver.NotBoundException value = null;

  public NotBoundExceptionHolder ()
  {
  }

  public NotBoundExceptionHolder (blatt8.genserver.NotBoundException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = blatt8.genserver.NotBoundExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    blatt8.genserver.NotBoundExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return blatt8.genserver.NotBoundExceptionHelper.type ();
  }

}
