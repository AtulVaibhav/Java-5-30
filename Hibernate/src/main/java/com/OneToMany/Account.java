package com.OneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int accountId;
   private String accountName;
   @ManyToOne
   private EmployeeInfo employee;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public EmployeeInfo getEmployee() {
	return employee;
}
public void setEmployee(EmployeeInfo employee) {
	this.employee = employee;
}
   
   
   
   
   
}
