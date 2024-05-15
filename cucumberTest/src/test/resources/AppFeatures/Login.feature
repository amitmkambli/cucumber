Feature: Login Feature

  Scenario Outline: Login Fail - possible combinations
    Given user is on application landing page
    When user clicks on sign in button
    Then user is displayed login screen
    When user enters "<UserName>" in username field
    And user enters "<Password>" in password field
    And user clicks sign in button
    Then user gets login failed error message
## if we want to use a variable which can have both integer or double then its better to use a string
## overloaded methods are created for integer & doule but will not work, we can COnvert string to double and perform operations
    Examples: 
      | UserName          | Password          |
      | incorrectusername |            123456 |
      | naveenautomation  | incorrectpassword |
      | incorrectusername | incorrectpassword |
