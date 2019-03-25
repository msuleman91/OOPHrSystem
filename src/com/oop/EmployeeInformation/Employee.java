package com.oop.EmployeeInformation;

import java.util.ArrayList;





public class Employee {
	
	private int id;
	private String Firstname;
	private String lastName;
	private Address address;
	private Phone phone;
	
	//private Role role;
	
	ArrayList<Role> roleList = new ArrayList<Role>();
	
	
	
	public ArrayList<Role> getRoleList() {
		return roleList;
	}



	public void setRoleList(ArrayList<Role> roleList) {
		this.roleList = roleList;
	}
	
	 public Employee() {
			
			
		}



	public Employee(int id, String firstname, String lastName) {
		
		this.id = id;
		Firstname = firstname;
		this.lastName = lastName;
	}
	
	
	
public void setEmployeeAddress(Address address) {
	
	this.address=address;
}

public void setPhone(Phone phone) {
	this.phone=phone;
	
}
public int getId() {
	return id;
}
public String getFirstname() {
	return Firstname;
}
public String getLastName() {
	return lastName;
}
public void setId(int id) {
	this.id = id;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}



@Override
public String toString() {
	return "Employee [id=" + id + " , Firstname=" + Firstname + ", lastName=" + lastName + ", address=" + address.toString()
			+ ", phone=" + phone.toString() + ", roleList=" + roleList.toString() + "]";
}






}