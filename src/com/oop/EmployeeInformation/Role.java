package com.oop.EmployeeInformation;

import java.util.ArrayList;

public class Role {
	

	
	
	private int id;
	private String name;
	
	ArrayList<Role> role= new ArrayList<Role>();
	
	public Role(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Role [id=" + id + ", name=" + name +  "]";
}




}