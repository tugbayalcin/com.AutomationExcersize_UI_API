Feature:
  Scenario: Test Case 17: Remove Products From Cart

  Given Launch browser
  And Navigate to url
  And Verify that home page is visible successfully
  Then Add products to cart
  When Click Cart button
  And Verify that cart page is displayed
  And Click X button corresponding to particular product
  Then Verify that product is removed from the cart