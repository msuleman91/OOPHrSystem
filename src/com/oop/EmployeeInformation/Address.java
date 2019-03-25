package com.oop.EmployeeInformation;

public class Address { 
	
	private int addressId;
	private String zip;
	private String country;
	private String state;
	private String city;
	private String line1;
	private String line2;
	
	
	
	public Address(int id, String zip, String country, String city, String line1, String line2, String line22) {
		
		this.addressId = id;
		this.zip = zip;
		this.country=country;
		this.state = state;
		this.city = city;
		this.line1 = line1;
		this.line2 = line2;
	}


	public String getZip() {
		return zip;
	}
	public String getCountry() {
		return country;
	}
	public String getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getLine1() {
		return line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}


	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", city=" + city + ", line1=" + line1 + ", line2="
				+ line2 + ", zip=" + zip + "]";
	}
	
	
	
}
