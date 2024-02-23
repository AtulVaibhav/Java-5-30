package com.hibernateCrudOperation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
   private static SessionFactory factory = null;
   
   private static SessionFactory getSessionFactory(){
	   if(factory==null){
		   factory = new Configuration().configure().buildSessionFactory();   
	   }
	   return factory;
   }
   
   //add employee
   public static String addEmployee(Employee emp){
	   Session session = getSessionFactory().openSession();
	   session.beginTransaction();
	   session.save(emp);
	   session.getTransaction().commit();
	   session.close();
	   return "Employee added successfully";
   }
   
   //getAllEmployee
   public static List<Employee> getAll(){
	   String hql = "from Employee";
	   Session session = getSessionFactory().openSession();
	   Query<Employee> query = session.createQuery(hql);
	   return query.list();
	   
   }
   
   //getEmployeebyId
   public static Employee getEmployeeByid(int empId){
	   Session session = getSessionFactory().openSession();
	   return session.get(Employee.class, empId);
   }
   
   //update employee
   public static String updateEmployee(int empId,Employee emp){
	   Session session = getSessionFactory().openSession();
	   Employee storedEmp = session.get(Employee.class, empId);
	   if(storedEmp!=null){
		   storedEmp.setEmpName(emp.getEmpName());
		   storedEmp.setDeptName(emp.getDeptName());
		   session.beginTransaction();
		   session.save(storedEmp);
		   session.getTransaction().commit();
		   return "Employee updated successfully";
		   }
	   return "Something went wrong";
   }
   //delete emplyee by id
   public static String deleteEmployee(int id){
	   Session session = getSessionFactory().openSession();
	   Employee emp=session.get(Employee.class, id);
	   if(emp!=null){
		   session.beginTransaction();
		   session.delete(emp);
		   session.getTransaction().commit();
		   return "Employee deleted successfully";
	   }
	   return "Something went wrong";
   }
   
   
   
}
