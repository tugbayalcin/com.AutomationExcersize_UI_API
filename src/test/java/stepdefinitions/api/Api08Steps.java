package stepdefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pojos.AutomationexerciseBaseUrl;

import static io.restassured.RestAssured.given;

public class Api08Steps extends AutomationexerciseBaseUrl {

    Response response;

    //API8	API URL:https://automationexercise.com/api/verifyLogin	Response Kodun 400 olduğunu ve Response mesajı doğrulayın
    //	Request Method:POST
    //	Request Parameter:password
    //	Response Code:400
    //	Response Message:Bad request, email or password parameter is missing in POST request.


    @Given("The user sends a request to the endpoint")
    public void theUserSendsARequestToTheEndpoint() {
        setUp();

        spec.pathParams("1","api","2","verifyLogin");
        response=given().
                contentType(ContentType.JSON).
                spec(spec).body("????").when().post("/{1}/{2}");
        response.prettyPrint();


    }

    @When("User status code verifies")
    public void userStatusCodeVerifies() {
        String expectedCode="400";
        int responseCode= Integer.valueOf(response.jsonPath().getString("responseCode"));
        Assert.assertEquals(expectedCode,responseCode);

        String expectedMessage="This request method is not supported.";
        String message=response.jsonPath().getString("message");
        Assert.assertEquals(expectedMessage,message);




    }


}
