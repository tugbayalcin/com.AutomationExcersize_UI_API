package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AllPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

import static utilities.JSUtils.scrollDownByJS;

public class TestCase10_11StepDefinition  {

   HomePage homePage=new HomePage();
   JSUtils jsUtils=new JSUtils();
   Actions actions=new Actions(Driver.getDriver());

    @Then("Scroll down to footer")
    public void scroll_down_to_footer() {
        scrollDownByJS();

    }
    @Then("Verify text SUBSCRIPTION")
    public void verify_text_subscription() {
        Assert.assertTrue(homePage.SubscriptionText.isDisplayed());

    }
    @Then("Enter email address in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button() throws InterruptedException {
        actions.click(homePage.emailbox).perform();
        actions.sendKeys(ConfigReader.getProperty("zmail")).perform();
        actions.click(homePage.emailboxButton).perform();


    }
    @Then("Verify success message You have been successfully subscribed! is visible")
    public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {

    }


}
