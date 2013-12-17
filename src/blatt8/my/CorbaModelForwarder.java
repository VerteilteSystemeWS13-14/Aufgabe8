package blatt8.my;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

import blatt8.genclient.CorbaForumModel;
import blatt8.genclient.CorbaForumModelHelper;
import blatt8.genclient.CorbaForumView;
import blatt8.genclient.CorbaForumViewHelper;

import forum.framework.IForumModel;
import forum.framework.IForumView;

public final class CorbaModelForwarder implements IForumModel {

	private static final String NAME = "CorbaModelReceiver";

	private CorbaForumModel receiver;
	private POA rootpoa;

	public CorbaModelForwarder() {
		String[] args = { "-ORBInitialPort", "1050" };

		ORB orb = ORB.init(args, null);

		try {
			rootpoa = POAHelper.narrow(orb
					.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();

			NamingContextExt nameService = NamingContextExtHelper.narrow(orb
					.resolve_initial_references("NameService"));

			receiver = CorbaForumModelHelper.narrow(nameService
					.resolve_str(NAME));
		} catch (Exception e) {
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
	public void registerView(String name, IForumView forumView)
			throws AlreadyBoundException, IOException {

		org.omg.CORBA.Object ref = null;
		
		try {
			ref = rootpoa.servant_to_reference(new CorbaViewReceiver(forumView));
		} catch (ServantNotActive e) {
			e.printStackTrace();
		} catch (WrongPolicy e) {
			e.printStackTrace();
		}
		
		CorbaForumView view = CorbaForumViewHelper.narrow(ref);

		try {
			receiver.registerView(name, view);
		} catch (blatt8.genclient.AlreadyBoundException e) {
			e.printStackTrace();
		}
	}

}
