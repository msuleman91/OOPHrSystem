package com.HrService;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.oop.EmployeeInformation.Employee;
import com.oop.hrSystem.company.Company;
import com.oop.hrSystem.company.HrSystem;

public class HrServiceTest {

	@Test
	public void test() {
		HrSystem hrService = new HrSystem();
		Employee employee = new EmployeeFixture().createEmployeeWithAllValues();
		Company company = new Company(1, "ABC");

		hrService.addEmployee(employee, company);
		assertEquals(employee, hrService.getCompany().getL().get(0));
	}

	@Test
	public void removeTest() {

		HrSystem hrService = new HrSystem();
		Employee employee = new EmployeeFixture().createEmployeeWithAllValues();
		Company company = new Company(1, "ABC");
		hrService.addEmployee(employee, company);
		hrService.removeEmployee(employee.getId());
		assertEquals(null, hrService.getCompany().getL());
	}

	@Test
	public void searchTest() {

		HrSystem hrService = new HrSystem();
		Employee employee = new EmployeeFixture().createEmployeeWithAllValues();
		Company company = new Company(1, "ABC");
		hrService.addEmployee(employee, company);
		hrService.searchEmployee(employee.getId());
		assertEquals(null, hrService.getCompany().getL());
	}

}
