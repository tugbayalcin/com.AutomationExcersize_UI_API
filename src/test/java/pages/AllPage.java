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

}
