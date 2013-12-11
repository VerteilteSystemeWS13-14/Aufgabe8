package blatt8.my;

import org.omg.CORBA.Context;
import org.omg.CORBA.ContextList;
import org.omg.CORBA.DomainManager;
import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;
import org.omg.CORBA.Object;
import org.omg.CORBA.Policy;
import org.omg.CORBA.Request;
import org.omg.CORBA.SetOverrideType;

import blatt8.gen.AlreadyBoundException;
import blatt8.gen.CorbaForumModel;
import blatt8.gen.CorbaForumModelPOA;
import blatt8.gen.CorbaForumView;
import blatt8.gen.NotBoundException;

public final class CorbaModelReceiver extends CorbaForumModelPOA implements CorbaForumModel, Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3864483516539048189L;

	@Override
	public void registerView(String name, CorbaForumView view)
			throws AlreadyBoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deregisterView(String name) throws NotBoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveNorth(String name) throws NotBoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveEast(String name) throws NotBoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveSouth(String name) throws NotBoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void moveWest(String name) throws NotBoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public Request _create_request(Context arg0, String arg1, NVList arg2,
			NamedValue arg3) {
		// TODO Auto-generated method stub
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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
