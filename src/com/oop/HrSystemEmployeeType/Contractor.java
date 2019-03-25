package com.oop.HrSystemEmployeeType;



import java.util.Date;

import javax.print.attribute.DateTimeSyntax;

import org.joda.time.DateTime;

import com.oop.EmployeeInformation.Employee;

public class Contractor extends Employee {
	
	private DateTime start;
	private DateTime end;
	private float hourlyRate;
	
	
public Contractor(DateTime start2, DateTime end2, float hourlyRate) {
		
		this.start = start2;
		this.end = end2;
		this.hourlyRate = hourlyRate;
	}
	
public Contractor() {
	
	
}

    @Override
public String toString() {
    	
	return super.toString()+ "Contractor [start=" + start + ", end=" + end + ", hourlyRate=" + hourlyRate + "]";
}

	public DateTime getStart() {
		return start;
	}

	public DateTime getEnd() {
		return end;
	}

	public float getHourlyRate() {
		return hourlyRate;
	}

	public void setStart(DateTime start) {
		this.start = start;
	}

	public void setEnd(DateTime end) {
		this.end = end;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


	
	

}
