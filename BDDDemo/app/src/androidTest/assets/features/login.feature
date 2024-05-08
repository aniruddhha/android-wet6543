Feature: Login Functionality

  Scenario Outline: Failed Login
    Given I am on the login screen
    When I tap email field
    And I enter email <email>
    And I enter password <password>
    And I tap login button
    Then I should see status <sts>
    Examples:
    | email | password | sts  |
    | abc   | abc      | FAIL |