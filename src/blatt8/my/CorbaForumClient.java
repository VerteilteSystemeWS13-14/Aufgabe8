package blatt8.my;

import forum.framework.ForumClient;

public final class CorbaForumClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ForumClient client = new ForumClient(new CorbaModelForwarder(args));
			client.register();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
