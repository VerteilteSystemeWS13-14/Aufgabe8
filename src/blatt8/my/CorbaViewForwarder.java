package blatt8.my;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import blatt8.genserver.CorbaForumView;
import blatt8.genserver.PositionedAvatar;


import forum.framework.IForumView;
import forum.framework.Position;

public final class CorbaViewForwarder implements IForumView {

	private CorbaForumView view;
	
	public CorbaViewForwarder(CorbaForumView p_view)
	{
		view = p_view;
	}
	
	@Override
	public void notifyView(Map<String, Position> arg0) throws IOException {
		view.notifyView(getArray(arg0));
	}
	
	private PositionedAvatar[] getArray(Map<String, Position> arg0)
	{
		ArrayList<PositionedAvatar> result = new ArrayList<PositionedAvatar>(arg0.size());
		for(Map.Entry<String, Position> entry : arg0.entrySet())
			result.add(new PositionedAvatar(entry.getKey(), new blatt8.genserver.Position( entry.getValue().getX() , entry.getValue().getY()) ));
		
		return result.toArray(new PositionedAvatar[result.size()]);
	}

}
