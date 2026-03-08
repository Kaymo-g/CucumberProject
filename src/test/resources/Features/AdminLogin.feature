Feature: Admin User Login
  As a registered Admin user I want to login to Ndosi's welcome page so I can approve the new user

  Scenario Outline: Admin Successfully logged in with valid credentials
    Given the admin user is on login page
    When the admin user enters valid email <email>
    And the admin user enters valid password <password>
    And the admin user clicks the login button
    Then the admin user has logged in successfully
    When the admin user clicks on the user dropdown menu
    And the admin user clicks on the admin panel option
    And the admin user clicks on the approval button
    And the admin search by email address <emailAddress>
    Then the admin user clicks on the approve button
    When the admin user clicks on the users button
    And the admin search by email address1 <emailAddress>
    Then the admin user change the user role to admin

    Examples:
      |email             | password    |
      |kamo10@gmail.com  | Kamo@2026   |