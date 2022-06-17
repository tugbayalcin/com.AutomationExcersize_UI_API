package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase4StepDefinitions {

    AllPage page=new AllPage();

    // TC004_Steps

    @And("TG Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        String expectedData = "Automation Exercise";
        String actualData = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedData, actualData);
    }

    @Then("TG Click on Signup Login button")
    public void clickOnButton() {
        page.loginPage().headerSignUpbutonElement.click();
    }


    @And("TG Verify Login to your account is visible")
    public void verifyLoginToYourAccountIsVisible() {
        Assert.assertTrue(page.loginPage().newUsersigupYaziElement.isDisplayed());
    }

    @Then("TG Enter correct email address and password")
    public void enterCorrectEmailAddressAndPassword() {
        page.loginPage().loginSayfasiEmailAdressInput.sendKeys(ConfigReader.getProperty("username"));
        page.loginPage().loginSayfasiPasswordInput.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("TG Click Login button")
    public void clickLoginButton() {
        page.loginPage().loginSayfasiLoginButonu.click();
    }

    @Then("TG Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        Assert.assertTrue(page.loginPage().logInAsWebElement.isDisplayed());
    }

    @And("TG Click Logout button")
    public void clickLogoutButton() {
        page.loginPage().headerLogOutButonu.click();
    }

    @Then("TG Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        Assert.assertTrue(page.loginPage().loginYourAccountYazisi.isDisplayed());
    }


}
