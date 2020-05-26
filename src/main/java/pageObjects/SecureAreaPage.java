package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SecureAreaPage {

    private WebDriver driver;


    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifySuccessfulLogin() {
        String successMessage = driver.findElement(By.xpath("//div[@id=\"flash\"]")).getText();
        System.out.println(successMessage);
    }
}
