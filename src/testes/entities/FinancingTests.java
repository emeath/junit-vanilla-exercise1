package testes.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenArgsAreInvalid() {
		// This test expects that an exception will be thrown

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			// This arguments will make the test fail because they are
			// correct and will not throw an Exception

			double totalAmount = 100000.0;
			double income = 2000.0;
			int months = 20;

			Financing financing = new Financing(totalAmount, income, months);
		});
	}
	
	@Test
	public void constructorShouldNotThrowIllegalArgumentExceptionWhenArgsAreCorrect() {

		Assertions.assertDoesNotThrow(() -> {
			double totalAmount = 100000.0;
			double income = 2000.0;
			int months = 80;

			Financing financing = new Financing(totalAmount, income, months);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateAmountWhenDataIsValid() {
		Financing financing = FinancingFactory.createValidFinancing();
		double expectedTotalAmount = 80000.0;

		financing.setTotalAmount(expectedTotalAmount);

		Assertions.assertEquals(expectedTotalAmount, financing.getTotalAmount());

		Assertions.assertDoesNotThrow(() -> {
			financing.setTotalAmount(expectedTotalAmount);
		});
	}

	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenDataIsNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = FinancingFactory.createValidFinancing();
			financing.setTotalAmount(1000000.0);
		});
	}

	@Test
	public void setIncomeShouldUpdateFinancingIncomeWhenDataIsValid() {
		Financing financing = FinancingFactory.createValidFinancing();
		double expectedIncome = 4000.0;
		
		financing.setIncome(expectedIncome);
		
		Assertions.assertEquals(expectedIncome, financing.getIncome());
		
		Assertions.assertDoesNotThrow(() -> {
			financing.setIncome(expectedIncome + 9);
		});
		
	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenDataIsNotValid() { 
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = FinancingFactory.createValidFinancing();
			financing.setIncome(1000.0);
		});
	}
}