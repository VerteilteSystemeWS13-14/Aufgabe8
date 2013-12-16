package blatt8.my;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import blatt8.genserver.PositionedAvatar;
import blatt8.genserver.CorbaForumViewPOA;

import forum.framework.IForumView;

public final class CorbaViewReceiver extends CorbaForumViewPOA {

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


	

	
}
