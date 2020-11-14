Feature: Change Address
  The user is able to change address

  Scenario Outline: Testing change address
    Given I am in the principal page
    When I press View my customer account
    And Redirec to customer account
    And I press MY ADDRESS 
    And I press Add new address
    And fill in Firts Name(required) with "<bName>"
    And fill in Last Name(required) with "<bLastName>"
    And fill in Company with "<company>"
    And fill in Address(required) with "<address>"
    And fill in Address (Line2) with "<address2>"
    And fill in City(required) with "<city>"
    And Select in State with "<state>"
    And fill in Zip/Postal Code(required) with "<code>"
    And Select in Country with "<country>"
    And fill in Additional information with "<information>"
    And fill in Home phone with "<phone>"
    And fill in Mobile phone(required) with "<mobile>"
    And fill in Assign an address alias for future reference. with "<alias>"
    Then I press save
    And show MY ADDRESS2
    
    Examples:
    |bName|bLastName|company|address   |address2	|city	 |state	 |code |country			 |information|phone|mobile    |alias	   |
    |Danny|Hernandez|UdeA		|Cra 2 1234|Cra 3 1234|Itagui|Alabama|00000|United States|NN				 |0		 |3148109382|My Address2|