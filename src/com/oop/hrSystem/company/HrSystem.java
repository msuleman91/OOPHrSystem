package com.oop.hrSystem.company;

import java.util.Iterator;

import com.oop.EmployeeInformation.Employee;

public class HrSystem {

	Company company;
	Employee employee;

	public Company getCompany() {

		return company;

	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void removeEmployee(int id) {
		Iterator itr = company.getL().iterator();

		while (itr.hasNext()) {

			if (((Employee) itr.next()).getId() == id)
				itr.remove();

		}
		if(company.getL().isEmpty()) {
			company.setL(null);
		}
		
	}

	public void searchEmployee(int id) {

		Iterator<Employee> itr = company.getL().iterator();

		while (itr.hasNext()) {

			Employee employee = itr.next();

			if (employee.getId() == id) {

				System.out.println(employee);

			}
			
			}

		}
	

	public void addEmployee(Employee e, Company c) {

		this.company = c;

		c.getL().add(e);

	}

}
