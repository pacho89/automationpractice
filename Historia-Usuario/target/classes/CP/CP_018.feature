Feature: Change Address
  The user is able to change address

  Scenario Outline: Testing change address
    Given I am in the principal page
    When I press View my customer account
    And Redirec to customer account
    And I press MY ADDRESS 
    And I press update
    And fill in Address(required) with "<address>"
    Then I press save
    And show Cra 2 12345
    
    Examples:
    |address|
    |Cra 2 12345|