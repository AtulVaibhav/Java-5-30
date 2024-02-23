package com.OneToMany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setAccountName("SBI123");
		
		Account a2 = new Account();
		a2.setAccountName("PNB234");
		
		
		EmployeeInfo e1 = new EmployeeInfo();
		e1.setEmpName("Harsh");
		
		List<Account> list = Arrays.asList(a1,a2);
		e1.setAccounts(list);
		
		a1.setEmployee(e1);
		a2.setEmployee(e1);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(e1);
		session.getTransaction().commit();
		session.close();
		System.out.println("Data saved successfully");
		

	}

}
