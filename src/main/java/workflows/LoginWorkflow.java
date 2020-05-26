package workflows;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SecureAreaPage;

public class LoginWorkflow {

    WebDriver driver;
    private String BASE_URL = "https://the-internet.herokuapp.com/";

    public void userLoginTest() {
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(BASE_URL);
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.fillUsername("tomsmith");
        loginPage.fillPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
    }
}
