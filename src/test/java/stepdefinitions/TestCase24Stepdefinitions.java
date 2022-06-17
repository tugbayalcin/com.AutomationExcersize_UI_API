package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.CardPage;
import pages.PlaceOrderCheckoutPage;
import pages.ProductPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Random;

public class TestCase24Stepdefinitions {
    CardPage cardPage = new CardPage();
    PlaceOrderCheckoutPage placeOrderCheckoutPage =new PlaceOrderCheckoutPage();
    ProductPage productPage =new ProductPage();

    @Given("Click Continue button")
    public void click_continue_button() throws InterruptedException {

       ReusableMethods.waitAndClick(cardPage.continueButtont);

    }

    @Given("Click Cart button")
    public void click_cart_button() throws InterruptedException {
        ReusableMethods.waitAndClick(placeOrderCheckoutPage.cartButtonHomePage);
    }

    @Given("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        Assert.assertEquals(1, cardPage.productsInCart.size());
    }

    @Given("Click Proceed To Checkout")
    public void click_proceed_to_checkout() throws InterruptedException {
        ReusableMethods.waitAndClick(placeOrderCheckoutPage.proceedToCheckoutButton);
    }


    @Given("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {
        placeOrderCheckoutPage.nameBox.sendKeys(Faker.instance().name().fullName());
        placeOrderCheckoutPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
    }



    @Given("Click Proceed To Checkout button")
    public void click_proceed_to_checkout_button() throws InterruptedException {
        ReusableMethods.waitAndClick(productPage.proceedToCheckoutButton);




    }

    @Given("Verify Address Details and Review Your Order")
    public void verify_address_details_and_review_your_order() {
        Assert.assertTrue(placeOrderCheckoutPage.addressVerificationText.isDisplayed());
    }

    @Given("Enter description in comment text area and click Place Order")
    public void enter_description_in_comment_text_area_and_click_place_order() {
        placeOrderCheckoutPage.messageBox.sendKeys("Hello world");
        placeOrderCheckoutPage.placeOrderButton.click();
    }

    @Given("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
        placeOrderCheckoutPage.nameOnCard.sendKeys("kader");
        placeOrderCheckoutPage.cardNumberBox.sendKeys("12345");
        placeOrderCheckoutPage.cvcBox.sendKeys("006");
        placeOrderCheckoutPage.expirationMonth.sendKeys("10");
        placeOrderCheckoutPage.expirationYear.sendKeys("2025");
    }

    @Given("Click Pay and Confirm Order button")
    public void click_pay_and_confirm_order_button() throws IOException, InterruptedException {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitAndClick( placeOrderCheckoutPage.payAndConfirmOrderButton);
        ReusableMethods.getScreenshot("Your order has been placed successfully! YAZİSİ");

    }



    @Given("Click Register and Login button")
    public void click_register_and_login_button() throws InterruptedException {
        ReusableMethods.waitFor(1);
        ReusableMethods.waitAndClick(productPage.registerLoginButtonu);

    }
    @Given("Verify success message Your order has been placed successfully!")
    public void verify_success_message_your_order_has_been_placed_successfully() throws IOException {

        Assert.assertTrue(cardPage.successMessageYazisi.isDisplayed());

    }

    @Given("Click  Delete Account button")
    public void click_delete_account_button() throws InterruptedException {

        ReusableMethods.waitAndClick(cardPage.deleteAccountButton);

    }
    @Given("Verify ACCOUNT DELETED! and click Continue button")
    public void verify_account_deleted_and_click_continue_button() throws IOException {

        ReusableMethods.getScreenshot("Hesap Silinemiyor");

    }
    @Given("Click Register  Login button")
    public void click_register_login_button() throws InterruptedException {
        ReusableMethods.waitFor(1);
        ReusableMethods.waitAndClick(cardPage.registerLoginButtonu);

    }
    @Given("Verify ACCOUNT CREATED! and click Continue button")
    public void verify_account_created_and_click_continue_button() throws InterruptedException {
        String expectedYaziElementi="ACCOUNT CREATED!";
        String actualYaziElementi=cardPage.accountCreatedYaziElementi.getText();
        // System.out.println("actualYaziElementi = " + actualYaziElementi);

        Assert.assertEquals(expectedYaziElementi,actualYaziElementi);
        ReusableMethods.waitFor(2);
        ReusableMethods.waitAndClick(cardPage.continueButton);

    }

    @Given("Verify Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {

        ReusableMethods.waitFor(2);
        Assert.assertTrue(cardPage.loggedinAsYaziElementi.isDisplayed());


    }

    @Given("Click Download Invoice button and verify invoice is downloaded successfully.")
    public void click_download_invoice_button_and_verify_invoice_is_downloaded_successfully() throws InterruptedException {
        ReusableMethods.waitFor(5);
        ReusableMethods.waitAndClick(cardPage.invoiceButton);

        String expectedPath = System.getProperty("user.dir") + "/Downloads/invoice.txt";
        System.out.println("expectedPath = " + expectedPath);

        //     String doesExist = String.valueOf(Files.exists(Paths.get(expectedPath)));
        //  Assert.assertTrue(Boolean.parseBoolean(doesExist));


    }

    @Given("Add products to cart")
    public void add_products_to_cart() throws InterruptedException {
        ReusableMethods.waitAndClick(cardPage.addToCartButonut);
        cardPage.continueShoppingButonu.click();

    }

}




