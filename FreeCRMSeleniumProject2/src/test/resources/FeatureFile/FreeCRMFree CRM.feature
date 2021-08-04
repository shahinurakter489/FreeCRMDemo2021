Feature: Free CRM Search free CRM functionality

  @Regression
  Scenario: Search for free CRM
    Given Open the Free CRM Homepage
    When Search for Free CRM
    Then Item list should have only Free CRM related Business

  @Regression
  Scenario Outline: Search for item with list
    Given open Free CRM WebSite
    When Search  for "<Items>"
    And Filter by "<Any Business>"
    Then Item list should have product of"Business"

    Examples: 
      | Items | Busniess |
      |       |          |
