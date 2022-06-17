package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AllPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.Log;
import static org.junit.Assert.assertTrue;
public class TestCase14Stepdefinitios {
    AllPage allPage=new AllPage();
    //  @Then("Add products to cart")
    //  public void add_products_to_cart() {
    //      Log.startTestCase("Automation Exercise ");
    //      JSUtils.clickElementByJS(allPage.homePage().addProductButtonsList.get(0));
    //  }
    @Then("Click view cart button on popup")
    public void clickViewCartButtonOnPopup() throws InterruptedException {
        Thread.sleep(3000);
        JSUtils.clickElementByJS(allPage.homePage().viewCartButton);
        Log.info("Click view cart button on popup");
    }
    //  @Then("Verify that cart page is displayed")
    //  public void verify_that_cart_page_is_displayed() {
    //      assertTrue(Driver.getDriver().getCurrentUrl().contains("view_cart"));
    //      Log.info("Verify that cart page is displayed");
    //  }
    @Then("Click Proceed To Checkout")
    public void click_proceed_to_checkout() throws InterruptedException {
        Thread.sleep(3000);
        JSUtils.clickElementByJS(allPage.cardPage().proceedToCheckoutButton);
        Log.info("Click Proceed To Checkout");
    }
    @Then("Fill all details in Signup and create account")
    public void fill_all_details_in_signup_and_create_account() {
        allPage.loginPage().nameBox.sendKeys(Faker.instance().name().firstName());
        allPage.loginPage().emailBox.sendKeys(Faker.instance().internet().emailAddress());
        allPage.loginPage().signupButton.click();
        allPage.signupPage().idMrRadioButton.click();
        allPage.signupPage().passwordTextBox.sendKeys(Faker.instance().internet().password());
        Select selectDays=new Select(allPage.signupPage().daysDropdown);
        selectDays.selectByIndex(Faker.instance().random().nextInt(0,29));
        Select selectMonths=new Select(allPage.signupPage().monthsDropdown);
        selectMonths.selectByIndex(Faker.instance().random().nextInt(0,11));
        Select selectYears=new Select(allPage.signupPage().yearsDropdown);
        selectYears.selectByIndex(Faker.instance().random().nextInt(0,120));
        allPage.signupPage().firstnameBox.sendKeys(Faker.instance().funnyName().name());
        allPage.signupPage().lastnameBox.sendKeys(Faker.instance().howIMetYourMother().character());
        allPage.signupPage().companyBox.sendKeys(Faker.instance().pokemon().name());
        allPage.signupPage().address1Box.sendKeys(Faker.instance().address().fullAddress());
        allPage.signupPage().address2Box.sendKeys(Faker.instance().address().secondaryAddress());
        Select selectCountry=new Select(allPage.signupPage().countryDropdown);
        selectCountry.selectByIndex(Faker.instance().random().nextInt(0,6));
        allPage.signupPage().stateBox.sendKeys(Faker.instance().address().state());
        allPage.signupPage().cityBox.sendKeys(Faker.instance().address().city());
        allPage.signupPage().zipcodeBox.sendKeys(Faker.instance().address().zipCode());
        allPage.signupPage().mobileNumberBox.sendKeys(Faker.instance().phoneNumber().cellPhone());
        JSUtils.clickElementByJS(allPage.signupPage().createAccountButton);
        Log.info("Fill all details in Signup and create account");
    }
    @And("Verify Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {
        assertTrue(allPage.homePage().loggedinText.isDisplayed());
        Log.info("Verify Logged in as username at top");
    }
    // @Then("Verify Address Details and Review Your Order")
    // public void verify_address_details_and_review_your_order() {
    //     assertTrue(allPage.cardPage().firstProduct.isDisplayed());
    //     Log.info("Verify Address Details and Review Your Order");
    // }
    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() throws InterruptedException {
        allPage.checkoutPage().textarea.sendKeys(Faker.instance().gameOfThrones().character());
        JSUtils.clickElementByJS(allPage.checkoutPage().placeOrderButton);
        Log.info("Enter description in comment text area and click Place Order");
    }
    @Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
        allPage.paymentPage().nameOnCardTextBox.sendKeys(Faker.instance().name().fullName());
        allPage.paymentPage().cardNumberTextBox.sendKeys(Faker.instance().random().nextInt(16,16).toString());
        allPage.paymentPage().cvcTextBox.sendKeys(Faker.instance().random().nextInt(3,3).toString());
        allPage.paymentPage().expiryMonthTextBox.sendKeys(Faker.instance().random().nextInt(1,12).toString());
        allPage.paymentPage().expiryYearTextBox.sendKeys(Faker.instance().random().nextInt(2022,2030).toString());
        Log.info("Enter payment details: Name on Card, Card Number, CVC, Expiration date");
    }
    @And("Verify ACCOUNT CREATED! and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
        assertTrue(allPage.signupPage().accountCreatedText.isDisplayed());
        allPage.signupPage().continueButton.click();
        Log.info("Verify ACCOUNT CREATED! and click Continue button");
    }
    @Then("Click Register Login button at cart page")
    public void clickRegisterLoginButtonAtCartPage() throws InterruptedException {
        Thread.sleep(4000);
        JSUtils.clickElementByJS(allPage.cardPage().registerLoginButton);
        Log.info("Click Register Login button at cart page");
    }
    @Then("Click Cart button")
    public void clickCartButton() throws InterruptedException {
        //    JSUtils.clickElementByJS(allPage.cardPage().headerCardpageButton);
        allPage.cardPage().headerCardpageButton.click();
        Log.info("Click Cart button");
    }
    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        JSUtils.clickElementByJS(allPage.paymentPage().payAndConfitmOrderButton);
        Log.info("Click Pay and Confirm Order button");
    }
    @And("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        assertTrue(allPage.paymentPage().orderPlacedText.isDisplayed());
        Log.info("Verify success message Your order has been placed successfully!");
    }
    @And("Click Delete Account button")
    public void clickDeleteAccountButton() throws InterruptedException {
        allPage.homePage().deleteAccountButton.click();
        Log.info("Click Delete Account button");
    }
    @Then("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {
        assertTrue(Driver.getDriver().getCurrentUrl().contains("delete"));
        Log.info("Verify ACCOUNT DELETED! and click Continue button");
        Log.endTestCase("Automation Exercise");
    }
}