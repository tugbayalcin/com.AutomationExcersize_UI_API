Feature: TC005

  Scenario: TC005_Register User with existing email
    Given TG The user goes to the AutomationExercises page
    And TG Verify that home page is visible successfully
    Then TG Click on Signup Login button
    And TG Verify New User Signup is visible
    Then TG Enter name and already registered email address
    And TG Click Signup button
    Then TG Verify error Email Address already exist! is visible