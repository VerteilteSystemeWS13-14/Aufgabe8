package blatt8.my;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import blatt8.genserver.CorbaForumModel;
import blatt8.genserver.CorbaForumModelHelper;

import forum.framework.IForumModel;
import forum.framework.IForumView;

public final class CorbaModelForwarder implements IForumModel {
	
	private CorbaForumModel receiver;
	public String[] args;
	
	public CorbaModelForwarder()
	{
		try {
		ORB orb = ORB.init(args, null);
		NamingContextExt nameService = NamingContextExtHelper.narrow(
		orb.resolve_initial_references("NameService"));
		receiver = CorbaForumModelHelper.narrow(nameService.resolve_str("HelloServer"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deregisterView(String arg0) throws NotBoundException,
			IOException {
		try {
			receiver.deregisterView(arg0);
		} catch (blatt8.genserver.NotBoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void moveEast(String arg0) throws NotBoundException, IOException {
		try {
			receiver.moveEast(arg0);
		} catch (blatt8.genserver.NotBoundException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void moveNorth(String arg0) throws NotBoundException, IOException {
		try {
			receiver.moveNorth(arg0);
		} catch (blatt8.genserver.NotBoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void moveSouth(String arg0) throws NotBoundException, IOException {
		try {
			receiver.moveSouth(arg0);
		} catch (blatt8.genserver.NotBoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void moveWest(String arg0) throws NotBoundException, IOException {
		try {
			receiver.moveWest(arg0);
		} catch (blatt8.genserver.NotBoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void registerView(String arg0, IForumView arg1)
			throws AlreadyBoundException, IOException {
		try {
			receiver.registerView(arg0, new CorbaViewReceiver(arg1));
		} catch (blatt8.genserver.AlreadyBoundException e) {
			e.printStackTrace();
		}

	}

}
