
Feature: Test Case 13:

  @alltest
  Scenario: Verify Product quantity in Cart

    Given kullanici "automation" sayfasina gider
    And Verify that home page is visible successfully
    And Click View Product for any product on home page
    And Verify product detail is opened
    Then Increase quantity to 4
    And Click Add to cart button
    And Click View Cart button
    And Verify that product is displayed in cart page with exact quantity