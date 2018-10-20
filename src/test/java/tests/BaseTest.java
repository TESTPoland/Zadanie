package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public HomePage homePage;
    public Actions action;

    String username = "tt_test2018@wp.pl";
    String password = "123456";

    @BeforeClass
    public void setup () {

        System.setProperty("webdriver.chrome.driver", "C:/Users/xxxxxxx/Desktop/chromedriver_win32/chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,15);
        driver.manage().window().maximize();
        homePage = new HomePage(driver,wait);
        action = new Actions(driver);
    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }
}
