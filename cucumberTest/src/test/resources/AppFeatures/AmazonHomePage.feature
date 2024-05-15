Feature: Amazon Home Page
  In order to test Amazon home page of application
  As a Registered user
  I want to specify the features of home page

  Scenario: Home page Top Pannel Section
    Given User is on homepage
    Then user gets a Amazon search field
    And username is also displayed next to search field
    And Amazon logo is displayed
    And Cart link is displayed

  Scenario: Amazon todays deals section
    Given user is on Amazon homepage
    When user scrolls down to todays deals section
    Then user gets list of multiple products
    And user gets product inmage and price deals
    And user can see more products by clicking on carousel

  Scenario: Amazon footer links section
    Given user is on Amazon home page
    When user scrolls down to footer of the page
    Then user gets all Country links
      | Australia |
      | Brazil    |
      | China     |
    And user gets all Amazon service links
      | Amazon Bussiness    |
      | Amazon Web Services |
    And user gets all provacy policy links
      | Privacy Notice |
      | Use & Sale     |
