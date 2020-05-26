package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    @FindBy(id="username")
    WebElement usernameField;
    @FindBy(id="password")
    WebElement passwordField;
    @FindBy(xpath="//button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillUsername(String usernameValue) {
        driver.findElement(By.id("username")).sendKeys(usernameValue);
        usernameField.sendKeys(usernameValue);
    }

    public void fillPassword(String passwordValue) {
        passwordField.sendKeys(passwordValue);
    }

    public SecureAreaPage clickLoginButton() {
        loginButton.click();
        return new SecureAreaPage(driver);
    }
}
