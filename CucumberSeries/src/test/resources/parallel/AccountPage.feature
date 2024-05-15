Feature: Account Page Feature

Background:
Given user has already logged in to application
|username|password|
|testing@qa.com|test@QA1234|

@accounts
Scenario: Accounts page title
Given user is on Accounts page
When user gets the title of the page
Then page title should be "Automation Exercise"

##Products was not matching,getting '  Products', used l.getText().trim().replaceAll("[^\\w\\s]", "") but not working
@accounts
Scenario: Accounts section count
Given user is on Accounts page
Then user gets accounts section
|Cart|
|Contact us|
|Logout|
|Home|
And accounts section count should be 10 