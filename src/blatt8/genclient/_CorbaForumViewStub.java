package blatt8.genclient;


/**
* blatt8/gen/_CorbaForumViewStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from forum.idl
* Mittwoch, 11. Dezember 2013 11:18 Uhr MEZ
*/

public class _CorbaForumViewStub extends org.omg.CORBA.portable.ObjectImpl implements blatt8.genclient.CorbaForumView
{

  public void notifyView (blatt8.genclient.PositionedAvatar[] folks)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("notifyView", true);
                blatt8.genclient.FolksHelper.write ($out, folks);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                notifyView (folks        );
            } finally {
                _releaseReply ($in);
            }
  } // notifyView

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:blatt8/gen/CorbaForumView:1.0"};

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
} // class _CorbaForumViewStub
