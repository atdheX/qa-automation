package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;

    WebElement longWait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "(//a[@class='no-ext ext'])[1]")
    private WebElement btn_careers;

    public void click_careers_menu() {
        btn_careers.click();
        new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigateTo_HomePage() {
        driver.get("https://www.labcorp.com/");
    }
}
