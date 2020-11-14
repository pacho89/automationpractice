Feature: Preview
  Show info of a item in a popup

  Scenario Outline: Testing preview
    Given I am in the principal page
    When I search this product "<item>"
    And I press quick view top of the item
    And I change the size to M
    And I press add to cart
    Then Show popup with message Product successfully added to your shopping cart
    
    Examples:
    | item  										 |
    | Printed Summer Dress|