package blatt8.my;

import java.io.IOException;

import org.omg.CORBA.ORB;
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

public final class CorbaModelReceiver extends CorbaForumModelPOA implements
		Runnable {

	private static final String NAME = "CorbaModelReceiver";

	@Override
	public void run() {
		String[] args = { "-ORBInitialPort", "1050" };

		ORB orb = ORB.init(args, null);

		try {
			POA rootpoa = POAHelper.narrow(orb
					.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();

			NamingContextExt nameService = NamingContextExtHelper.narrow(orb
					.resolve_initial_references("NameService"));

			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(this);
			CorbaForumModel server = CorbaForumModelHelper.narrow(ref);

			nameService.rebind(nameService.to_name(NAME), server);

			System.out.println("Calling Run on ORB ...");
			orb.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void registerView(String name, CorbaForumView view)
			throws AlreadyBoundException {
		try {
			ForumModel.INSTANCE
					.registerView(name, new CorbaViewForwarder(view));
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

}
