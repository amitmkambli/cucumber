#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@All
Feature: Uber Booking Feature

## Right click on project -> configure -> convert to cucumber project
## unimplemented steps will highlighted in yellow, to go to method press control and click on the step
##below is a tag
@Smoke
Scenario: Booking Cab Sedan
Given User wants to book a car type "sedan" fom ubber app
When User selects car type "sedan" and pick up point from "Bangalore" and drop location "Pune"
Then Driver starts the journey 
And Driver ends the jpurney
Then User pays 1000 USD

@Regression
Scenario: Booking Cab SUV
Given User wants to book a car type "suv" fom ubber app
When User selects car type "sedan" and pick up point from "Bangalore" and drop location "Hyderabad"
Then Driver starts the journey 
And Driver ends the jpurney
Then User pays 1000 USD

@Smoke @Regression
Scenario: Booking Cab Mini
Given User wants to book a car type "mini" fom ubber app
When User selects car type "sedan" and pick up point from "Pune" and drop location "Mumbai"
Then Driver starts the journey 
And Driver ends the jpurney
Then User pays 1000 USD