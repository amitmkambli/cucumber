Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking Lang page
When User login into application with username "jin" and password "1234"
Then Home page is populated
And Cards are displayed "true"

Scenario: Home page default login
Given User is on NetBanking Lang page
When User login into application with username "john" and password "5678"
Then Home page is populated
And Cards are displayed "false"