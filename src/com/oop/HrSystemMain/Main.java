package com.oop.HrSystemMain;

import java.util.ArrayList;
import java.util.Scanner;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import com.oop.EmployeeInformation.Address;
import com.oop.EmployeeInformation.Employee;
import com.oop.EmployeeInformation.Phone;
import com.oop.EmployeeInformation.Role;
import com.oop.HrSystemEmployeeType.Contractor;
import com.oop.HrSystemEmployeeType.FullTime;
import com.oop.hrSystem.company.Company;
import com.oop.hrSystem.company.HrSystem;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		HrSystem hrServices = new HrSystem();

		while (true) {

			System.out.println("1 - Add, 2 - Remove, 3 - Show all, 4 - Search, 5 - Exit");
			int choice = input.nextInt();
			if (choice == 1) {
				System.out.println("Enter Employee Information");

				System.out.println("Enter employee id:");
				int employeeId = input.nextInt();

				System.out.println("Enter Employee FirstName");
				String fName = input.next();

				System.out.println("Enter Employee LastName ");
				String lName = input.next();

				// Employee role Information
				System.out.println("Enter -1 for exit the Role");

				ArrayList<Role> roleList = new ArrayList<Role>();
				while (true) {

					System.out.println("Enter Role Id");
					int roleId = input.nextInt();

					if (roleId == -1) {
						break;
					}

					System.out.println("Enter Role Name");
					String roleName = input.next();
					Role role = new Role(roleId, roleName);
					roleList.add(role);
				}

				// Employee Company Information

				System.out.println("Enter Company Id");
				int companyId = input.nextInt();
				System.out.println("Enter company Name");
				String companyName = input.next();

				// Employee Phone Information

				System.out.println("Employee phone id");
				int phoneId = input.nextInt();

				System.out.println("Enter Area code");
				String areaCode = input.next();

				System.out.println("Enter Phone Number");
				String number = input.next();

				System.out.println("Enter Country Code");
				String countryCode = input.next();

				Phone phone = new Phone(phoneId, areaCode, number, countryCode);

				// Employee Address Information

				System.out.println("Enter Address ID");
				int addressID = input.nextInt();

				System.out.println("Enter employee zip");
				String zip = input.next();

				System.out.println("Enter Employee country");
				String country = input.next();

				System.out.println("Enter employee state");
				String state = input.next();

				System.out.println("Enter employee city");
				String city = input.next();

				System.out.println("enter employee line 1");
				String line1 = input.next();

				System.out.println("enter employee line 2");
				String line2 = input.next();

				Address address = new Address(addressID, zip, country, state, city, line1, line2);

				System.out.println("enter Choice 1= Contractor ,,, 2= fulltime");
				System.out.println("");
				int c = input.nextInt();

				if (c == 1) {

					System.out.println("contractor Employee Start Date:");
					String contSDate = input.next();

					DateTime start = DateTime.parse(contSDate, DateTimeFormat.forPattern("dd/mm/yyyy"));

					System.out.println(" contractor Employee Endt Date:");
					String contSEndDate = input.next();

					DateTime end = DateTime.parse(contSEndDate, DateTimeFormat.forPattern("dd/mm/yyyy"));

					System.out.println("Employee Hourly Rate");
					float hourlyRate = input.nextFloat();

					Contractor contractor = new Contractor(start, end, hourlyRate);
					contractor.setId(employeeId);
					contractor.setFirstname(fName);
					contractor.setLastName(lName);
					contractor.setPhone(phone);
					contractor.setEmployeeAddress(address);
					contractor.setRoleList(roleList);

					Company company = new Company(companyId, companyName);

					hrServices.addEmployee(contractor, company);

					System.out.println(contractor);

				} else if (c == 2) {

					// FullTime Detail

					System.out.println(" FullTime Employee Start Date:");
					String festartDate = input.next();

					DateTime start = DateTime.parse(festartDate, DateTimeFormat.forPattern("dd/mm/yyyy"));

					System.out.println(" FullTime Employee End Date:");
					String fendDate = input.next();

					DateTime end = DateTime.parse(fendDate, DateTimeFormat.forPattern("dd/mm/yyyy"));

					System.out.println("Employee full time Hourly Rate");

					float hourlyRatefull = input.nextFloat();

					FullTime fulltime = new FullTime(start, end, hourlyRatefull);
					fulltime.setId(employeeId);
					fulltime.setFirstname(fName);
					fulltime.setLastName(lName);
					fulltime.setPhone(phone);
					fulltime.setEmployeeAddress(address);
					fulltime.setRoleList(roleList);

					Company company = new Company(companyId, companyName);

					hrServices.addEmployee(fulltime, company);

					System.out.println(fulltime);
				}
			} else if (choice == 2) {
				// remove code
				System.out.println("Enter the id of the employee to be reomoved...");
				int id = input.nextInt();

				hrServices.removeEmployee(id);

			} else if (choice == 3) {
				// show all code

				for (Employee e : hrServices.getCompany().getL()) {
					System.out.println(e);
				}

			} else if (choice == 4) {
				// search code
				System.out.println("Enter the id of the employee to be search...");
				int id = input.nextInt();
				hrServices.searchEmployee(id);

			} else if (choice == 5) {
				// exit code
				break;
			}

		}

	}

}