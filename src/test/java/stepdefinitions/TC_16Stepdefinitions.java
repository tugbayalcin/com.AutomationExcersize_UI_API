package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.AllPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_16Stepdefinitions {

    AllPage page = new AllPage();
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Launch browser")
    public void launch_browser() {
        Driver.getDriver();
    }
    @Given("Navigate to url")
    public void navigate_to_url_http_automationexercise_com() {
        Driver.getDriver().get(ConfigReader.getProperty("automation"));
    }
    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertTrue(page.homePage().homePagePicture.isDisplayed());
    }
    @Then("Click Signup - Login button")
    public void click_signup_login_button() {
        page.homePage().signUpLoginButon.click();
    }
    @Then("Fill email, password and click Login button")
    public void fill_email_password_and_click_login_button() {
        page.homePage().emailTextBox.sendKeys(ConfigReader.getProperty("16emailAdress"));
        page.homePage().passwordTextBox.sendKeys(ConfigReader.getProperty("16password"));
        page.homePage().loginButon.click();
    }
    @Then("Verify Logged in as username at top")
    public void verify_logged_in_as_username_at_top() {
        Assert.assertTrue(page.homePage().loggedText.isDisplayed());
    }
    @Then("Add products to cart")
    public void add_products_to_cart() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("javascript:window.scrollBy(0,700)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions.moveToElement(page.homePage().desiredProduct).perform();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.homePage().addToCart.click();
    }
    @Then("Click Cart button")
    public void click_cart_button() {
        page.homePage().wiewCartLink.click();
    }
    @Then("Verify that cart page is displayed")
    public void verify_that_cart_page_is_displayed() {
        Assert.assertTrue(page.homePage().shoppingCartPage.isDisplayed());
    }
    @When("Click Proceed To Checkout")
    public void click_proceed_to_checkout() {
        page.homePage().proceedToCheckoutButon.click();
    }
    @When("Verify Address Details and Review Your Order")
    public void verify_address_details_and_review_your_order() {
        js.executeScript("javascript:window.scrollBy(0,400)");

        page.homePage().infoList(11);
        Assert.assertTrue(page.homePage().productInCart.isDisplayed());
    }
    @When("Enter description in comment text area and click Place Order")
    public void enter_description_in_comment_text_area_and_click_place_order() {
        page.homePage().cartInfoText.sendKeys(ConfigReader.getProperty("16cartInfoTextMessage"));
        page.homePage().placeOrderButon.click();
    }
    @When("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
        js.executeScript("javascript:window.scrollBy(0,300)");
        page.homePage().inputCardName.sendKeys(ConfigReader.getProperty("16adressName"));
        page.homePage().inputCardNumber.sendKeys(ConfigReader.getProperty("16CardNumber"));
        page.homePage().inputCardCvc.sendKeys(ConfigReader.getProperty("16CardCvc"));
        page.homePage().inputCardExpiration.sendKeys(ConfigReader.getProperty("16CardExpiration"));
        page.homePage().inputCardYear.sendKeys(ConfigReader.getProperty("16CardYear"));
    }
    @When("Click Pay and Confirm Order button")
    public void click_pay_and_confirm_order_button() {
        page.homePage().cartConfirmButon.click();
    }
    @When("Verify success message Your order has been placed successfully!")
    public void verify_success_message_your_order_has_been_placed_successfully() {
        Assert.assertTrue(page.homePage().orderPlaceText.isDisplayed());
    }
    @When("Click Delete Account button")
    public void click_delete_account_button() {
        page.homePage().deleteAccountButton.click();
    }
    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verify_account_deleted_and_click_continue_button() {
        Assert.assertTrue(page.homePage().accountDeleteText.isDisplayed());
    }




}
