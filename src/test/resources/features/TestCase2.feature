Feature: Test Case 2

  Background: Automation sayfasina gitme
    Given The user goes to the "automation" page
  @TC2
  Scenario: Test Case 2  Login User with correct email and password

    Then  The user  verify that home page is visible successfully
    And   The user  clicks the signin button on the header
    When  The user verify 'Login to your account' is visible
    Then  The user enter correct email address in the email input box
    And   The user enter correct password in the password input box
    When  The user Click 'login' button on loginPage
    Then  The user verify that 'Logged in as username' is visible after login

    Then  The user   Click 'Delete Account' button

    Then The user   Verify that 'ACCOUNT DELETED!' is visible






