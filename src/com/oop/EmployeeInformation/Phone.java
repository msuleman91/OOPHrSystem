package com.oop.EmployeeInformation;

public class Phone {

	private int id;
	private String areaCode;
	private String number;
	private String countryCode;
	
	public Phone(int id, String areaCode, String number, String countryCode) {
		
		this.id = id;
		this.areaCode = areaCode;
		this.number = number;
		this.countryCode = countryCode;
	}

	
	
	

	public int getId() {
		return id;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getNumber() {
		return number;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}





	@Override
	public String toString() {
		return "Phone [id=" + id + ", areaCode=" + areaCode + ", number=" + number + ", countryCode=" + countryCode
				+ "]";
	}
	
	
	
}