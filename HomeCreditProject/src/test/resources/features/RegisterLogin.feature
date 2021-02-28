@RegisterLogin
Feature: Register and Login account

  Scenario: Register new account
    Given I want to navigate to Register Page
    When I input email
    And I click Submit button
    And I get User ID
    And I get Password
    And I navigate to Login Page
    And I input registered User ID
    And I input registered Password
    And I click Login button
    Then I verified welcome marquee displayed
