package com.hibernateCrudOperation;

public class Test {

	public static void main(String[] args) {
//		Employee e1 = new Employee("Harsh","development");
//		Employee e2 = new Employee("Vivek","testing");
//		Employee e3 = new Employee("Varun","development");
//		
//		System.out.println(HibernateUtil.addEmployee(e1));
//		System.out.println(HibernateUtil.addEmployee(e2));
//		System.out.println(HibernateUtil.addEmployee(e3));
		
//		for(Employee emp:HibernateUtil.getAll()){
//			System.out.println(emp.getEmpName()+" "+emp.getDeptName());
//		}
		
//		Employee emp = HibernateUtil.getEmployeeByid(1);
//		System.out.println(emp.getEmpName()+" "+emp.getDeptName());
		
//		Employee e  = new Employee("Varun","testing");
//		System.out.println(HibernateUtil.updateEmployee(3, e));
		
		System.out.println(HibernateUtil.deleteEmployee(3));
	}

}
