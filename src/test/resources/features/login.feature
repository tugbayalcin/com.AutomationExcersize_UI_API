Feature: ortak adimlar

  Background: Automation sayfasina gitme
    Given The user goes to the "automation" page

Scenario:Login ve logout olma

  Then  The user  verify that home page is visible successfully
  And   The user  clicks the signin button on the header
  When  The user verify 'Login to your account' is visible
  Then  The user enter correct email address in the email input box
  And   The user enter correct password in the password input box
  When  The user Click 'login' button on loginPage
  Then  The user verify that 'Logged in as username' is visible after login
  When  The user clicks the logout button on the header
  And   The user confirms loginPage has been returned.

  Scenario: Ortak Pageler
    Given The user goes to the Home page.
    Then The user goes to the Card page.
    And The user goes to the Login page.
    Then The user goes to the Contact us page.
