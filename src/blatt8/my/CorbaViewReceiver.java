package blatt8.my;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

import blatt8.genclient.CorbaForumView;
import blatt8.genclient.PositionedAvatar;

import forum.framework.IForumView;

public final class CorbaViewReceiver implements CorbaForumView {

	private static final long serialVersionUID = -1266104063345053576L;
	private IForumView view;
	
	public CorbaViewReceiver(IForumView p_view)
	{
		view = p_view;
	}

	@Override
	public void notifyView(PositionedAvatar[] folks) {
		try {
			view.notifyView(getMap(folks));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Map<String, forum.framework.Position> getMap(PositionedAvatar[] folks)
	{
		Map<String, forum.framework.Position> result = new HashMap<String, forum.framework.Position>();
		for(PositionedAvatar posav : folks)
			result.put(posav.name, forum.framework.Position.getPosition(posav.position.x, posav.position.y));
		
		return result;
	}

	@Override
	public Request _create_request(Context ctx, String operation,
			NVList arg_list, NamedValue result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Request _create_request(Context ctx, String operation,
			NVList arg_list, NamedValue result, ExceptionList exclist,
			ContextList ctxlist) {
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
	public Object _get_interface_def() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Policy _get_policy(int policy_type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int _hash(int maximum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean _is_a(String repositoryIdentifier) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean _is_equivalent(Object other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean _non_existent() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void _release() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Request _request(String operation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object _set_policy_override(Policy[] policies,
			SetOverrideType set_add) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
