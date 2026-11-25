Feature: User Login
  As a User
  i want to login
  so that i can access the SauceDemo Site under my account

  @HappyPath
  Scenario Outline:
    Given i am on the Login Page
    When i enter my email address "<email_address>" and my password "<password>"
    And i click the sign in button
    Then i should be redirected to the SauceDemo homepage
    Examples:
      |email_address||password|
      |standard_user||secret_sauce|
      |problem_user||secret_sauce|

