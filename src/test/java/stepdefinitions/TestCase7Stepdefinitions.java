package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AllPage;
import utilities.ReusableMethods;

public class TestCase7Stepdefinitions {

    AllPage obje=new AllPage();

    @Given("Click on {string} button")
    public void click_on_button(String string) {
        obje.homePage().testCaseButton.click();
    }
    @Given("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_test_cases_page_successfully() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(obje.homePage().testStepsText.isDisplayed());
    }

}
