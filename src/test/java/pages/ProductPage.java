package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.getDriver(),this);   }

    @FindBy(xpath = "//ul//a[@href=\"/products\"]")
    public WebElement headerProductPage;



    //US12 PAGE Fikri

    @FindBy (xpath = "(//a[@href='/products'])")
    public WebElement productsButton;

    @FindBy (xpath ="(//*[@class='btn btn-default add-to-cart'])[2]")
    public  WebElement firstProductAddToCart;

    @FindBy (xpath = "//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShopping;

    @FindBy (xpath ="(//a[@class='btn btn-default add-to-cart'])[4]")
    public  WebElement secondProductAddToCart;

    @FindBy (xpath = "(//a[@href='/view_cart'])[2]")
    public WebElement viewCart;

    @FindBy (xpath = "//a[@href='/product_details/1']")
    public WebElement firstProductDescription;

    @FindBy (xpath = "//a[@href='/product_details/2']")
    public WebElement secondProductDescription;

    @FindBy (xpath = "(//*[@class='disabled'])[1]")
    public WebElement firstProductQuantity;

    @FindBy (xpath = "(//*[@class='disabled'])[1]")
    public WebElement secondProductQuantity;

    @FindBy (xpath = "(//*[@class='cart_price'])[1]")
    public WebElement firstProductPrice;

    @FindBy (xpath = "(//*[@class='cart_price'])[2]")
    public WebElement secondProductPrice;

    @FindBy (xpath = "//*[@id='product-1']/td[5]/p")
    public WebElement firstProductTotal;

    @FindBy (xpath = "(//*[@class='cart_total_price'])[2]")
    public WebElement secondProductTotal;


    //US13 PAGE Fikri
    @FindBy (xpath = "//a[@href='/product_details/7']")
    public WebElement seventhProductView;

    @FindBy(xpath = "//*[contains(text(),'Madame Top')]")
    public WebElement seventhProductTitle;

    @FindBy (xpath = "//*[@id='quantity']")
    public WebElement seventhProductDetailBox;

    @FindBy (xpath = "//*[@class='btn btn-default cart']")
    public WebElement seventhProductViewAddToCart;

    @FindBy (xpath = "//input[@value='1']")
    public WebElement productQuantityButton;


    @FindBy (xpath = "(//a[@href='/view_cart'])[2]")
    public WebElement SeventhProductViewCart;

    @FindBy (xpath = "//*[@class='disabled']")
    public WebElement seventhProductQuantity;


}
