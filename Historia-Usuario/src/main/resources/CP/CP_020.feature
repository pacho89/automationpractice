Feature: Change Address
  The user is able to change address

  Scenario Outline: Testing change address
    Given I am in the principal page
    When I press View my customer account
    And Redirec to customer account
    And I press MY ADDRESS
    And I press delete in MY ADDRESS2 
    Then I press in alert Aceptar 
    And Dont show MY ADDRESS2