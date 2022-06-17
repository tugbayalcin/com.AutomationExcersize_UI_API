Feature: Test Case 3
  Background: Automation sayfasina gitme
    Given The user goes to the "automation" page
  @alltest
  Scenario Outline: Test Case 3 Login User with incorrect email and password
    Then  The user  verify that home page is visible successfully
    And   The user  clicks the signin button on the header
    And   The user enter  "<email_address>" address in the email input box
    And   The user enter "<password>" in the password input box
    Then  The user Click 'login' button on loginPage
    And The user  Verify error Your email or password is incorrect is visible


    Examples:
      |email_address |password|
      |hnf@ocak.com|12345|
      |hnf@ocak.co|123456|
      |hnf@ocak.co|12345|