package blatt8.genclient;


/**
* blatt8/gen/AlreadyBoundException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from forum.idl
* Mittwoch, 11. Dezember 2013 11:18 Uhr MEZ
*/

public final class AlreadyBoundException extends org.omg.CORBA.UserException
{

  public AlreadyBoundException ()
  {
    super(AlreadyBoundExceptionHelper.id());
  } // ctor


  public AlreadyBoundException (String $reason)
  {
    super(AlreadyBoundExceptionHelper.id() + "  " + $reason);
  } // ctor

} // class AlreadyBoundException
