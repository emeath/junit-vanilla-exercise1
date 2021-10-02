package testes.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void ConstructorShouldThrowIllegalArgumentExceptionWhenArgsAreInvalid() {
		//This test expects that an exception will be thrown 
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//    This arguments will make the test fail because they are
			//correct and will not throw an Exception
			
			/*
			double totalAmount = 100000.0;
			double income = 2000.0;
			int months = 80;
			*/
			
			double totalAmount = 100000.0;
			double income = 2000.0;
			int months = 20;
			
			Financing financing = new Financing(totalAmount, income, months);	
		});
	}
	
	@Test
	public void ConstructorShouldNotThrowIllegalArgumentExceptionWhenArgsAreCorrect() {
		
		Assertions.assertDoesNotThrow(() -> {
			double totalAmount = 100000.0;
			double income = 2000.0;
			int months = 80;
			
			Financing financing = new Financing(totalAmount, income, months);
		});
	}

}
