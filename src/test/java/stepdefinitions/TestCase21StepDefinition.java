package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPage;
import utilities.ConfigReader;
import utilities.JSUtils;

public class TestCase21StepDefinition
{
    AllPage obje=new AllPage();
    Faker faker = new Faker();

    @And("Verify {string} is visible")
    public void verifyWriteYourReviewIsVisible(String string)
    {
        JSUtils.scrollIntoVIewJS(obje.productPage().reviewsLine);
        Assert.assertEquals(ConfigReader.getProperty("expectedReviewLineText"),obje.productPage().reviewsLine.getText());
    }

    @Then("Enter name, email and review")
    public void enterNameEmailAndReview()
    {
        JSUtils.scrollIntoVIewJS(obje.productPage().reviewsNameTextBox);
        obje.productPage().reviewsNameTextBox.sendKeys(faker.name().fullName());

        JSUtils.scrollIntoVIewJS(obje.productPage().reviewsEmailTextBox);
        obje.productPage().reviewsEmailTextBox.sendKeys(faker.internet().safeEmailAddress());

        JSUtils.scrollIntoVIewJS(obje.productPage().reviewsTextArea);
        obje.productPage().reviewsTextArea.sendKeys(faker.lorem().sentence());

    }

    @And("Click {string} button")
    public void clickSubmitButton(String string)
    {
        JSUtils.scrollIntoVIewJS(obje.productPage().reviewSubmitButton);
        JSUtils.clickElementByJS(obje.productPage().reviewSubmitButton);
    }


    @Then("Verify success message {string}")
    public void verifySuccessMessageThankYouForYourReview(String string)
    {

    }
}
