package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CardPage {
    public CardPage() {
        PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy(xpath = "//ul//a[@href=\"/view_cart\"]")
    public WebElement headerCardpageButton;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[3]")
    public WebElement addToCartButonu;

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement continueButton;


    @FindBy(xpath = "//*[@class='cart_description']")
    public List<WebElement> productsInCart;
    @FindBy(xpath = "//u[.='here']")
    public List<WebElement> hereCart;

   // @FindBy(xpath = "//button[.='Continue Shopping']")
 //   public List<WebElement> continueShopping;

    @FindBy(xpath = "//b[text()='Order Placed!']")
    public WebElement successMessageYazisi;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "(//p[@class='text-center'])[2]")
    public WebElement registerLoginButtonu;

    @FindBy(xpath = "//button[text()='Create Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedYaziElementi;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement loggedinAsYaziElementi;

    @FindBy(xpath = "//a[@href='/download_invoice/400']")
    public WebElement invoiceButton;
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement continueButtont;

    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[3]")
    public WebElement addToCartButonut;

    @FindBy(xpath = "//u[text()='View Cart']")
    public WebElement viewCartButonu;

    @FindBy(xpath = "//button[text()='Continue Shopping']")
    public WebElement continueShoppingButonu;


}
