package com.bz.employementwagecomputation.services;

import com.bz.employementwagecomputation.interfaces.IWageComputation;

public class ImplementationWageComputation implements IWageComputation {

	public void displayMessage() {
		System.out.println(" :: Welcome To Employement Wage Computation :: ");
		
	}

	public int employeesPresentFullTime() {
		int present = (int)(Math.random()*100+1);
		System.out.println("Full_Time Employees Present :: " + present + '\n');
		return present;
	}

	public int dailyFullTimeEmployeeWage(int wagePerHour, int fullDayHour, int numberOfEmployees) {
		int wagePerDay = fullDayHour * wagePerHour * numberOfEmployees;
		System.out.println("EmployementWage for a Full_Timer Per Day :: " + wagePerDay + '\n');
		return wagePerDay;
	}

	public int employeesPresentPartTime() {
		int present = (int)(Math.random()*10+20);
		System.out.println("Part_Time Employees Present :: " + present + '\n');
		return present;
	}

	public int dailyPartTimeEmployeeWage(int wagePerHour, int PartTimeHour, int numberOfEmployees) {
		int wagePerDay = PartTimeHour * wagePerHour * numberOfEmployees;
		System.out.println("EmployementWage for a Part_Timer Per Day :: " + wagePerDay + '\n');
		return wagePerDay;
	}


	

	
	

}
