package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CareerPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import java.time.Duration;
import java.util.ArrayList;

public class JobListing {

    public WebDriver driver;

    public WebDriverWait wait;

    public HomePage homePage;

    public CareerPage careerPage;

    public LoginPage loginPage;

    @Before
    public void beforeSetup(){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Given("the user is on the Home Page")
    public void the_user_is_on_the_Home_Page() {
        homePage = new HomePage(driver);
        homePage.navigateTo_HomePage();
    }

    @When("he click on Career Menu")
    public void he_click_on_career_menu() {
        homePage.click_careers_menu();
    }

    @When("search for {string}")
    public void search_for(String string) {
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        careerPage = new CareerPage(driver);

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(careerPage.getTextbox_search()));

        careerPage.input_search_query(string);
        careerPage.click_submit_button();
    }

    @When("select the result that match with the input")
    public void select_the_result_that_match_with_the_input() {
        wait.until(ExpectedConditions.visibilityOf(careerPage.getLi_search_result()));
        careerPage.click_search_result();
    }

    @Then("job title should be {string}")
    public void job_title_should_be(String string) {
        wait.until(ExpectedConditions.visibilityOf(careerPage.getText_job_title()));
        Assert.assertTrue(careerPage.getText_job_title().getText().contains(string));
    }

    @Then("job location is at {string}")
    public void job_location_is_at(String string) {
        Assert.assertTrue(careerPage.getText_job_location().getText().contains(string));
    }

    @Then("job id is {string}")
    public void job_id_is(String string) {
        Assert.assertTrue(careerPage.getText_job_id().getText().contains(string));
    }

    @Then("the second bullet point of Management Support is {string}")
    public void the_second_bullet_point_of_management_support_is(String string) {
        Assert.assertTrue(careerPage.getText_second_point_of_management_support().getText().contains(string));
    }

    @Then("the third point of the Requirements is {string}")
    public void the_third_point_of_the_requirements_is(String string) {
        Assert.assertTrue(careerPage.getText_third_point_of_requirements().getText().contains(string));
    }

    @Then("the first suggested automation tools is {string}")
    public void the_first_suggested_automation_tools_is(String string) {
        Assert.assertEquals(careerPage.getFirstSuggestedAutomationTool(), string);
    }

    @When("he click Apply Now")
    public void he_click_apply_now() {
        careerPage.click_apply_now();
    }

    @Then("he asked to login first")
    public void he_asked_to_login_first() {
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));

        loginPage = new LoginPage(driver);
        wait.until(ExpectedConditions.visibilityOf(loginPage.getText_login_page_title()));

        Assert.assertEquals(loginPage.getText_login_page_title().getText(), "Sign In");
    }

    @After
    public void afterTest( ) {
        driver.quit();
    }
}
