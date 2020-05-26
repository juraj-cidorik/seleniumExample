package LoginTests;

import org.testng.annotations.Test;
import pageObjects.SecureAreaPage;
import workflows.LoginWorkflow;

public class LoginTest {

    @Test
    public void userLoginTest() {
        LoginWorkflow login = new LoginWorkflow();
        login.userLoginTest();
    }
}
