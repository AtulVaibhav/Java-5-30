package com.association;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Address a1 = new Address();
		a1.setCity("Bangalore");
		a1.setState("Karnataka");
		
		Employee e1 = new Employee();
		e1.setEmpName("Harsh");
		e1.setAddress(a1);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(e1);
		session.getTransaction().commit();
		session.close();
		
		
		
		
		
		
		
		
		
		

	}

}
