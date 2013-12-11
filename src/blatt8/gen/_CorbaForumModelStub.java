package blatt8.gen;


/**
* blatt8/gen/_CorbaForumModelStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from forum.idl
* Mittwoch, 11. Dezember 2013 09:46 Uhr MEZ
*/

public class _CorbaForumModelStub extends org.omg.CORBA.portable.ObjectImpl implements blatt8.gen.CorbaForumModel
{

  public void registerView (String name, blatt8.gen.CorbaForumView view) throws blatt8.gen.AlreadyBoundException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registerView", true);
                $out.write_string (name);
                blatt8.gen.CorbaForumViewHelper.write ($out, view);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:blatt8/gen/AlreadyBoundException:1.0"))
                    throw blatt8.gen.AlreadyBoundExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                registerView (name, view        );
            } finally {
                _releaseReply ($in);
            }
  } // registerView

  public void deregisterView (String name) throws blatt8.gen.NotBoundException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deregisterView", true);
                $out.write_string (name);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:blatt8/gen/NotBoundException:1.0"))
                    throw blatt8.gen.NotBoundExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                deregisterView (name        );
            } finally {
                _releaseReply ($in);
            }
  } // deregisterView

  public void moveNorth (String name) throws blatt8.gen.NotBoundException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("moveNorth", true);
                $out.write_string (name);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:blatt8/gen/NotBoundException:1.0"))
                    throw blatt8.gen.NotBoundExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                moveNorth (name        );
            } finally {
                _releaseReply ($in);
            }
  } // moveNorth

  public void moveEast (String name) throws blatt8.gen.NotBoundException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("moveEast", true);
                $out.write_string (name);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:blatt8/gen/NotBoundException:1.0"))
                    throw blatt8.gen.NotBoundExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                moveEast (name        );
            } finally {
                _releaseReply ($in);
            }
  } // moveEast

  public void moveSouth (String name) throws blatt8.gen.NotBoundException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("moveSouth", true);
                $out.write_string (name);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:blatt8/gen/NotBoundException:1.0"))
                    throw blatt8.gen.NotBoundExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                moveSouth (name        );
            } finally {
                _releaseReply ($in);
            }
  } // moveSouth

  public void moveWest (String name) throws blatt8.gen.NotBoundException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("moveWest", true);
                $out.write_string (name);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:blatt8/gen/NotBoundException:1.0"))
                    throw blatt8.gen.NotBoundExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                moveWest (name        );
            } finally {
                _releaseReply ($in);
            }
  } // moveWest

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:blatt8/gen/CorbaForumModel:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _CorbaForumModelStub
