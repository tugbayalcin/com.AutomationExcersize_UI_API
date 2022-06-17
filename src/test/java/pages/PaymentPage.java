package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PaymentPage {
    public PaymentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "name_on_card")
    public WebElement nameOnCardTextBox;

    @FindBy(name = "card_number")
    public WebElement cardNumberTextBox;

    @FindBy(name = "cvc")
    public WebElement cvcTextBox;

    @FindBy(name = "expiry_month")
    public WebElement expiryMonthTextBox;

    @FindBy(name = "expiry_year")
    public WebElement expiryYearTextBox;

    @FindBy(id = "submit")
    public WebElement payAndConfitmOrderButton;

    @FindBy(xpath = "//*[.='Order Placed!']")
    public WebElement orderPlacedText;


}
