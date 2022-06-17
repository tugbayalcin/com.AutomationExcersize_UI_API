package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.AllPage;
import utilities.Driver;
import utilities.Log;

public class TC_17Stepdefinitions {

    AllPage page = new AllPage();
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

    @When("Click X button corresponding to particular product")
    public void click_x_button_corresponding_to_particular_product() throws InterruptedException {
        js.executeScript("javascript:window.scrollBy(0,400)");
        page.cardPage().productDelete.click();
        Thread.sleep(2000);
        Log.info("Clicked the X button corresponding to a specific product");
    }
    @Then("Verify that product is removed from the cart")
    public void verify_that_product_is_removed_from_the_cart() {
        Assert.assertTrue(page.cardPage().cartEmptyText.isDisplayed());
        Log.info("Confirmed that the product has been removed from the cart");
    }


}
