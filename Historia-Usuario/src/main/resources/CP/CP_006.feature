Feature: Add two items
  The add items to cart

  Scenario Outline: Testing add two items
    Given I am in the principal page
    When I search this product "<item>"
    And I press add to cart
    And I press continue shopping
    And I search this product "<item2>"
    And I press add to cart
    Then Show popup with message Product successfully added to your shopping cart
    
    Examples:
    | item  										 | item2 |
    | Faded Short Sleeve T-shirts|Blouse |