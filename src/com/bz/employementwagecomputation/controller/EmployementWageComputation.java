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
		computation.setPresentFullTime(getEmployee.employeesPresentFullTime());
		System.out.println("Full_Time Employees Present :: " + computation.getPresentFullTime() + '\n');

//wage for single employee per day
		computation.setFullTimeWage(getEmployee.dailyFullTimeEmployeeWage(computation.fullDayHour, computation.wagePerHour, 1));
		System.out.println("EmployementWage for a Full_Timer Per Day :: " + computation.getFullTimeWage() + '\n');

//number of employees present per day
		computation.setPresentPartTime(getEmployee.employeesPresentPartTime());
		System.out.println("Part_Time Employees Present :: " + computation.getPresentPartTime() + '\n');

//wage for single employee per day
		computation.setPartTimeWage(getEmployee.dailyPartTimeEmployeeWage(computation.partTimeHour, computation.wagePerHour, 1));
		System.out.println("EmployementWage for a Part_Timer Per Day :: " + computation.getPartTimeWage() + '\n');
				
	}		
}

