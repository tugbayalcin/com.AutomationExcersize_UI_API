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

public class LoginSteps {
    //LoginPage loginPage = new LoginPage();
    AllPage page = new AllPage();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        String expectedData = "Automation Exercise";
        String actualData = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedData.equals(actualData));

    }

    @Then("kullanici header daki signin butonuna tiklar")
    public void kullanici_header_daki_signin_butonuna_tiklar() {
        page.loginPage().headerSignUpbutonElement.click();

    }

    @When("kullanici Login to your account yazisinin goruntugunu teyit eder")
    public void kullanici_login_to_your_account_yazisinin_goruntugunu_teyit_eder() {
        Assert.assertTrue(page.loginPage().newUsersigupYaziElement.isDisplayed());
    }

    @Then("kullanici login page de email kutusuna email girer")
    public void kullanici_login_page_de_email_kutusuna_email_girer() {
        page.loginPage().loginSayfasiEmailAdressInput.sendKeys(ConfigReader.getProperty("username"));

    }

    @Then("kullanici loginpage de password kutusuna password girer")
    public void kullanici_loginpage_de_password_kutusuna_password_girer() {
        page.loginPage().loginSayfasiPasswordInput.sendKeys(ConfigReader.getProperty("password"));
    }

    @When("kullanici login page de login butonuna tıklar")
    public void kullanici_login_page_de_login_butonuna_tıklar() {
        page.loginPage().loginSayfasiLoginButonu.click();

    }

    @Then("kullanici login oldukdan sonra  header da logged in as username yazisinin gorundugunu teyit eder")
    public void kullanici_login_oldukdan_sonra_header_da_logged_in_as_username_yazisinin_gorundugunu_teyit_eder() {
        Assert.assertTrue(page.loginPage().logInAsWebElement.isDisplayed());
    }

    @When("kullanici header da logout butonuna basa")
    public void kullanici_header_da_logout_butonuna_basa() {
        page.loginPage().headerLogOutButonu.click();
    }

    @When("kullanici loginPage sayfasina donuldugunu teyit eder")
    public void kullanici_login_page_sayfasina_donuldugunu_teyit_eder() {
        Assert.assertTrue(page.loginPage().loginYourAccountYazisi.isDisplayed());

    }

    @Given("Home page sayfasina git")
    public void homePageSayfasinaGit() {
        page.homePage().headerHomeButon.click();
    }

    @Then("Card page sayfasina git")
    public void cardPageSayfasinaGit() {
        page.cardPage().headerCardpageButton.click();
    }

    @And("Login sayfasina git")
    public void loginSayfasinaGit() {
        page.loginPage().headerSignUpbutonElement.click();
    }

    @Then("Contact us sayfasina git")
    public void contactUsSayfasinaGit() {
        page.contactUsPage().headerContactUsButon.click();
    }
}
