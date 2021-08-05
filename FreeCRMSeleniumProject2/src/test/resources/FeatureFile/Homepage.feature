Feature: This feature file is for FreeCRM home page

  Scenario: Verify the logo free CRM  homePage
    Given Customer  goes to the website
    When Customer enter the  freecrm.com
    Then Customer  should  be able to go to the freecrm homepage"https://freecrm.com/"
