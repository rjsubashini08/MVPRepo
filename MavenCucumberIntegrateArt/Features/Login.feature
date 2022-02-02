@smoke
Feature: Login to Gmail
@script1
Scenario Outline: Valid Username and Password for successfull Login

Given user navigate to browser page "<header1>"
When user pass the valid username and password
Then Succesfully login to browser application
Examples:
|header1|
|abc|
|def|

@scrip2
Scenario: InValid Username and Password for successfull Login

Given user navigate to browser page
When user pass the invalid username and password
Then UnSuccesfully login to browser application

