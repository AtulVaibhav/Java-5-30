package com.encapsulation;

class UserData{
	private int userId;
	private String userName;
	private String userPassword;
	
	public void setUserId(int userId){
		this.userId = userId;
	}
	
	public int getUserId(){
		return this.userId;
	}
	
	public void setUserName(String userName){
		this.userName =userName; 
	}
	
	public String getUserName(){
		return this.userName;
	}
	
	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}
	
	public String getUserPassword(){
		return this.userPassword;
	}
	
}


public class Encapsulation {

	public static void main(String[] args) {
		UserData user = new UserData();
		user.setUserId(100);
		System.out.println(user.getUserId());
		
		user.setUserName("atul");
		System.out.println(user.getUserName());
		
		user.setUserPassword("atul123");
		System.out.println(user.getUserPassword());
		
		user.setUserPassword("123");
		System.out.println(user.getUserPassword());
		
		

	}

}
