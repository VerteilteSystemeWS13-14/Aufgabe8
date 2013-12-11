package blatt8.my;

import forum.framework.ForumClient;

public final class CorbaForumClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CorbaModelForwarder forwarder = new CorbaModelForwarder();
			forwarder.args = args;
			ForumClient client = new ForumClient(new CorbaModelForwarder());
			client.register();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
