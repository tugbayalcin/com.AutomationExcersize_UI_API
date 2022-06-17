package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPage;
import pages.LoginPage;
import utilities.ReusableMethods;


public class TestCase3Stepdefinitions {
    AllPage obje = new AllPage();

    @Then("The user enter incorrect email address in the email input box")
    public void theUserEnterIncorrectEmailAddressInTheEmailInputBox() {
    obje.loginPage().incorrectemailOrPasswordBox.sendKeys("hnf@ocak.co");
    obje.loginPage().loginSayfasiPasswordInput.sendKeys("12345");

    }






    @And("The user enter {string} in the password input box")
    public void theUserEnterInThePasswordInputBox(String password) {
        obje.loginPage().loginSayfasiPasswordInput.sendKeys(password);
    }

    @And("The user enter  {string} address in the email input box")
    public void theUserEnterAddressInTheEmailInputBox(String email) {
            obje.loginPage().loginSayfasiEmailAdressInput.sendKeys(email);
        }

    @And("The user  Verify error Your email or password is incorrect is visible")
    public void theUserVerifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obje.loginPage().incorrectemailOrPasswordBox.isDisplayed());
    }
}

