package string;

public class PersonsPassword {

	private String password;
	
	public PersonsPassword() {
		password="1aaaaa?!";
	}
	
	public boolean setPassword(String setPass) {
		boolean answer= false;
		do {
		if (password.length()>7 && password.length()<22) {
			if(!password.contains(" ")) {
				if(password.contains("!") && password.contains("?")) {
					if(password.charAt(0)<10) {
						password=setPass;
						answer= true;
					}}}}
		else {
			System.out.println("A try again");
		}
		}while(answer!=true);
		return answer;
	}
	
	public boolean matchPass(String xpass) {
		boolean answer = false;
		if(password.compareTo(xpass)==0) {
		 answer= true;
	}
		return answer;
	}
	
	//
}
