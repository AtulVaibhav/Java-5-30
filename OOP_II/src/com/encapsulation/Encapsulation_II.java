package com.encapsulation;

class UserEntity{
	private final int userId = 100;
	private final String userName = "atul";
	public final String userPassword = "atul123";
	
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	
	
}


public class Encapsulation_II {

	public static void main(String[] args) {
		UserEntity entity = new UserEntity();
		System.out.println(entity.getUserId());
		System.out.println(entity.getUserName());
		System.out.println(entity.getUserPassword());
        
		//entity.userPassword = "345";
	}

}
