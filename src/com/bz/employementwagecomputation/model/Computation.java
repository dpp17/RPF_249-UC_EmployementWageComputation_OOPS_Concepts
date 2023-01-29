package com.bz.employementwagecomputation.model;

public class Computation {
	
	public final int wagePerHour = 20;
	public final int fullDayHour = 8;
	public final int PartTimeHour = 8;
	private int partTime;
	private int fullTime;
	private int partTimeWage;
	private int present;
	
	public int getPresent() {
		return present;
	}
	public void setPresent(int present) {
		this.present = present;
	}
	public int getPartTime() {
		return partTime;
	}
	public int getPartTimeWage() {
		return partTimeWage;
	}
	public void setPartTimeWage(int partTimeWage) {
		this.partTimeWage = partTimeWage;
	}
	public void setPartTime(int partTime) {
		this.partTime = partTime;
	}
	public int getFullTime() {
		return fullTime;
	}
	public void setFullTime(int fullTime) {
		this.fullTime = fullTime;
	}
	

}
