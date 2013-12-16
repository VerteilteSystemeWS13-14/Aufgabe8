package blatt8.my;

import forum.framework.ForumServer;

public final class CorbaForumServer {

	public static void main(String[] args) {
		ForumServer server = new ForumServer(new CorbaModelReceiver());
		try {
			server.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
