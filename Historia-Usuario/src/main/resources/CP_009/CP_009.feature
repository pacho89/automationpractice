Feature: Register user
  The user is able to register in te web page

  Scenario: Testing register user
    Given I am in sign in page
    When I enter email "emailprueba@gmail.com"
    And I press Create an account
    Then Redirect to account-creation page
    And check Mrs
    And fill in Firts Name(required) with "Danny"
    And fill in Last Name(required) with "Hernandez"
    And fill in Email(required) with "emailprueba@gmail.com"
    And fill in Password(required) with "pruebatecnica1"
    And Select in Date of Birth with "4 octuber 1989"
    And fill in Firts Name(required) with "Danny"
    And fill in Last Name(required) with "Hernandez"
    And fill in Company with "UdeA"
    And fill in Address(required) with "Cra 2 1234"
    And fill in Address (Line2) with "Cra 3 1234"
    And fill in City(required) with "Itagui"
    And Select in State with "Alabama"
    And fill in Zip/Postal Code(required) with "00000"
    And Select in Country with "United States"
    And fill in Additional information with "NN"
    And fill in Home phone with "0"
    And fill in Mobile phone(required) with "3148109382"
    And fill in Assign an address alias for future reference. with "My Address"
    And I should see "Welcome to your account. Here you can manage all of your personal information and orders."