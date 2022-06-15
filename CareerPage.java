package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CareerPage {
    WebDriver driver;

    public CareerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID, using = "typehead")
    private WebElement textbox_search;

    @FindBy(how = How.ID, using = "ph-search-backdrop")
    private WebElement btn_submit_search_query;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'QA Test Automation Developer')])[1]")
    private WebElement li_search_result;

    @FindBy(how = How.CLASS_NAME, using = "job-title")
    private WebElement text_job_title;

    @FindBy(how = How.XPATH, using = "//span[@class='au-target job-location']")
    private WebElement text_job_location;

    @FindBy(how = How.XPATH, using = "(//span[@class='au-target jobId'])[1]")
    private WebElement text_job_id;

    @FindBy(how = How.XPATH, using = "//p[normalize-space()='Prepare test plans, budgets, and schedules.']")
    private WebElement text_second_point_of_management_support;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'5+ years of experience in QA automation developmen')]")
    private WebElement text_third_point_of_requirements;

    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Familiar with common test automation tools includi')]")
    private WebElement text_thirteen_point_of_requirements;

    @FindBy(how = How.XPATH, using = "//a[@aria-label='Apply for COVAGLOBAL2190223RMEXTERNALENGLOBAL']")
    private WebElement btn_apply_now;

    public WebElement getTextbox_search() {
        return textbox_search;
    }

    public WebElement getLi_search_result() {
        return li_search_result;
    }

    public WebElement getText_job_title() {
        return text_job_title;
    }

    public WebElement getText_job_location() {
        return text_job_location;
    }

    public WebElement getText_job_id() {
        return text_job_id;
    }

    public WebElement getText_second_point_of_management_support() {
        return text_second_point_of_management_support;
    }

    public WebElement getText_third_point_of_requirements() {
        return text_third_point_of_requirements;
    }

    public String getFirstSuggestedAutomationTool() {
        String text = text_thirteen_point_of_requirements.getText();
        Pattern pattern = Pattern.compile(": ([^,]+)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }

    public void input_search_query(String input) {
        textbox_search.sendKeys(input);
    }

    public void click_submit_button() {
        btn_submit_search_query.click();
    }

    public void click_search_result() {
        li_search_result.click();
    }

    public void click_apply_now() {
        btn_apply_now.click();
    }

}
