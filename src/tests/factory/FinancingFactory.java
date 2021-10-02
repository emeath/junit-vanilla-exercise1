package tests.factory;

import entities.Financing;

public class FinancingFactory {

	public static Financing createValidFinancing() {
		// Valid financing should not have totalAmount > 100000
		
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 100;
		
		return new Financing(totalAmount, income, months);
	}
}
