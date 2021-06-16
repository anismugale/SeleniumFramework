import commons.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

import static commons.Configuration.*;

public class LoginTest extends TestBase {

    @BeforeMethod
    public void openPage() {
        driver.get(url.asString());
    }

    @Test
    public void verifyLoginWithValidCred() {
    		LoginPage loginPage = new LoginPage(driver);
    		loginPage.textField();
    		loginPage.images();
    		

    }
}