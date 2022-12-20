Feature: Test1
  Scenario: Login
    Given user on homepage
    When user write "Admin" into "Username"
    And user write "admin123" into "Password"
    And user clicks "Login" button