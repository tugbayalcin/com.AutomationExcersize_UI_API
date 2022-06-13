package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {PageFactory.initElements(Driver.getDriver(),this);  }

    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement headerSignUpbutonElement;

    @FindBy(xpath = "//h2[text()='New User Signup!']")
    public WebElement newUsersigupYaziElement;
    @FindBy(css = "[data-qa=\"login-email\"]")
    public WebElement loginSayfasiEmailAdressInput;
    @FindBy(css = "[data-qa=\"login-password\"]")
    public WebElement loginSayfasiPasswordInput;
    @FindBy(css = "[data-qa=\"login-button\"]")
    public WebElement loginSayfasiLoginButonu;

    @FindBy(xpath = "//a[text()=' Logged in as ']")
    public WebElement logInAsWebElement;
    @FindBy(xpath = "//a[text()=' Logout']")
    public WebElement headerLogOutButonu;
    @FindBy(xpath = "//h2[text()='Login to your account']")
    public WebElement loginYourAccountYazisi;




}
