Feature: Testing Login functionality of the Zillow application

Scenario Outline: This scenario tests all the invalid username and password
Description: We can use boundary tests, State Transition techniques, etc.

Given I open the browser and I go to the application
#When I click on the sign in button located on the  homepage  
When I enter "<username>" and "<password>"
And I click on the login button
Then I am suppose to get an error message at the bottom 

Examples:
| username                  | password |
| Abctoken645637@gmail.com  | 12045680 |
| testuser45@email.com      | 023456   |
| tester746789332@email.com | 103456   |
| testuser70000@email.com   | 1238767  |
