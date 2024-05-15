Feature: Amazon Search

@Smoke
Scenario: Search a Product MacBook Air
Given I have a Search Field in Amazon Page
When I search for a product with name "Apple Macbook Pro" and price 200
Then Product with name "Apple Macbook Pro" should be displayed
Then ordeid is 12345 and username is "Naveen"

@Regression
Scenario: Search a Product Iphone
Given I have a Search Field in Amazon Page
When I search for a product with name "Apple iPhone 12" and price 1200
Then Product with name "Apple iPhone 12" should be displayed
Then ordeid is 23456 and username is "Naveen"