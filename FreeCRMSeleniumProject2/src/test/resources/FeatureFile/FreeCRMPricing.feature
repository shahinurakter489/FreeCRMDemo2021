Feature: FreeCRM Pricing feature

  @Sanity @Regression
  Scenario: User should be able to redirect to Pricing page when clicking on the Pricing option
    Given User is in the homepage of freeCRM "https://freecrm.com/"
    When User clicks on the Pricing button
    Then User should be able to redirect to the Pricing Page "https://freecrm.com/pricing_us.html"
