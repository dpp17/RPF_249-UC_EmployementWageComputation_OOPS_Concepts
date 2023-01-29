package com.bz.employementwagecomputation.interfaces;


public interface IWageComputation {

	 void displayMessage();
	 int employeesPresentFullTime();
	 int dailyFullTimeEmployeeWage(int wagePerHour, int fullDayHour, int numberOfEmployees);

}
