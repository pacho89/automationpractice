Feature: Register user
  The user is able to register in te web page

  Scenario Outline: Testing register user
    Given I am in sign in page
    When I enter email "emailprueba@gmail.com"
    And I press Create an account
    Then Redirect to account-creation page
    And check Mrs
    And fill in Firts Name(required) with "<name>"
    And fill in Last Name(required) with "<lastName>"
    And fill in Email(required) with "<email>"
    And fill in Password(required) with "<passwd>"
    And Select in Date of Birth with "<date>"
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
    And press Create an Account
    And I should see "Welcome to your account. Here you can manage all of your personal information and orders."
    
    Examples:
    | name |lastName |email									|passwd				 |date					|bName|bLastName|company|address   |address2	|city	 |state	 |code |country			 |information|phone|mobile    |alias	   |
    | Danny|Hernandez|emailprueba@gmail.com	|pruebatecnica1|4 octuber 1989|Danny|Hernandez|UdeA		|Cra 2 1234|Cra 3 1234|Itagui|Alabama|00000|United States|NN				 |0		 |3148109382|My Address|