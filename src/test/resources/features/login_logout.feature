Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given I have open the browser
    When I open Heroku website
    And User enters UserName and Password
    Then Message displayed Login Successfully
    Then Message1
    Then Message1
    Then Close browser