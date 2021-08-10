Feature: all login tests

  Scenario: to test the functionality of login button for valid inputs
    Given login page is opened
    When I enter valid username and valid password
    And I click on login button
    Then I am redirected to home page