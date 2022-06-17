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

    @FindBy(css = "[id='search_product']")
    public WebElement productSearchBox;

    @FindBy(css = "[id='submit_search']")
    public WebElement productSearchButton;

    @FindBy(css = "[class='title text-center']")
    public WebElement searchedProductsTitle;

    @FindBy(css = "[class='single-products']")
    public List<WebElement> allSearchedProductList;

    @FindBy(css = "[class='productinfo text-center']")
    public List<WebElement> addToCartButtonList;

    @FindBy(css = "[class='nav navbar-nav']")
    public WebElement cartButton;

    @FindBy(css = "[class='btn btn-success close-modal btn-block']")
    public WebElement continueShoppingButton;

    @FindBy(css = "[class='active']")
    public WebElement reviewsLine;

    @FindBy(css = "[id='name']")
    public WebElement reviewsNameTextBox;

    @FindBy(css = "[id='email']")
    public WebElement reviewsEmailTextBox;

    @FindBy(css = "[id='review']")
    public WebElement reviewsTextArea;

    @FindBy(css = "[id='button-review']")
    public WebElement reviewSubmitButton;

























}
