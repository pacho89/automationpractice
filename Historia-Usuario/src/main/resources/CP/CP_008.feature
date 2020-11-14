Feature: Delete item
  The user is able to delete an item from the cart

  Scenario Outline: Testing delete item
    Given I am in the principal page
    When I press Cart
    Then Redirect to cart page
    And I search "<item>"
    And I press icon of trash
    Then Show message Your shopping cart is empty.
    
    Examples:
    | item  						  			 |
    | Faded Short Sleeve T-shirts|