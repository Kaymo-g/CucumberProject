Feature: User Registration
  As a user I want to register a new account

  Scenario Outline: Successfully registered with valid credentials
    Given the user in on home login page
    When the user clicks the register button
    And the user enters valid firstname <firstname>
    And the user enters valid lastname <lastname>
    And the user enters valid emailaddress <email>
    And the user enters valid newpassword <password>
    And the user enters valid confirmation Password <confirmPassword>
    And the user select the group
    And the user clicks the create account button
    Then the user has successfully registered

    Examples:
      |firstname |lastname |email              | password    |confirmPassword |
      |Kamo      |Ledwaba  |kamo101@gmail.com  | Kamo@2026   |Kamo@2026       |