@CreateNewAccount
Feature: Create New Account

  Scenario Outline: Register new account
    Given I want to navigate to New Customer Page
    When I input customer name with value "<CustomerName>"
    And I choose Male gender with "<Gender>" option
    And I input DOB with "<birthDate>"
    And I input Address with "<Address>"
    And I input City with "<City>"
    And I input Pin number with "<Pinno>"
    And I input Mobile number with "<MobileNumber>"
    And I input email with "<Email>"
    And I input password with "<Password>"
    And I click Submit
    Then I verified Customer ID is displayed well
    And I verify Customer Name displayed with "<CustomerName>" correctly
    And I verify Gender displayed with "<CustomerName>" correctly
    And I verify Birthdate displayed with "<BirthdateVerified>" correctly
    And I verify City displayed with "<City>" correctly
    And I verify State displayed with "<State>" correctly
    And I verify Pin displayed with "<Pin>" correctly
    And I verify MobileNumber displayed with "<MobileNumber>" correctly
    And I verify Email displayed with "<Email>" correctly

    Examples: 
      | CustomerName | Gender | birthDate  | BirthdateVerified | Address  | City     | State | Pinno    | MobileNumber | Email          | Password |
      | Khanh Pham   | male   | 26/02/1994 | 2021-02-26        | Carolina | New York | abc   | 091112   |   0942327885 | pham@gmail.com |   123456 |
