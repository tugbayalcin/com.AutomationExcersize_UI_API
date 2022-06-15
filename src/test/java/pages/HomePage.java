package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy(xpath = "//ul//a[@href=\"/\"]")
    public WebElement headerHomeButon;

    @FindBy(xpath ="//ul/li[5]/a/i" )
    public WebElement testCaseButton;

    @FindBy(xpath = "//span")
    public WebElement testStepsText;
}
