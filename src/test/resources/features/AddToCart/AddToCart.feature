 Feature:
  As a user
  i want to add a product
  so that i can view it in the cart

   Background:
     Given i am on the Login Page
     When i enter my email address "standard_user" and my password "secret_sauce"
     And i click the sign in button
     Then i should be redirected to the SauceDemo homepage
  @HappyPath
  Scenario:
    Given i am on the Product Page
    When i click add to cart
    Then the cart should display a number greater than or equal to an increment of 1
