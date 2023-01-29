package com.bz.employementwagecomputation.model;

public class Computation {
	
	public final int wagePerHour = 20;
	public final int fullDayHour = 8;
	public final int partTimeHour = 8;
	private int fullTimeWage;
	private int partTimeWage;
	private int presentPartTime;
	private int presentFullTime;
	
	
	public int getPresentPartTime() {
		return presentPartTime;
	}
	public void setPresentPartTime(int presentPartTime) {
		this.presentPartTime = presentPartTime;
	}
	public int getPresentFullTime() {
		return presentFullTime;
	}
	public void setPresentFullTime(int presentFullTime) {
		this.presentFullTime = presentFullTime;
	}
	public int getPartTimeWage() {
		return partTimeWage;
	}
	public void setPartTimeWage(int partTimeWage) {
		this.partTimeWage = partTimeWage;
	}
	public int getFullTimeWage() {
		return fullTimeWage;
	}
	public void setFullTimeWage(int fullTimeWage) {
		this.fullTimeWage = fullTimeWage;
	}
	

}
