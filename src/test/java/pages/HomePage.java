package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy(xpath = "//ul//a[@href=\"/\"]")
    public WebElement headerHomeButon;

    @FindBy(xpath ="//ul/li[5]/a/i" )
    public WebElement testCaseButton;

    @FindBy(xpath = "//span")
    public WebElement testStepsText;

    @FindBy(xpath = "//*[.='Add to cart']")
    public List<WebElement> addProductButtonsList;

    @FindBy(xpath = "(//*[.='View Cart'])[2]")
    public WebElement viewCartButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedinText;

    @FindBy(xpath = "//*[.=' Delete Account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//button[.='Delete']")
    public WebElement deleteAccoutConfirmationButton;
}
