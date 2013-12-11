package blatt8.my;

import forum.framework.ForumServer;

public final class CorbaForumServer {

	public static void main(String[] args) {
		
		CorbaModelReceiver receiver = new CorbaModelReceiver();
		receiver.args = args;
		ForumServer server = new ForumServer(receiver);
		
		try {
			server.run();
			System.out.println("Server up and running.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
