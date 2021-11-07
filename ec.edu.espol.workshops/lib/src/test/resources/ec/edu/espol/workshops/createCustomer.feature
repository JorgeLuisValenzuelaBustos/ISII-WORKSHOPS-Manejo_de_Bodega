
Feature: Set customer age

	Scenario: the customer is younger than 18
	Given customer age 16
	When set customer age
	Then show result false
