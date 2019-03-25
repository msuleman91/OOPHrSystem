package com.oop.HrSystemEmployeeType;

import org.joda.time.DateTime;

import com.oop.EmployeeInformation.Employee;

public class FullTime extends Employee{
	
	DateTime dateTimeStart;
	DateTime dateTimeEnd;
	float hourlyRate;
	

	

	public FullTime (DateTime dateTimeStart, DateTime dateTimeEnd, float hourlyRate) {
		
		this.dateTimeStart = dateTimeStart;
		this.dateTimeEnd = dateTimeEnd;
		this.hourlyRate = hourlyRate;
		
	}
	
	
public FullTime() {
		
		
	}
	
	@Override
public String toString() {
	return super.toString()+ "FullTime [dateTimeStart=" + dateTimeStart + ", dateTimeEnd=" + dateTimeEnd + ", hourlyRate=" + hourlyRate
			+ "]";
}


	public DateTime getDateTimeStart() {
		return dateTimeStart;
	}


	public DateTime getDateTimeEnd() {
		return dateTimeEnd;
	}


	public float getHourlyRate() {
		return hourlyRate;
	}


	public void setDateTimeStart(DateTime dateTimeStart) {
		this.dateTimeStart = dateTimeStart;
	}


	public void setDateTimeEnd(DateTime dateTimeEnd) {
		this.dateTimeEnd = dateTimeEnd;
	}


	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


	
	

}
