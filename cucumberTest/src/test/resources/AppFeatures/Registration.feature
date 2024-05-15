Feature: User Registration

  Scenario Outline: User registration with different data
    Given User is on registration page
    When User enters following details
      | naveen | automation | nav@gmail.com  | 99999 | Banglore |
      | tom    | peter      | tom@gmail.com  | 66666 | London   |
      | lisa   | dsouza     | lisa@gmail.com | 22222 | SFO      |
    Then user registration should be sucessfull

  Scenario Outline: User registration with different data with columns
    Given User is on registration page
    When User enters following details with columns
      | firstname | lastname   | email          | phone | city     |
      | naveen    | automation | nav@gmail.com  | 99999 | Banglore |
      | tom       | peter      | tom@gmail.com  | 66666 | London   |
      | lisa      | dsouza     | lisa@gmail.com | 22222 | SFO      |
    Then user registration should be sucessfull
