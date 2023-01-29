package com.bz.employementwagecomputation.controller;

import java.util.Scanner;

import com.bz.employementwagecomputation.interfaces.IWageComputation;
import com.bz.employementwagecomputation.model.Computation;
import com.bz.employementwagecomputation.services.ImplementationWageComputation;

public class EmployementWageComputation {

	static Computation computation = new Computation();
	public static void main(String[] args) {
		Scanner getUserInput = new Scanner(System.in);
		byte option = 0;
		IWageComputation getEmployee = new ImplementationWageComputation();
			
//displaying welcome message
		getEmployee.displayMessage();
		
		do {
		System.out.println(" 1.FullTime Employement Wages"+'\n'+" 2.PartTime Employement Wages"+'\n'+" 3.Employement Wage For A Month :: "+'\n'+" Enter option::");
		option = getUserInput.nextByte();
		switch(option) {
		case 1:	
//number of employees present per day
			computation.setPresentFullTime(getEmployee.employeesPresentFullTime());
//wage for single employee per day
			computation.setFullTimeWage(getEmployee.dailyFullTimeEmployeeWage(computation.fullDayHour, computation.wagePerHour, computation.getPresentFullTime()));
			break;
		case 2:
//number of employees present per day
			computation.setPresentPartTime(getEmployee.employeesPresentPartTime());
//wage for single employee per day
			System.out.println("Enter number of Working Hour:: ");
			computation.setPartTimeHour( getUserInput.nextInt());
			computation.setPartTimeWage( getEmployee.dailyPartTimeEmployeeWage(computation.getPartTimeHour(), computation.wagePerHour, computation.getPresentPartTime()));
		break;
//Employement_Wage for a Month
		case 3:
			System.out.println("Press 1. For FullTime Employement Wages For A Month"+'\n'+"Press 2. For PartTime Employement Wages For A Month");
			byte choice = getUserInput.nextByte();
			if(choice == 1) {
				computation.setWageForMonth(getEmployee.wageForMonth(20, computation.wagePerHour, computation.fullDayHour));
			}else if(choice ==2) {
				computation.setWageForMonth(getEmployee.wageForMonth(20, computation.wagePerHour, computation.fullDayHour));
			}
			break;
		default:
			System.err.println(" :: INVALID INPUT! try again :: ");
		}
		}while(option > 3 || option < 1);
		
		System.out.println("-->>>  Thank You for Using :: Employement Wage Computation Device ::  <<<--");
		
		
		
		
		
		
		



				
	}		
}

