Feature: Sell the insurance for a customer
 
	Scenario: the customer is older
	Given age is over 60
	Given married is false
	Given sex is F
	When calculate Premium
	Then show "450"
	
