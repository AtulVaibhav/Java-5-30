package com.primaryKeyGeneration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	  Student s1 = new Student();
	  s1.setStudentName("Varun");
		
	 
	  Configuration cfg = new Configuration();
	  SessionFactory factory = cfg.configure().buildSessionFactory();
	  Session session = factory.openSession();
	  session.beginTransaction();
	  session.save(s1);
	  session.getTransaction().commit();
	  System.out.println("Data saved successfully");
	  
	  
	  
	}

}
