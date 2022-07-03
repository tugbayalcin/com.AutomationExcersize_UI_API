package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import pages.AllPage;
import pages.LoginPage;
import utilities.Driver;
import utilities.Log;
import utilities.ReusableMethods;

import java.util.logging.LogManager;
import java.util.logging.Logger;


import static java.util.logging.LogManager.*;
import static org.junit.Assert.assertEquals;

public class TC12_TC13 {
    LoginPage loginPage = new LoginPage();

    AllPage page=new AllPage();

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    public static void main(String[] args) {

    }

    //US12  Fikri

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {


        String expectedData ="Automation Exercise";
        String actualData = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedData.equals(actualData));
        Log.info("Anasayfaya giris basarili");
    }

    @Given("Click Products button")
    public void click_products_button() {
    page.productPage().productsButton.click();

    }

    @Given("Hover over first product and click Add to cart")
    public void hover_over_first_product_and_click_add_to_cart() {

    jse.executeScript("arguments[0].click();",
    page.productPage().firstProductAddToCart);

    }

    @Then("Click Continue Shopping button")
    public void click_continue_shopping_button() {
    page.productPage().continueShopping.click();

    }

    @Then("Hover over second product and click Add to cart")
    public void hover_over_second_product_and_click_add_to_cart() {

    jse.executeScript("arguments[0].click();",
    page.productPage().secondProductAddToCart);

    }

    @Then("Click View Cart button")
    public void click_view_cart_button() {
    page.productPage().viewCart.click();

    }

    @Then("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_cart() {

        String expectedProduct1="Blue Top";
        String actualProduct1 = page.productPage().firstProductDescription.getText();
        Assert.assertEquals(expectedProduct1,actualProduct1);

        String expectedProduct2="Men Tshirt";
        String actualProduct2 = page.productPage().secondProductDescription.getText();
        Assert.assertEquals(expectedProduct2,actualProduct2);
        Log.info("Her iki urunun sepete eklendigi dogrulandi");
    }

    @Then("Verify their prices, quantity and total price")
    public void verify_their_prices_quantity_and_total_price() {


        String expectedPrice1= "Rs. 500";
        String actualPrice1= page.productPage().firstProductPrice.getText();
        System.out.println("actualPrice = " + actualPrice1);
        Assert.assertEquals(expectedPrice1,actualPrice1);

        String expectedQuantity1= "1";
        String actualQuantity1= page.productPage().firstProductQuantity.getText();
        System.out.println("actualQuantity = " + actualQuantity1);
        Assert.assertEquals(expectedQuantity1,actualQuantity1);

        String expectedTotal1="Rs. 500";
        String actualTotal1= page.productPage().firstProductTotal.getText();
        System.out.println("actualTotal = " + actualTotal1);
        Assert.assertEquals(expectedTotal1,actualTotal1);

        String expectedPrice2= "Rs. 400";
        String actualPrice2= page.productPage().secondProductPrice.getText();
        System.out.println("actualPrice2 = " + actualPrice2);
        Assert.assertEquals(expectedPrice2,actualPrice2);

        String expectedQuantity2= "1";
        String actualQuantity2= page.productPage().secondProductQuantity.getText();
        System.out.println("actualQuantity2 = " + actualQuantity2);
        Assert.assertEquals(expectedQuantity2,actualQuantity2);

        String expectedTotal2="Rs. 400";
        String actualTotal2= page.productPage().secondProductTotal.getText();
        System.out.println("actualTotal2 = " + actualTotal2);
        Assert.assertEquals(expectedTotal2,actualTotal2);

    }


    //US13  Fikri

    @Given("Click View Product for any product on home page")
    public void click_view_product_for_any_product_on_home_page() {
    page.productPage().seventhProductView.click();
    }

    @Given("Verify product detail is opened")
    public void verify_product_detail_is_opened() {
    page.productPage().seventhProductTitle.isDisplayed();
        Log.info("Urun detay acilisi basarili");
    }

    @Then("Increase quantity to {int}")
    public void increase_quantity_to(Integer int1) {
    page.productPage().seventhProductDetailBox.clear();
    page.productPage().seventhProductDetailBox.sendKeys("4");
    }

    @Then("Click Add to cart button")
    public void click_add_to_cart_button() {
    page.productPage().seventhProductViewAddToCart.click();
        Log.info("Sepete ekleme basarili");
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() throws InterruptedException {

        ReusableMethods.waitFor(2);
        String expectedData = "4";
        String actualData =page.productPage().seventhProductQuantity.getText();
        assertEquals(expectedData,actualData);

    }

}
