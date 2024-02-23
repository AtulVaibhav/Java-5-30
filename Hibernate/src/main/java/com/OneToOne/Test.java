package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Department d1 = new Department();
		d1.setDeptName("development");
		
		Department d2 = new Department();
		d2.setDeptName("testing");
		
		
		Employee e1 = new Employee();
		e1.setEmpName("Varun");
		
		Employee e2 = new Employee();
		e2.setEmpName("Vivek");
		
		e1.setDeparment(d1);
		e2.setDeparment(d2);
		
		d1.setEmployee(e1);
		d2.setEmployee(e2);
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(d1);
		session.save(d2);
		session.getTransaction().commit();
		session.close();
		System.out.println("data saved successfully");
		
			
		
		
		
		
		

	}

}
