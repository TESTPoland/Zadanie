package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class CheckCartPriceTest extends BaseTest {



    @Test (priority = 1)
    public void CheckCartPriceTest () {

        HomePage homePage = new HomePage(driver,wait);
        LoginPage loginPage = new LoginPage(driver,wait);


        homePage.goToHome();
        homePage.goToLoginPage();
        loginPage.loginToWeb(username, password);
        homePage.goToHome();


        Assert.assertTrue(homePage.getDressesButton().isDisplayed());
        action.moveToElement(homePage.getDressesButton()).perform();

        Assert.assertTrue(homePage.getCasualDressesButton().isDisplayed());
        action.moveToElement(homePage.getCasualDressesButton()).perform();
        homePage.getCasualDressesButton().click();

        action.moveToElement(homePage.getCasualDressProduct(1)).perform();
        action.moveToElement(homePage.getAddToCartButton()).perform();
        Assert.assertEquals(homePage.getDressesCount().size(), 1);

        Assert.assertTrue(homePage.getAddToCartButton().isDisplayed());
        action.click(homePage.getAddToCartButton()).build().perform();

        action.click(homePage.getContinueShoppingButton()).build().perform();
        Assert.assertTrue(homePage.getContinueShoppingButton().isDisplayed());

        action.moveToElement(homePage.getCartTab()).perform();
        Assert.assertEquals(homePage.getCartProducts().size(), 1);



        action.moveToElement(homePage.getDressesButton()).perform();
        action.moveToElement(homePage.getCasualDressesButton()).perform();
        action.moveToElement(homePage.getCasualDressProduct(1)).perform();
        action.moveToElement(homePage.getAddToCartButton()).perform();
        action.click(homePage.getAddToCartButton()).build().perform();
        action.click(homePage.getContinueShoppingButton()).build().perform();

        action.moveToElement(homePage.getCartTab()).perform();
        action.moveToElement(homePage.getCartShipingCost()).perform();

        Assert.assertEquals(homePage.getCartShipingCost().getText(), "$2.00");

        action.moveToElement(homePage.getCartTotalPrice()).perform();

        Assert.assertEquals(homePage.getCartTotalPrice().getText(), "$54.00");
    }


}
