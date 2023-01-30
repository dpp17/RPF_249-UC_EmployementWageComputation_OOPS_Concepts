package com.bz.employementwagecomputation.controller;

import java.util.Scanner;

import com.bz.employementwagecomputation.interfaces.IWageComputation;
import com.bz.employementwagecomputation.model.Computation;
import com.bz.employementwagecomputation.services.ImplementationWageComputation;

public class EmployementWageComputation {

	public static void computeEmployeeWage(int classMethodChoice) {
		if(classMethodChoice == 1 ) {
			computation.setPresentFullTime(getEmployee.employeesPresentFullTime());			
			computation.setFullTimeWage(getEmployee.dailyFullTimeEmployeeWage(computation.fullDayHour, computation.wagePerHour, computation.getPresentFullTime()));
		}else if(classMethodChoice == 2) {
			computation.setPresentPartTime(getEmployee.employeesPresentPartTime());
			System.out.println("Enter number of Working Hour:: ");
			computation.setPartTimeHour( getUserInput.nextInt());
			computation.setPartTimeWage( getEmployee.dailyPartTimeEmployeeWage(computation.getPartTimeHour(), computation.wagePerHour, computation.getPresentPartTime()));
		}
	}
	
	
	static Computation computation = new Computation();
	static IWageComputation getEmployee = new ImplementationWageComputation();
	static Scanner getUserInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		byte option = 0;
		
			
//displaying welcome message
		getEmployee.displayMessage();
		
		do {
		System.out.println(" 1.FullTime Employement Wages"+'\n'+" 2.PartTime Employement Wages"+'\n'
				+" 3.Employement Wage For A Month :: "+'\n'+" 4.Total working days or hours reached First( Total_WorkingHour = 100 && Total_Days_In_Month )"+'\n'+" 5.Use Class method to get Wage"+'\n'+" Enter option::");
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
		case 4:
			getEmployee.workingHoursOrDaysReachFirst(computation.fullDayHour);
			break;
		case 5:
			System.out.println("Perss 1: Full Time Wage ::"+'\n'+"Perss 2: Part Time Wage ::");
			int classMethodChoice = getUserInput.nextInt();
			computeEmployeeWage(classMethodChoice);
			break;
		default:
			System.err.println(" :: INVALID INPUT! try again :: ");
		}
		}while(option > 5 || option < 1);
		
		System.out.println("-->>>  Thank You for Using :: Employement Wage Computation Device ::  <<<--");
		
		
		
		
		
		
		



				
	}		
}

