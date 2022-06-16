Feature: Test Case 21

  @tc20-21
  Scenario: Add review on product
    Given The user goes to the "automation" page
    Then Click on 'Products' button.
    And Verify user is navigated to ALL PRODUCTS page successfully
    Then Click on 'View Product' of first product
    And Verify 'Write Your Review' is visible
    Then Enter name, email and review
    And Click 'Submit' button
    Then Verify success message 'Thank you for your review.'