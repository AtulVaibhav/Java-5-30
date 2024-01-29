package com.exceptionType;

import java.sql.DriverManager;
import java.sql.Statement;

//checked exceptions need to be handled(mandatory)

//custom exception
class DataNotFoundException extends Exception{
	
}
public class CheckedException {
   public static void getConnection(){
	   //Class.forName("com.mysql.jdbc.Driver");
	   //throw new DataNotFoundException();
	   //String str="insert into employee values(1,'Harsh')";
	  // Statement stmt = (Statement) DriverManager.getConnection("jdbc:mysql://localhost:3306/userDb","root","root");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
