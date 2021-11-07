
Feature: Verify the auto generated license

	Scenario: the customer has a valid license 
	Given nothing
	When generate license
	Then license has 9 characters
