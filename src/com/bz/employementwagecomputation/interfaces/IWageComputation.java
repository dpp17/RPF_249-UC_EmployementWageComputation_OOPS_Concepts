package com.bz.employementwagecomputation.interfaces;


public interface IWageComputation {

	 void displayMessage();
	 int employeesPresentFullTime();
	 int dailyFullTimeEmployeeWage(int wagePerHour, int fullDayHour, int numberOfEmployees);
	 int employeesPresentPartTime();
	 int dailyPartTimeEmployeeWage(int wagePerHour, int PartTimeHour, int numberOfEmployees);
	 int wageForMonth(int workingDays, int wagePerHour, int TimeHour);
}
