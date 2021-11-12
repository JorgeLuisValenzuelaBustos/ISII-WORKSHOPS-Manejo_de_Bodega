package ec.edu.espol.workshops;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassCarInsuranceTest {

	@Test
	public void testCalculatePremiumTC1() {
		CarInsurance insurance = new CarInsurance(40,'M', false);
		assertEquals(-1, insurance.calculatePremium(), 0);
	}
	
	@Test
	public void testCalculatePremiumTC2() {
		CarInsurance insurance = new CarInsurance(17,'F', false);
		assertEquals(300, insurance.calculatePremium(), 0);
	}
	
	@Test
	public void testCalculatePremiumTC3() {
		CarInsurance insurance = new CarInsurance(81,'M', true);
		assertEquals(300, insurance.calculatePremium(), 0);
	}
	
	@Test
	public void testCalculatePremiumTC4() {
		CarInsurance insurance = new CarInsurance(55,'M', false);
		assertEquals(400, insurance.calculatePremium(), 0);
	}
	
	@Test
	public void testCalculatePremiumTC5() {
		CarInsurance insurance = new CarInsurance(20,'M', false);
		assertEquals(2000, insurance.calculatePremium(), 0);
	}


}
