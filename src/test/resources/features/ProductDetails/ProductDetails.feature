Feature:
  As a user
  i want to click on the product title
  so that i can view more details about the product
  Background:
   Given i am on the Login Page
    When i enter my email address "standard_user" and my password "secret_sauce"
    And i click the sign in button
    Then i should be redirected to the SauceDemo homepage
  @HappyPath
  Scenario Outline:
    Given i am on the All Products Page
    When i click on a title for the product id "<id>"
    Then i should be redirected to the Product details page for the product with the given id "<id>"
    Examples:
       |id|
       |4 |
