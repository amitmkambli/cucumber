Feature: Amazon order page
  In order to check my order details
  As a registered user
  I want to specify the features of orders details page

##to add repetative steps and improve feature file readibility
##when we run feature file we will get empty methods for background also. We will have to implement them.
##when we run the test each of the backgound method will be excuted before the scenario
 	Background:
	  Given a registered user exists
		Given user is on Amazon login page
		When user enters user name 
		And user enters password
		And clicks login button
		Then user navigates to orders page

  Scenario: Check Previous order details
  	When user clicks on Order link
    Then user checks the previous order details
    
  Scenario: Check Open order details
  	When user clicks on Open Order link
    Then user checks the open order details
    
  Scenario: Check Cancelled order details
  	When user clicks on Cancelled Order link
    Then user checks the cancelled order details