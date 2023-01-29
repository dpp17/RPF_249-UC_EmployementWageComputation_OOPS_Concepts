package com.bz.employementwagecomputation.services;

import com.bz.employementwagecomputation.interfaces.IWageComputation;

public class ImplementationWageComputation implements IWageComputation {

	public void displayMessage() {
		System.out.println(" :: Welcome To Employement Wage Computation :: ");
		
	}

	public int employeesPresentFullTime() {
		int present = (int)(Math.random()*100+1);
		return present;
	}

	public int dailyFullTimeEmployeeWage(int wagePerHour, int fullDayHour, int numberOfEmployees) {
		int wagePerDay = fullDayHour * wagePerHour * numberOfEmployees;
		return wagePerDay;
	}


	

	
	

}
