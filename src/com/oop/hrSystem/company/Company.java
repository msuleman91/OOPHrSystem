package com.oop.hrSystem.company;

import java.util.ArrayList;
import java.util.List;

import com.oop.EmployeeInformation.Employee;



public class Company {
	
	private int companyId;
	private String companyName;
	
	public Company(int companyId, String companyName) {
		
		this.companyId = companyId;
		this.companyName = companyName;
		
	}


	

List<Employee> employeList = new ArrayList<Employee>();
	
	
	public List<Employee> getL() {
		return employeList;
	}


	public void setL(List<Employee> l) {
		this.employeList = l;
	}


	
	

}
