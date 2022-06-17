package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPage;
import utilities.ConfigReader;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class TestCase20StepDefinition
{
    AllPage obje=new AllPage();

    @Then("Enter {string} in search input and click search button")
    public void enterInSearchInputAndClickSearchButton(String productName)
    {
        ReusableMethods.waitForVisibility(obje.productPage().productSearchBox,5);
        JSUtils.scrollIntoVIewJS(obje.productPage().productSearchBox);
        obje.productPage().productSearchBox.sendKeys(productName);
        JSUtils.clickElementByJS(obje.productPage().productSearchButton);

    }

    @And("User verify {string} is visible")
    public void userVerifySEARCHEDPRODUCTSIsVisible(String string)
    {
        Assert.assertTrue(obje.productPage().searchedProductsTitle.isEnabled());
    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible()
    {
        for(int i=0; i<obje.productPage().allSearchedProductList.size(); i++)
        {
            Assert.assertTrue(obje.productPage().allSearchedProductList.get(i).isDisplayed());
        }
    }

    @And("Add those products to cart")
    public void addThoseProductsToCart()
    {
        for(int i=0; i<obje.productPage().addToCartButtonList.size(); i++)
        {
            JSUtils.clickElementByJS(obje.productPage().addToCartButtonList.get(i));
            ReusableMethods.waitFor(1);
            JSUtils.clickElementByJS(obje.productPage().continueShoppingButton);
        }
    }


    @Then("Click {string} button and verify that products are visible in cart")
    public void clickCartButtonAndVerifyThatProductsAreVisibleInCart(String string)
    {
        JSUtils.scrollIntoVIewJS(obje.productPage().cartButton);
        JSUtils.clickElementByJS(obje.productPage().cartButton);


    }
    @Then("The user verify {string} text is visible")
    public void theUserVerifyLoginToYourAccountTextIsVisible()
    {
        Assert.assertEquals(ConfigReader.getProperty("searchedProductsTitle"),obje.productPage().searchedProductsTitle.getText());

    }


    @And("Again To Go {string} page")
    public void againToGoCartPage(String string)
    {
        JSUtils.scrollIntoVIewJS(obje.productPage().cartButton);
        JSUtils.clickElementByJS(obje.productPage().cartButton);
    }

    @Then("Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell()
    {

    }



}
