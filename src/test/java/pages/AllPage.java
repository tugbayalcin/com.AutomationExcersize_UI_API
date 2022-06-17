package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllPage {
    public AllPage() {}
    private CardPage cardPage;
    private ContactUsPage contactUsPage;
    private HomePage homePage;
    private LoginPage loginPage;
    private ProductPage productPage;
    private SignupPage signupPage;
    private CheckoutPage checkoutPage;
    private PaymentPage paymentPage;

    public CardPage cardPage(){
        if (cardPage==null){
            cardPage=new CardPage();
        }return cardPage;
    }
    public ContactUsPage contactUsPage(){
        if(contactUsPage==null){
            contactUsPage=new ContactUsPage();
        }return contactUsPage;
    }

    public HomePage homePage(){
        if(homePage==null){
            homePage=new HomePage();
        }return homePage;
    }
    public LoginPage loginPage(){
        if(loginPage==null){
            loginPage=new LoginPage();
        }return loginPage;
    }

    public ProductPage productPage(){
        if (productPage==null) {
            productPage=new ProductPage();
        }return productPage;
    }
    public SignupPage signupPage(){
        if (signupPage==null){
            signupPage=new SignupPage();
        }return signupPage;
    }
    public CheckoutPage checkoutPage(){
        if (checkoutPage==null){
            checkoutPage=new CheckoutPage();
        }return checkoutPage;
    }

    public PaymentPage paymentPage(){
        if (paymentPage==null){
            paymentPage=new PaymentPage();
        }return paymentPage;
    }
}
