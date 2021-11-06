Feature: Sell the insurance for a customer 
	Scenario: the customer is older than 80
	Given age is over 80 
	When sell the premium 
	Then show “Doesn't meet the requirements” 
	
	
	Scenario Outline: The customer is younger or older than 80
	Given age is over "<age>"  
	When sell the premium
	Then show "<answer>"
	
	Examples:
	|age   |answer|
	|85	   |Doesn't meet the requirements|
	|60    |Meet requirements|
	

Feature: Create a new customer
	Scenario: the customer is younger than 18 
	Given is an underage 
	When add a new customer 
	Then show “The age of customer has to be at least 18” 
	
	
	Scenario Outline: The customer is younger or older than 18
	Given is an  "<age>"  
	When add a new customer
	Then show "<answer>"
	
	Examples:
	|age   |answer|
	|17	   |false|
	|22    |true|
	
	
Feature: Verify the customer license 
	Scenario: the customer has an invalid license 
	Given Customer license
	When sell the premium  
	Then show “Doesn't meet the requirements” 
	
	Scenario Outline: The customer has an invalid license
	Given  "<license>"  
	When sell the premium
	Then show "<answer>"
	
	
	Examples:
	|license       |answer|
	|094959179     |Meet requirements|
	|0956788987    |Doesn't meet the requirements|

	