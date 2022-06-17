package stepdefinitions;



import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPage;
import pages.LoginPage;
import utilities.ReusableMethods;

public class TestCase2Stepdefinitions {

 // LoginPage obje = new LoginPage();

  AllPage obje=new AllPage();
    @Then("The user   Click {string} button")
    public void the_user_click_button(String string) {
        ReusableMethods.waitFor(1);
        obje.loginPage().deleteButtonWebElement.click();

    }


    @Then("The user   Verify that {string} is visible")
    public void the_user_verify_that_is_visible(String string) {
        ReusableMethods.waitFor(1);
        obje.loginPage().deletepageDeleteAccountButon.click();
        Assert.assertTrue(obje.loginPage().deletepageDeleteAccountButon.isDisplayed());

    }
}