@smoke
Feature: Registration to Gmail
@script
Scenario: Registration of the User

Given user navigate to browser page
When user pass the valid username and password
Then Succesfully login to browser application

@script
Scenario: Registration of the Uesr with wrong Datas credentials

Given user navigate to browser page
When user pass the invalid username and password
Then Succesfully login to browser application