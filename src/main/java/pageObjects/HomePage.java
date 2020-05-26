package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    @FindBy(xpath="//ul/li/a[@href=\"/login\"]")
    WebElement formAuthentication;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickFormAuthentication() {
        formAuthentication.click();
        return new LoginPage(driver);
    }
}
