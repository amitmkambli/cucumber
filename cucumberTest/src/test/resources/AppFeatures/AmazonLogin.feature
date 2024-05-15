Feature: Login Page
  In order to test login page
  As a regiseterd user 
  I want to specify the login conditions

  #Scenario: Amazon Login Page
    #Given user is on Amazon landing page
    #Given sign in button is present on screen
    #When user clicks on sign in button
    #Then user can see login screen
    #When user enters "naveen@gmail.com" in username field
    #When user enters "test@123" in password field
    #When user clicks on sign in button
    #Then user is on home page
    #Then title of home page is "Amazon"

  ## optimised scenario using And , But
  Scenario: Amazon Login Page
    Given user is on Amazon landing page
    And Sign in button is present on screen
    When user clicks on Sign in button
    Then user is displayed login screen
    When user enters "naveen@gmail.com" in username field
    And user enters "test@123" in password field
    And user clicks Sign in button
    Then user is on home page
    And title of home page is "Amazon"
    But sign in button is not present

