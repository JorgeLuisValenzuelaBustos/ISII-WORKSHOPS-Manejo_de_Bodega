
Feature: Verify the auto generated license

	Scenario: the customer has an invalid license 
	Given nothing
	When generate license
	Then license has 9 characters
