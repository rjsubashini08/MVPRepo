@smoke
Feature: Shopping cart
@script
Scenario: Valid Username and Password for successfull Login

Given user navigate to browser page
When user pass the valid username and password
Then Succesfully login to browser application

@script
Scenario: InValid Username and Password for successfull Login

Given user navigate to browser page
When user pass the invalid username and password
Then Succesfully login to browser application

@script
Scenario: InValid Username and Password for successfull Login

Given user navigate to browser page
When user pass the invalid username and password
Then Succesfully login to browser application