Feature: Register user invalid
  Validate if the user can register without email

  Scenario Outline: Testing register user invalid
    Given I am in sign in page
    When I enter email "<email>"
    And I press CREATE AN ACCOUNT
    Then I press Create an Account
    And I press Register
    And Show invalid message There are 8 errors
    
    Examples:
    |email|
    |emailprueba@gmail.com|