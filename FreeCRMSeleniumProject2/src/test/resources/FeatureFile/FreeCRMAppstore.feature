Feature: This feature file is for Free CRM iOS app store icon functionality feature

  @Sanity @Regression
  Scenario: Customer is able to click the ios icon
    Given customer is in freecrm homepage "https://freecrm.com/"
    When customer  clicks on ios app store icon
    Then customer should be able to see the freecrm ios app store page "https://apps.apple.com/us/app/cogmento/id1291380634"
