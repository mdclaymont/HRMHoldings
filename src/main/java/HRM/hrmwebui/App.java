package HRM.hrmwebui;

import java.util.ResourceBundle;

public class App {
   
	public int userLogin(String userId,String userPw) {
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String userName=rb.getString("CrigUserId");
		String userPass=rb.getString("CrigPassword");
		
		if(userId.equals(userName) && userPw.equals(userPass))
			return 1;
		else
			return 0;
	}
	
	
	
}
