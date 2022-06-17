Feature:
  @alltest
  Scenario: TC16 Place Order: Login before Checkout

    Given Launch browser
    And Navigate to url
    And Verify that home page is visible successfully
    Then Click Signup - Login button
    And Fill email, password and click Login button
    And Verify Logged in as username at top
    Then Add products to cart
    And Click Cart button
    And Verify that cart page is displayed
    When Click Proceed To Checkout
    And Verify Address Details and Review Your Order
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    And Click Pay and Confirm Order button
    And Verify success message Your order has been placed successfully!
    When Click Delete Account button
    Then Verify ACCOUNT DELETED! and click Continue button