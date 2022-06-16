package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AllPage;
import utilities.Driver;

public class TestCase8Stepdefinitions {
    AllPage obje = new AllPage();

    @Given("Click on {string} button.")
    public void click_on_button(String string) {
        obje.productPage().headerProductPage.click();
    }

    @Given("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verify_user_is_navigated_to_all_products_page_successfully() {
        Assert.assertTrue(obje.productPage().allProductsText.isDisplayed());
    }

    @Given("The products list is visible")
    public void the_products_list_is_visible() {
        obje.productPage().allProductList.stream().forEach(t -> System.out.println(t.getText()));
    }

    @Given("Click on {string} of first product")
    public void click_on_of_first_product(String string) {
        obje.productPage().firstViewProduct.click();
    }

    @Given("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.automationexercise.com/product_details/1";
        Assert.assertTrue(actualUrl.equals(expectedUrl));
    }

    @Given("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verify_that_detail_detail_is_visible_product_name_category_price_availability_condition_brand() {
        Assert.assertTrue(obje.productPage().firstProductDetails.isDisplayed());
    }

}
