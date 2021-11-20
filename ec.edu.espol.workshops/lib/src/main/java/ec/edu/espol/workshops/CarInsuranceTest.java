package ec.edu.espol.workshops;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarInsuranceTest {

	@Test
	public void testCalculatePremiumMaleMarried() {
		CarInsurance insurance = new CarInsurance(30,'M', true);
		assertEquals(300,insurance.calculatePremium(),0);
	}
	
	@Test
	public void testCalculatePremiumMaleSingle() {
		CarInsurance insurance = new CarInsurance(20,'M', false);
		assertEquals(2000,insurance.calculatePremium(),0);
	}
	
	@Test
	public void testCalculatePremiumFemale() {
		CarInsurance insurance = new CarInsurance(30,'F', false);
		assertEquals(300,insurance.calculatePremium(),0);
	}
}
