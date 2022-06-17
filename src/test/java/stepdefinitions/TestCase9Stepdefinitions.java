package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AllPage;
import pages.ProductPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase9Stepdefinitions {
    ProductPage productPage=new ProductPage();
    AllPage obje = new AllPage();

    @Given("Enter product name in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button() throws InterruptedException {
        ReusableMethods.waitAndClick(productPage.searchProduct);
        productPage.searchProduct.sendKeys("Tshirt");
        ReusableMethods.waitFor(2);
        productPage.searchButton.click();
        ReusableMethods.waitFor(2);

    }

    @Given("Verify all the products related to search are visible")
    public void verify_all_the_products_related_to_search_are_visible() {
        int expectedCount=0;
        for (WebElement w:productPage.productPageAllProductDetailList ) {
            if(w.getText().contains("Tshirt")||w.getText().contains("T-Shirt")||w.getText().contains("T SHIRT")){
                expectedCount++;
            }

        }
        int actualCount=productPage.productPageSearchResultList.size();
        System.out.println("expected: " + expectedCount + " actual: " + actualCount);
        Assert.assertEquals(expectedCount,actualCount);




    }

    @Given("Verify SEARCHED PRODUCTS is visible")
    public void verify_searched_products_is_visible() {
        Assert.assertTrue(productPage.searchedProductsText.isDisplayed());
    }
    @Given("Click on Products button")
    public void click_on_products_button() {
        obje.productPage().headerProductPage.click();
    }

}
