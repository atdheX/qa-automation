package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class GetEmployeeDetails {

    private static final String BASE_URL = "https://6143a99bc5b553001717d06a.mockapi.io";
    private static Response response;
    private static String jsonString;
    List<Map<String, String>> employeeFirstName;
    List<Map<String, String>> employeePhoneNumber;
    List<Map<String, String>> employeeId;

    @When("a list of the employee are available")
    public void a_list_of_the_employee_are_available() {
        RestAssured.baseURI = BASE_URL;

        RequestSpecification request = RestAssured.given();

        request.header("Content-Type", "application/json");
        response = request.get("/testapi/v1/Users");
        jsonString = response.asString();
    }

    @Then("the first employee name is {string}")
    public void the_first_employee_name_is(String string) {
        employeeFirstName = JsonPath.from(jsonString).get("employee_firstname");
        Assert.assertEquals(employeeFirstName.get(0), string);
    }

    @Then("his phone number is {string}")
    public void his_phone_number_is(String string) {
        employeePhoneNumber = JsonPath.from(jsonString).get("employee_phonenumbe");
        Assert.assertEquals(employeePhoneNumber.get(0), string);
    }

    @Then("the employee id is {string}")
    public void the_employee_id_is(String string) {
        employeeId = JsonPath.from(jsonString).get("id");
        Assert.assertEquals(employeeId.get(0), string);
    }
}
