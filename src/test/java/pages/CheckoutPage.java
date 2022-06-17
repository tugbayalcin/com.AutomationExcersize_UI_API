package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckoutPage {
    public CheckoutPage() {
        PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy (xpath = "//*[.='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//*[@name='message']")
    public WebElement textarea;

}
