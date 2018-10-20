package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Utils;
import java.util.List;

public class HomePage extends BasePage {


    public HomePage (WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String baseURL = "http://automationpractice.com/index.php";
    String signInButtonClass = "login";



   public WebElement getDressesButton() {
        return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]"), 30);
    }
   public WebElement getCasualDressesButton() {
        return Utils.waitToBeClickable(driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]//a[contains(text(), \"Casual Dresses\")]"), 30);
    }

    public WebElement getCasualDressProduct(int dressNum) {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li[" + dressNum + "]"), 30);
    }
    public List<WebElement> getDressesCount() {
        return driver.findElements(By.xpath("//*[@id=\"center_column\"]/ul/li"));

    }
    public WebElement getAddToCartButton() {
        return Utils.waitForElementPresence(driver, By.xpath("//*[@id=\"center_column\"]/ul/li//span[contains(text(), \"Add to cart\")]"), 30);
    }
    public WebElement getContinueShoppingButton() {
        return Utils.waitToBeClickable(driver, By.xpath("//span[@title=\"Continue shopping\"]"), 30);
    }

    public WebElement getCartTab() {
        return Utils.waitForElementPresence(driver, By.xpath("//b[contains(text(), \"Cart\")]/.."), 30);
    }

    public List<WebElement> getCartProducts() {
        return driver.findElements(By.xpath("//dt"));
    }

    public WebElement getCartProducts(int numOfProduct) {
        return Utils.waitForElementPresence(driver, By.xpath("//dt[" + numOfProduct + "]//span[@class=\"quantity\"]"), 30);
    }

    public WebElement getCartTotalPrice() {
        return Utils.waitForElementPresence(driver, By.xpath("//span[@class=\"price cart_block_total ajax_block_cart_total\"]"), 30);
    }

    public WebElement getCartShipingCost() {
        return Utils.waitForElementPresence(driver, By.xpath("//div[@class=\"cart-prices\"]//span[contains(.,\"$2.00\")]"), 30);
    }

    public void goToHome (){
        driver.get(baseURL);
    }

    public void goToLoginPage (){
        click(By.className(signInButtonClass));
    }

}
