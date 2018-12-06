package string;

public class BestFriends {

	private String friend1;
	private String friend2;
	private String friend3;
	
	public BestFriends() {
		friend1="Bob Smith";
		friend2="Judy Jones";
		friend3="Billy Miller";
	}
	
	public void changeFriends(int xFriend, String name) {
		for(int i=1; i<=3; i++) {
			if(xFriend==i) {
				if(name.contains(" ")) {
					friend1=name;
					System.out.println("Successful");
				}
				else
				System.out.println("Not Successful");
				}}
		}
	
//Needed
}
