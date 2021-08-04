Feature: This feature file is for Free CRM Login feature
@Sanity @Regression
Scenario: Verify freecrm customer login
Given customer in freecrm login page
When customer  gives userid input"Shahin@gmail.com"
And customer gives password input"1234"
And customer click the submit button
Then customer should be abel to login

@Regression @Smoke @Sprint07
  Scenario Outline: Verify freecrm customer login wrong userid and wrong password
    Given customer in freecrm login page
    When customer gives userid input"<UserID>"
    And customer gives password input"<Password>"
    And customer click the submit button
    Then customer should not able to login

    Examples: 
      | UserID | Password |
      | Shahan | world    |
      | Sam    | hello    |
