Feature: FreeCRM Support feature

  @Sanity @Regression
  Scenario: User should be able to redirected to the FreeCRM support page by clicking on Support.
    Given User is in the homepage of FreeCRM "https://freecrm.com/"
    When User clicks on the support option
    Then User should be able to open the support page of FreeCRM "https://support.cogmento.com/en/collections/1398782-webinars-videos"
