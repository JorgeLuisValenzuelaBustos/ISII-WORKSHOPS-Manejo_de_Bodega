
Feature: Sell the insurance for a customer
 
	Scenario: the customer is older
	Given age is over 81
	When sell the premium 
	Then show sell message "Doesn't meet the requirements"
