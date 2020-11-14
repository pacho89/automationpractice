Feature: Search items
  The user is able to search for a items

  Scenario Outline: Testing search items
    Given I am in the principal page
    When I enter in input search "<search>"
    And I press icon search
    Then show 1 result has been found
    
    Examples:
    | search |
    | t-shirt|