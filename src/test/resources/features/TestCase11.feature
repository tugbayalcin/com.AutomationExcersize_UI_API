Feature: Test Case 11: Verify Subscription in Cart page

  @alltest
  Scenario:

    Given The user goes to the "automation" page
    Then  The user  verify that home page is visible successfully
    Then The user goes to the Card page.
    Then Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible