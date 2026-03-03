Feature: Admin User Login
  As a registered Admin user I want to login to Ndosi's welcome page so I can approve the new user

  Scenario Outline: Admin Successfully logged in with valid credentials
    Given the admin user is on login page
    When the admin user enters valid email <email>
    And the admin user enters valid password <password>
    And the admin user clicks the login button
    And the admin user clicks tool menu
    Then the admin user has logged in successfully

    Examples:
      |email             | password    |
      |kamo10@gmail.com  | Kamo@2026   |