package com.ManyToMany;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Course c1 = new Course();
		c1.setCourseName("Java");
		
		Course c2 = new Course();
		c2.setCourseName("WebDevelopment");
		
		Course c3 = new Course();
		c3.setCourseName("CloudComputing");
		
		
		Student s1 = new Student();
		s1.setStudentName("Harsh");
		
		Student s2 = new Student();
		s2.setStudentName("Varun");
		
		
		Student s3 = new Student();
		s3.setStudentName("Yug");
		
		
		//list of courses
		List<Course> list1 = Arrays.asList(c1,c2);
		List<Course> list2 = Arrays.asList(c1,c3);
		List<Course> list3 = Arrays.asList(c2,c3);
		
		
		//list of students
		List<Student> st1  = Arrays.asList(s1,s2);
		List<Student> st2  = Arrays.asList(s1,s3);
		List<Student> st3  = Arrays.asList(s2,s3);
		
		c1.setStudents(st1);
		c2.setStudents(st2);
		c3.setStudents(st3);
		
		
		
		s1.setCourses(list1);
		s2.setCourses(list2);
		s3.setCourses(list3);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
		session.getTransaction().commit();
		session.close();
		
		
		
		
	}

}
