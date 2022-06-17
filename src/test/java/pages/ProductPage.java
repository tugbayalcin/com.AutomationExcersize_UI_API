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

    @FindBy(xpath="//input[@id='search_product']")
    public WebElement searchProduct;

    @FindBy(xpath="//h2[@class='title text-center']")
    public WebElement searchedProductsText;


    @FindBy(xpath = "//i[@class= 'fa fa-search']")
    public WebElement searchButton;


    @FindBy(css = "[class=\"product-image-wrapper\"]")
    public List<WebElement> productPageSearchResultList;

    @FindBy(css = "[class=\"single-products\"]")
    public List<WebElement> productPageAllProductDetailList;

    @FindBy(xpath = "//a[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;
    @FindBy(xpath = "(//p[@class='text-center'])[2]")
    public WebElement registerLoginButtonu;


}





