Feature: Dont find items
  The user dont find the items

  Scenario Outline: Testing dont find items
    Given I am in the principal page
    When I enter in input search "<search>"
    And I press icon search
    Then show 0 results have been found.
    
    Examples:
    | search |
    | camison|