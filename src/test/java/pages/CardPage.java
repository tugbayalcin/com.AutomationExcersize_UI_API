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

    @FindBy(xpath = "//i[@class='fa fa-times']")
    public WebElement productDelete;

    @FindBy (xpath = "(//p[@class='text-center'])[3]")
    public WebElement cartEmptyText;
}
