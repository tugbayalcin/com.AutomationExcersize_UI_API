package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase5StepDefinitions {

    AllPage page=new AllPage();

    // TC005_Steps

    @Given("TG The user goes to the AutomationExercises page")
    public void theUserGoesToTheAutomationExercisesPage() {
        Driver.getDriver().get(ConfigReader.getProperty("automation"));
    }

    @And("TG Verify New User Signup is visible")
    public void verifyIsVisible() {
        Assert.assertTrue(page.loginPage().newUsersigupYaziElement.isDisplayed());
    }

    @Then("TG Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        page.loginPage().loginSayfasiNewUserNameBox.sendKeys(ConfigReader.getProperty("name"));
        page.loginPage().loginSayfasiNewUserEmailBox.sendKeys(ConfigReader.getProperty("username"));

    }

    @And("TG Click Signup button")
    public void clickSignupButton() {
        page.loginPage().loginSayfasiSignupButonu.click();
    }

    @Then("TG Verify error Email Address already exist! is visible")
    public void verifyErrorIsVisible() {
        Assert.assertTrue(page.loginPage().loginSayfasiNewUserEmailAdressAlreadyExistText.isDisplayed());
    }


}
