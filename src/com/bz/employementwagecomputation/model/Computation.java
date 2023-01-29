package com.bz.employementwagecomputation.model;

public class Computation {
	
	float pi = 22/7;//constant
	private int partTime;
	private int fullTime;
	private int partTimeWage;
	
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
