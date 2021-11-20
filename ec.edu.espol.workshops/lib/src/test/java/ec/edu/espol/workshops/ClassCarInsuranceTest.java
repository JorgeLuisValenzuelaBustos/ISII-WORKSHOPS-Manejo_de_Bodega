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
	
	@Test
	public void ageBoundariesTrue() {
		
		CarInsurance insurance = new CarInsurance(30,'F', false);
		assertEquals(true,insurance.setAge(18));
		assertEquals(true,insurance.setAge(19));
		assertEquals(true,insurance.setAge(80));
		assertEquals(true,insurance.setAge(79));
		
	}
	
	@Test
	public void ageBoundariesFalse() {
		
		CarInsurance insurance = new CarInsurance(30,'F', false);
		assertEquals(false,insurance.setAge(17));
		assertEquals(false,insurance.setAge(81));
	}
	
	@Test
	public void basePriceBoundariesTrue() {
		
		CarInsurance insurance = new CarInsurance(17,'F', true);
		assertEquals(300, insurance.calculatePremium(), 0);
		insurance = new CarInsurance(45,'M', false);
		assertEquals(400, insurance.calculatePremium(), 0);
		insurance = new CarInsurance(20,'M', false);
		assertEquals(2000, insurance.calculatePremium(), 0);
		insurance = new CarInsurance(80,'M', false);
		assertEquals(-1, insurance.calculatePremium(), 0);
	}
	
	@Test
	public void basePriceBoundariesFalse() {
		
		CarInsurance insurance = new CarInsurance(90,'M', false);
		assertEquals(-1, insurance.calculatePremium(), 0);
		insurance = new CarInsurance(85,'M', false);
		assertEquals(-1, insurance.calculatePremium(), 0);
		
	}
	
	@Test
	public void licenseLenghtBoundarieTrue() {
		
		CarInsurance insurance = new CarInsurance(90, 'M', false);
		assertEquals(9, insurance.generateLicense().length());
		
	}
	
	@Test
	public void licenseLenghtBoundarieFalse() {
		
		CarInsurance insurance = new CarInsurance(90, 'M', false);
		assertEquals(false, insurance.generateLicense().length() == 8);
		assertEquals(false, insurance.generateLicense().length() == 7);
		assertEquals(false, insurance.generateLicense().length() == 11);
		assertEquals(false, insurance.generateLicense().length() == 10);
		assertEquals(false, insurance.generateLicense().length() == 12);
		
	}
	
}
