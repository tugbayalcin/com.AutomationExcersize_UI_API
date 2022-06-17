package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul//a[@href=\"/products\"]")
    public WebElement headerProductPage;

   @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement allProductsText;

    @FindBy(css = "[class=\"single-products\"]")
    public List<WebElement> allProductList;

    @FindBy(css = "[href=\"/product_details/1\"]")
    public WebElement firstViewProduct;

     @FindBy(css = "[class=\"product-information\"]")
    public WebElement firstProductDetails;



}
