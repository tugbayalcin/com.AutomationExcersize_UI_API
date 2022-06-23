package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.AutomationexerciseBaseUrl;

import static io.restassured.RestAssured.given;

public class Api07Steps extends AutomationexerciseBaseUrl {


    Response response;

    // API7	API URL:https://automationexercise.com/api/verifyLogin	BEKLEMEDE	FAIL
    //	Request Method:POST
    //	Request Parameters:email, password
    //	Response Code:200
    //	Response Message:User exists!


    //  spec.pathParams("first", "api","second","verifyLogin");


    @Given("The user sends a request to the endpoint")
    public void theUserSendsARequestToTheEndpoint() {
        setUp();

        // Ecpected Data ????

        spec.pathParams("1","api","2","verifyLogin");
        Response response=given().
                contentType(ContentType.JSON).
                spec(spec).body("????").when().post("/{1}/{2}");




    }


    @When("User status code verifies")
    public void userStatusCodeVerifies() {
    }

    @And("User updates information")
    public void userUpdatesInformation() {

    }

    @Then("It is verified that the information is updated")
    public void itIsVerifiedThatTheInformationIsUpdated() {
    }
}
