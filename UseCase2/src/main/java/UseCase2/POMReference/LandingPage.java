package UseCase2.POMReference;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement username;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password;

    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement submit;
    
    @FindBy(css = ".oxd-alert-content")
    WebElement errorMessage;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public void login(String uname, String pass) {
        username.sendKeys(uname);
        password.sendKeys(pass);
        submit.click();
    }
    
    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText();
    }
}
