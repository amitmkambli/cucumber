@Login
Feature: login page feature

@smoke
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Automation Exercise - Signup / Login"

@Skip
Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

@smoke, @regression
Scenario: Login with correct credentials
Given user is on login page
When user enters username "testing@qa.com"
And user enters password "test@QA1234"
And user clicks on Login button
Then user gets the title of the page
And page title should be "Automation Exercise"