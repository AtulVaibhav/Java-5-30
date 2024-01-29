package com.exceptionHandling;

class StudentNotFoundException extends Exception{
	private String message;
	public StudentNotFoundException(String message){
		this.message = message;
	}
	public String getErrorMessage(){
		return this.message;
	}
}

class Student{
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
}


class StudentUtil{
	public static Student findStudentById(Student[] students, int id) throws StudentNotFoundException{
		for(int i=0;i<students.length;i++){
			if(students[i].getStudentId()==id){
				return students[i];
			}
		}
		 throw new StudentNotFoundException("Student doesn't exist");
	}
	    
}


public class ThrowsKeyword {

	public static void main(String[] args)  {
		Student s1 = new Student(101,"Harsh");
		Student s2 = new Student(103,"Aman");
		Student s3 = new Student(102,"Ankit");
		Student s4 = new Student(105,"John");
		Student s5 = new Student(104,"Vivek");
		
		
		Student[] students = {s1,s2,s3,s4,s5};
		try {
			System.out.println(StudentUtil.findStudentById(students, 106));
		} catch (StudentNotFoundException e) {
			System.out.println(e.getErrorMessage());
		}
	}

}
