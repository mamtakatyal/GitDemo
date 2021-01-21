Feature: Application Login

Scenario: Home Page default login
Given User is on Netbanking landing page
When User login into application using "Jin" and password "1234"
Then Home page is populated
And Cards displayed is "true"


Scenario: Home Page default login
Given User is on Netbanking landing page
When User login into application using "John" and password "4321"
Then Home page is populated
And Cards displayed is "False"


