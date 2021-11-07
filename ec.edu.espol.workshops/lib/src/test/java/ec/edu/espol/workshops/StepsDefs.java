
package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepsDefs {

	private int givenAge;
	private String generatedLicense;
	private boolean changeAgeResult;
	private String requirementResult;
	private CarInsurance carInsurance = new CarInsurance(0, 'M', false);

	// Set customer age
	@Given("customer age {int}")
	public void customer_age(Integer age) {
	    
		this.givenAge = age;
		
	}
	
	@When("set customer age")
	public void set_customer_age() {

		this.changeAgeResult = carInsurance.setAge(givenAge);
		
	}

	@Then("show result false")
	public void show_result_false() {
	    
		assertEquals(false, this.changeAgeResult);
		
	}
	
	//Feature: Sell the insurance for a customer
	
	@Given("age is over {int}")
	public void age_is_over(Integer age) {
	    
		this.carInsurance.setAge(age);
		
	}

	@When("sell the premium")
	public void sell_the_premium() {

		this.requirementResult = this.carInsurance.sellInsurance();
		
	}

	@Then("show sell message {string}")
	public void show_sell_message(String string) {
	    
		assertEquals(string, this.requirementResult);
		
	}

	// Verify the auto generated license
	@Given("nothing")
	public void auto_generated_license() {
	 
	}

	@When("generate license")
	public void generate_license() {
		
		this.generatedLicense = this.carInsurance.generateLicense();
		
	}
	
	@Then("license has {int} characters")
	public void license_has_characters(int licenseLength) {
	    
		assertEquals(licenseLength, this.generatedLicense.length());
		
	}
	
}
