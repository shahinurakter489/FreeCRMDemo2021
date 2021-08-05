Feature: This feature file is for Free CRM google play store icon functionality feature

  @Sanity @Regression
  Scenario: Customer is able to click the playstore option
    Given customer is in freecrm homepage "https://freecrm.com/"
    When customer  clicks on google play store icon
    Then customer should be able to see the freecrm google play store page "https://play.google.com/store/apps/details?id=com.cogmento.app"
