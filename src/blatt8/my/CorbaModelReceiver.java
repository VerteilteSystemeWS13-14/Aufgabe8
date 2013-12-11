package blatt8.my;

import java.io.IOException;

import org.omg.CORBA.Context;
import org.omg.CORBA.ContextList;
import org.omg.CORBA.DomainManager;
import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;
import org.omg.CORBA.ORB;
import org.omg.CORBA.Object;
import org.omg.CORBA.Policy;
import org.omg.CORBA.Request;
import org.omg.CORBA.SetOverrideType;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import forum.framework.ForumModel;

import blatt8.genserver.AlreadyBoundException;
import blatt8.genserver.CorbaForumModel;
import blatt8.genserver.CorbaForumModelHelper;
import blatt8.genserver.CorbaForumModelPOA;
import blatt8.genserver.CorbaForumView;
import blatt8.genserver.NotBoundException;

public final class CorbaModelReceiver extends CorbaForumModelPOA implements CorbaForumModel, Runnable {

	private static final long serialVersionUID = 3864483516539048189L;
	public static final String NAME = "CorbaModelReceiver";
	
	public String[] args;

	@Override
	public void run() {
		try
		{
			ORB orb = ORB.init(args, null);
			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate(); 
			 
			NamingContextExt nameService = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));
			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(this);
			CorbaForumModel server = CorbaForumModelHelper.narrow(ref);
			nameService.rebind(nameService.to_name(NAME), server);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void registerView(String name, CorbaForumView view)
			throws AlreadyBoundException {
		
		try {
			ForumModel.INSTANCE.registerView(name, new CorbaViewForwarder(view));
		} catch (java.rmi.AlreadyBoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deregisterView(String name) throws NotBoundException {
		try {
			ForumModel.INSTANCE.deregisterView(name);
		} catch (java.rmi.NotBoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void moveNorth(String name) throws NotBoundException {
		try {
			ForumModel.INSTANCE.moveNorth(name);
		} catch (java.rmi.NotBoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void moveEast(String name) throws NotBoundException {
		try {
			ForumModel.INSTANCE.moveEast(name);
		} catch (java.rmi.NotBoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void moveSouth(String name) throws NotBoundException {
		try {
			ForumModel.INSTANCE.moveSouth(name);
		} catch (java.rmi.NotBoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void moveWest(String name) throws NotBoundException {
		try {
			ForumModel.INSTANCE.moveWest(name);
		} catch (java.rmi.NotBoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Request _create_request(Context arg0, String arg1, NVList arg2,
			NamedValue arg3) {
		
		return null;
	}

	@Override
	public Request _create_request(Context arg0, String arg1, NVList arg2,
			NamedValue arg3, ExceptionList arg4, ContextList arg5) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object _duplicate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DomainManager[] _get_domain_managers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Policy _get_policy(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int _hash(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean _is_equivalent(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void _release() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Request _request(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object _set_policy_override(Policy[] arg0, SetOverrideType arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
