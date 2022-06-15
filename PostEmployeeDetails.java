package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojo.UserDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostEmployeeDetails {

    private static final String BASE_URL = "https://6143a99bc5b553001717d06a.mockapi.io";
    private static Response response;
    private static String jsonString;
    String errorMessage;

    UserDetails user;

    @When("he submit the new employee")
    public void he_submit_the_new_employee() {

        user = new UserDetails(1631824813, "lucas", "david", "940-588-500", "test@gmail.com",
                "citemployee_addressy 1", "stateemployee_dev_level 1", "employee_gender 1",
                "2033-02-05T21:36:16.575Z", false, new ArrayList<>(), new ArrayList<>());

        RestAssured.baseURI = BASE_URL;
        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");
        request.body(user);
        response = request.post("/testapi/v1/Users");
        jsonString = response.asString();
    }

    @Then("the status code should be {string}")
    public void the_status_code_should_be(String string) {
        Assert.assertEquals(response.getStatusCode(), Integer.parseInt(string));
    }

    @Then("the error message is {string}")
    public void the_error_message_is (String string) {
        errorMessage = jsonString;
        Assert.assertTrue(errorMessage.contains(string));
    }

}
