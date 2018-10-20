package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String userId = "email";
    String passwordId = "passwd";
    String loginButtonId = "SubmitLogin";

    String username = "tt_test2018@wp.pl";


    public void loginToWeb(String username, String password){

        writeText(By.id(userId),username);
        writeText(By.id(passwordId), password);
        click(By.id(loginButtonId));
    }



}
