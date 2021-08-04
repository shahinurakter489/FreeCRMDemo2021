Feature: This is Sign Up feature file

  @Sanity @Regression
  Scenario: Verify the Sign up page
    Given customer in Free CRM Sign up  page
    When customer gives input  email address
    And customer gives input  country name and phonenumber
    And customer  select the agreement box
    Then customer should able to Sign up
