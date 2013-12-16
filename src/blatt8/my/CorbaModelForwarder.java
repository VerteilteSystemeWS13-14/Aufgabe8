package blatt8.my;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import blatt8.genclient.CorbaForumModel;
import blatt8.genclient.CorbaForumModelHelper;
import blatt8.genclient.CorbaForumView;
import blatt8.genclient.CorbaForumViewHelper;

import forum.framework.IForumModel;
import forum.framework.IForumView;

public final class CorbaModelForwarder implements IForumModel {
	
	private CorbaForumModel receiver;
	private POA rootpoa;
	
	public CorbaModelForwarder(String[] args)
	{
		try {
			ORB orb = ORB.init(args, null);
			rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();
			
			NamingContextExt nameService = NamingContextExtHelper.narrow(orb.resolve_initial_references("NameService"));
			receiver = CorbaForumModelHelper.narrow(nameService.resolve_str(CorbaModelReceiver.NAME));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deregisterView(String name) throws NotBoundException,
			IOException {
		try {
			receiver.deregisterView(name);
		} catch (blatt8.genclient.NotBoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void moveEast(String name) throws NotBoundException, IOException {
		try {
			receiver.moveEast(name);
		} catch (blatt8.genclient.NotBoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void moveNorth(String name) throws NotBoundException, IOException {
		try {
			receiver.moveNorth(name);
		} catch (blatt8.genclient.NotBoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void moveSouth(String name) throws NotBoundException, IOException {
		try {
			receiver.moveSouth(name);
		} catch (blatt8.genclient.NotBoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void moveWest(String name) throws NotBoundException, IOException {
		try {
			receiver.moveWest(name);
		} catch (blatt8.genclient.NotBoundException e) {
			e.printStackTrace();
		}
	}

	@Override 
	public void registerView(String name, IForumView view)
			throws AlreadyBoundException, IOException {
		try {
			
			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(new CorbaViewReceiver(view));
			CorbaForumView obj = CorbaForumViewHelper.narrow(ref);
			receiver.registerView(name, obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
