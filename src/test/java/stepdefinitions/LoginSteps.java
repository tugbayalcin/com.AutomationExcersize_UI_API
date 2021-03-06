package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Log;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    AllPage page=new AllPage();





   

    @Given("The user goes to the {string} page")
    public void the_user_goes_to_the_page(String automation) {
       Log.startTestCase("Automation Exercise ");
        Driver.getDriver().get(ConfigReader.getProperty("automation"));
        Log.info("The user goes to the automation page");

    }

    @Then("The user  verify that home page is visible successfully")
    public void the_user_verify_that_home_page_is_visible_successfully() {

        String expectedData = "Automation Exercise";
        String actualData = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedData.equals(actualData));


    }

    @Then("The user  clicks the signin button on the header")
    public void the_user_clicks_the_signin_button_on_the_header() {
        page.loginPage().headerSignUpbutonElement.click();
        Log.info("The user  clicks the signin button on the header");

    }

    @When("The user verify {string} is visible")
    public void the_user_verify_is_visible(String string) {
        Assert.assertTrue(page.loginPage().newUsersigupYaziElement.isDisplayed());
    }

    @Then("The user enter correct email address in the email input box")
    public void the_user_enter_correct_email_address_in_the_email_input_box() {
        page.loginPage().loginSayfasiEmailAdressInput.sendKeys(ConfigReader.getProperty("username"));
        Log.info("The user enter correct email and password to related input boxes and press the login button to login");

    }

    @Then("The user enter correct password in the password input box")
    public void the_user_enter_correct_password_in_the_password_input_box() {
        page.loginPage().loginSayfasiPasswordInput.sendKeys(ConfigReader.getProperty("password"));
    }

    @When("The user Click {string} button on loginPage")
    public void the_user_click_button_on_login_page(String string) {
        page.loginPage().loginSayfasiLoginButonu.click();

    }

    @Then("The user verify that {string} is visible after login")
    public void the_user_verify_that_is_visible_after_login(String string) {
        Assert.assertTrue(page.loginPage().logInAsWebElement.isDisplayed());
        Log.info("The user verifies that it's logged in.");
    }

    @When("The user clicks the logout button on the header")
    public void the_user_clicks_the_logout_button_on_the_header() {page.loginPage().headerLogOutButonu.click();
        Log.info("The user press logout butto to logout");
    }


    @When("The user confirms loginPage has been returned.")
    public void the_user_confirms_login_page_has_been_returned() {
        Assert.assertTrue(page.loginPage().loginYourAccountYazisi.isDisplayed());
        Log.info("The user confirms loginPage has been returned");
        Log.endTestCase("Automation Exercise");

    }

    @Given("The user goes to the Home page.")
    public void the_user_goes_to_the_home_page() {page.homePage().headerHomeButon.click(); Log.info("The user goes to the Home page");   }

    @Then("The user goes to the Card page.")
    public void the_user_goes_to_the_card_page() {page.cardPage().headerCardpageButton.click(); Log.info("The user goes to the Card page");}

    @Then("The user goes to the Login page.")
    public void the_user_goes_to_the_login_page() {page.loginPage().headerSignUpbutonElement.click(); Log.info("The user goes to the Login page");  }

    @Then("The user goes to the Contact us page.")
    public void the_user_goes_to_the_contact_us_page() { page.contactUsPage().headerContactUsButon.click(); Log.info("The user goes to the Contact Us page"); }

}
