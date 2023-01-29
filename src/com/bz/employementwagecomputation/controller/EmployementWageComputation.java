package com.bz.employementwagecomputation.controller;

import com.bz.employementwagecomputation.interfaces.IWageComputation;
import com.bz.employementwagecomputation.services.ImplementationWageComputation;

public class EmployementWageComputation {

	public static void main(String[] args) {
		
		IWageComputation getEmployee = new ImplementationWageComputation();
//		superclass name = new subclass();
			
		getEmployee.displayMessage();
		
	}

}
