Feature: Free CRM Search free CRM functionality

  @Regression
  Scenario: Search for free CRM
    Given Open the freecrm homepage
    When select for Free CRM
    Then Item list should have only Free CRM related Business
