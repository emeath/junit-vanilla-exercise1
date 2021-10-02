package tests.factory;

import entities.Financing;

public class FinancingFactory {

	public static Financing createValidFinancing() {
		// Business Rule: quota should not be greater then half of income
		// Valid financing should not have totalAmount > 100.000
		// Valid financing should not have income < 2.000
		// Valid financing should not have month < 80
		
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		
		return new Financing(totalAmount, income, months);
	}
}
