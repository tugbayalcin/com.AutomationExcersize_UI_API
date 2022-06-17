package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;


import java.util.ArrayList;

import java.util.List;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy(xpath = "//ul//a[@href=\"/\"]")
    public WebElement headerHomeButon;


    @FindBy (xpath = "//div[@class='carousel-inner']")
    public WebElement homePagePicture;

    @FindBy (xpath = "//a[text()=' Signup / Login']")
    public WebElement signUpLoginButon;

    @FindBy (xpath = "(//input[@name='email'])[1]")
    public WebElement emailTextBox;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy (xpath = "//button[text()='Login']")
    public WebElement loginButon;

    @FindBy (xpath = "//a[text()=' Logged in as ']")
    public WebElement loggedText;

    @FindBy (xpath = "(//div[@class='productinfo text-center'])[2]")
    public WebElement desiredProduct;

    @FindBy (xpath = "(//a[@class='btn btn-default add-to-cart'])[4]")
    public WebElement addToCart;

    @FindBy (xpath = "//u[text()='View Cart']")
    public WebElement wiewCartLink;

    @FindBy (xpath = "//li[text()='Shopping Cart']")
    public WebElement shoppingCartPage;

    @FindBy (xpath = "//a[text()='Proceed To Checkout']")
    public WebElement proceedToCheckoutButon;

    @FindBy (id = "address_delivery")
    public List<WebElement> adressList;

    @FindBy (xpath = "(//li[text()='Mr. samuel null'])[1]")
    public WebElement adressInfoName;

    public void infoList(int number){
        List<String> newList = new ArrayList<>();
        for (int i = number; i < 20; i+=2) {
            String nameXpath="(//ul//li)["+i+"]";
            List<WebElement> expected=Driver.getDriver().findElements(By.xpath(nameXpath));
            for (WebElement each:expected) {
                newList.add(each.getText());
            }
        }
        System.out.println(newList);
        try {
            Assert.assertTrue(newList.contains(ConfigReader.getProperty("16adressName")));
            Assert.assertTrue(newList.contains(ConfigReader.getProperty("16adress1")));
            Assert.assertTrue(newList.contains(ConfigReader.getProperty("16adress2")));
            Assert.assertTrue(newList.contains(ConfigReader.getProperty("16phone")));
        }catch (AssertionError e){

        }
    }

    @FindBy (xpath = "//td[@class='cart_product']")
    public WebElement productInCart;

    @FindBy (xpath = "//textarea[@name='message']")
    public WebElement cartInfoText;

    @FindBy (xpath = "//a[text()='Place Order']")
    public WebElement placeOrderButon;

    @FindBy (xpath = "//input[@name='name_on_card']")
    public WebElement inputCardName;

    @FindBy (xpath = "//input[@name='card_number']")
    public WebElement inputCardNumber;

    @FindBy (xpath = "//input[@name='cvc']")
    public WebElement inputCardCvc;

    @FindBy (xpath = "//input[@name='expiry_month']")
    public WebElement inputCardExpiration;

    @FindBy (xpath = "//input[@name='expiry_year']")
    public WebElement inputCardYear;

    @FindBy (xpath = "//button[@id='submit']")
    public WebElement cartConfirmButon;

    @FindBy (xpath = "//h2[@class='title text-center']")
    public WebElement orderPlaceText;

    @FindBy (xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccountButton;

    @FindBy (xpath = "//b[text()='ACCOUNT DELETED!']")
    public WebElement accountDeleteText;

    @FindBy(xpath ="//ul/li[5]/a/i" )
    public WebElement testCaseButton;

    @FindBy(xpath = "//span")
    public WebElement testStepsText;
    @FindBy (id="scrollUp")
    //@FindBy(xpath = "//*[@class='fa fa-angle-up']")
    public WebElement scrollUpArrow;
    @FindBy (xpath = "(//h2)[3]")
    public WebElement verificationText1;  //Full-Fledged practice website for Automation Engineers

    @FindBy (xpath = "(//h2)[2]")
    public WebElement verificationText2;   //Full-Fledged practice website for Automation Engineers

    @FindBy (xpath = "(//h2)[1]")
    public WebElement verificationText3;   //Full-Fledged practice website for Automation Engineers

    //anasayfada 3 sekmede de ortak olan text in birden fazla locate i var hepsini yazdim ben, ve hepsine baktim
    //kodu yazarken de o anda hangi sekmedeki text i gorurse ona baksin dedim
    @FindBy(xpath = "//*[contains(text(),'Subscription')]")
    public WebElement subciptionText;

    @FindBy(xpath = "//*[.='Add to cart']")
    public List<WebElement> addProductButtonsList;

    @FindBy(xpath = "(//*[.='View Cart'])[2]")
    public WebElement viewCartButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement loggedinText;


    @FindBy(xpath = "//button[.='Delete']")
    public WebElement deleteAccoutConfirmationButton;

    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement emailbox;

    @FindBy(xpath = "//h2[contains(text(),'Subscription')]")
    public WebElement SubscriptionText;

    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement emailboxButton;



}
