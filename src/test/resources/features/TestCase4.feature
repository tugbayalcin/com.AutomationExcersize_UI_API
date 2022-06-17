Feature: TC004

  Scenario: TC004_Logout User
    Given TG The user goes to the AutomationExercises page
    And TG Verify that home page is visible successfully
    Then TG Click on Signup Login button
    And TG Verify Login to your account is visible
    Then TG Enter correct email address and password
    And TG Click Login button
    Then TG Verify that Logged in as username is visible
    And TG Click Logout button
    Then TG Verify that user is navigated to login page
