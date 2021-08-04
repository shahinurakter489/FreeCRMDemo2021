Feature: FreeCRM About Feature

  @Sanity @Regression
  Scenario: Customer is able to click on the About option
    Given Customer is in the home page "https://freecrm.com/"
    When Customer click on the About option
    Then They should be able to see the About Us page "https://freecrm.com/about.html"
