Feature: User Login
  As a registered User I want to login to Ndosi's welcome page so I can see if I am Admin user

  Background:
    Given the admin user is on login page

  Scenario Outline: User verify if they are admin user with valid credentials
    When the admin user enters valid email <email>
    And the admin user enters valid password <password>
    And the admin user clicks the login button
    Then the admin user has logged in successfully
    When the admin user clicks on the user dropdown menu
    And the admin user clicks on the admin panel option

    Examples:
      |email             | password    |
      |kamo101@gmail.com  | Kamo@2026   |