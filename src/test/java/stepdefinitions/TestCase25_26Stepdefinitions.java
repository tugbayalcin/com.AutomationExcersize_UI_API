package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class TestCase25_26Stepdefinitions {

    HomePage homePage=new HomePage();
    @Given("Scroll down page to bottom")
    public void scroll_down_page_to_bottom() {
        JSUtils.scrollDownByJS();
    }
    @Given("Click on arrow at bottom right side to move upward")
    public void click_on_arrow_at_bottom_right_side_to_move_upward() {
        ReusableMethods.waitForClickablility(homePage.scrollUpArrow, 10);
        JSUtils.clickElementByJS(homePage.scrollUpArrow);
    }
    @Given("Verify that page is scrolled up and {string} text is visible on screen")
    public void verify_that_page_is_scrolled_up_and_text_is_visible_on_screen(String string) {
        try{
            if(homePage.verificationText1.isDisplayed()) {

                Assert.assertTrue(homePage.verificationText1.isDisplayed());

            }else if(homePage.verificationText2.isDisplayed()){

                Assert.assertTrue(homePage.verificationText2.isDisplayed());

            }else if(homePage.verificationText3.isDisplayed()){

                Assert.assertTrue(homePage.verificationText3.isDisplayed());
            }

        }catch (NullPointerException e){

            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }



    @And("Home Page, Verify SUBSCRIPTION is visible")
    public void homePageVerifySUBSCRIPTIONIsVisible() {
        Assert.assertTrue(homePage.subciptionText.isDisplayed());
    }

    @Given("Scroll up page to top")
    public void scrollUpPageToTop() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
        Thread.sleep(3000);
    }

}
