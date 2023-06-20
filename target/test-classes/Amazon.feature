Feature: To Validate the Search Functionality of Amazon Application
@Smoke
  Scenario: To Validate the Search Functionality of Amazon Application with Valid Search Word
    Given To launch the Browser and Amazon URL
    When To Pass the Valid Search word to search box
    And To click the Search button
    Then To Close the Browser
