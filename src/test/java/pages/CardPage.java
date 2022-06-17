package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CardPage {
    public CardPage() {
        PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy(xpath = "//ul//a[@href=\"/view_cart\"]")
    public WebElement headerCardpageButton;

    @FindBy(xpath = "//*[.='Proceed To Checkout']")
    public WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//a[.='Register / Login']")
    public WebElement registerLoginButton;

    @FindBy(id = "product-1")
    public WebElement firstProduct;


}
