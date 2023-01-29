package com.bz.employementwagecomputation.controller;

import com.bz.employementwagecomputation.interfaces.IWageComputation;
import com.bz.employementwagecomputation.model.Computation;
import com.bz.employementwagecomputation.services.ImplementationWageComputation;

public class EmployementWageComputation {

	static Computation computation = new Computation();
	public static void main(String[] args) {
		
		IWageComputation getEmployee = new ImplementationWageComputation();
			
//displaying welcome message
		getEmployee.displayMessage();
		
//number of employees present per day
		computation.setPresent(getEmployee.employeesPresentFullTime());
		System.out.println("Fill_Time Employees Present :: " + computation.getPresent() + '\n');

//wage for single employee per day
		System.out.println("EmployementWage Per Day :: " + getEmployee.dailyFullTimeEmployeeWage(computation.wagePerHour, computation.fullDayHour, 1) + '\n');

		
		
		
	}

	private static Computation getComputation(){
		


		return computation;
		
	}
}
