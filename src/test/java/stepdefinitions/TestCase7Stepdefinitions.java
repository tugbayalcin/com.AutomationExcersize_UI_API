package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AllPage;
import utilities.ReusableMethods;

public class TestCase7Stepdefinitions {

    AllPage obje=new AllPage();

    @Given("kullanici Test Cases butonuna tiklar")
    public void kullanici_test_cases_butonuna_tiklar() {
        obje.homePage().testCaseButton.click();
    }
    @Given("kullanici Test Case sayfasininin acildigini teyit eder")
    public void kullanici_test_case_sayfasininin_acildigini_teyit_eder() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(obje.homePage().testStepsText.isDisplayed());
    }

}
