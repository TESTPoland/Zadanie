package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {



    @Test (priority = 1)
    public void LoginTest () {

        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);

        homePage.goToHome();
        homePage.goToLoginPage();
        loginPage.loginToWeb(username, password);

    }

}
