package com.HrService;

import com.oop.EmployeeInformation.Employee;
import com.oop.EmployeeInformation.Phone;

public class EmployeeFixture {
	
	public Employee createEmployeeWithAllValues(){
		
		Employee employee=new Employee (1,"Muhammad","Suleman");
		
		Phone phone = new PhoneFixture().createPhoneWithAllValues();
		employee.setPhone(phone);
		
		
		return employee;
	}

	public Employee createEmployeeNoAddress() {
		
		return null;
	}
	
}
