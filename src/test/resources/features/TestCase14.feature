@US14
Feature: TC14_PlaceOrderRegisterWhileCheckout
  @alltest
  Scenario:

    Given The user goes to the "automation" page
    Then  The user  verify that home page is visible successfully
    Then Add products to cart
    Then Click view cart button on popup
    Then Verify that cart page is displayed
    Then Click Proceed To Checkout
    Then Click Register Login button at cart page
    And Fill all details in Signup and create account
    And Verify ACCOUNT CREATED! and click Continue button
    And Verify Logged in as username at top
    Then Click Cart button
    Then Click Proceed To Checkout
    Then Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    Then Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    And Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button