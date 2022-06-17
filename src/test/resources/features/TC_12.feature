
Feature: Test Case 12:


  Scenario: Add Products in Cart

    Given kullanici "automation" sayfasina gider
    And Verify that home page is visible successfully
    And Click Products button
    And Hover over first product and click Add to cart
    Then Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    And Verify both products are added to Cart
    Then Verify their prices, quantity and total price















