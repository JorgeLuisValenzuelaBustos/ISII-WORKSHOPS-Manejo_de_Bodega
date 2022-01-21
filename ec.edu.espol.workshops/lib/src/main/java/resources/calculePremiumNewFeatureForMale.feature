Feature: Sell the insurance for a customer
 
	Scenario: the customer is mature
	Given age is over 30
	Given age is below 60
	Given married is true
	Given sex is M
	When calculate Premium
	Then show "400"
