Feature: FreeCRM Compare Feature

  @Sanity @Regression
  Scenario: Customer is able to click on the Compare option
    Given Customer is in the home page "https://freecrm.com/"
    When Customer click on the Compare option
    Then They should be able to see the Compare page "https://freecrm.com/compare.html"
    
