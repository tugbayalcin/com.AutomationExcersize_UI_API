Feature:  TestCase10:Verify Subscription in home page
@TC10
  Scenario:

    Given The user goes to the "automation" page
    Then  The user  verify that home page is visible successfully
    Then Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible
