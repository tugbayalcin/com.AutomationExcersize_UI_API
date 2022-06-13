package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {
    public ContactUsPage() {
        PageFactory.initElements(Driver.getDriver(),this);  }

    @FindBy(xpath = "//ul//a[@href=\"/contact_us\"]")
    public WebElement headerContactUsButon;

}
