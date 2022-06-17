Feature: Test Case 8

  @alltest
  Scenario: Test Case 8 Verify All Products and product detail page
    Given The user goes to the "automation" page
    And The user  verify that home page is visible successfully
    And Click on 'Products' button.
    And Verify user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And Click on 'View Product' of first product
    And User is landed to product detail page
    And Verify that detail detail is visible: product name, category, price, availability, condition, brand