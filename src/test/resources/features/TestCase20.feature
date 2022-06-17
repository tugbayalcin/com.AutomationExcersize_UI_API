Feature: Test Case 20

@tc20-21
  Scenario Outline: Search Products and Verify Cart After Login
    Given The user goes to the "automation" page
    Then Click on 'Products' button.
    And Verify user is navigated to ALL PRODUCTS page successfully
    Then Enter "<product name>" in search input and click search button
    And User verify 'SEARCHED PRODUCTS' is visible
    Then Verify all the products related to search are visible
    And Add those products to cart
    Then Click 'Cart' button and verify that products are visible in cart
    And The user  clicks the signin button on the header
    Then The user verify 'Login to your account' is visible
    And The user enter correct email address in the email input box
    And The user enter correct password in the password input box
    And The user Click 'login' button on loginPage
    Then The user verify that 'Logged in as username' is visible after login
    And Again To Go 'Cart' page
    Then Verify that those products are visible in cart after login as well


    Examples:
      | product name |
      | dress        |
