package Tests;

import Base.BaseTest;
import Pages.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginAndLogoutTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        homePage = new HomePage(driver, wait);
        swagsLabsSidebar = new SwagsLabsSidebar(driver, wait);
        inventoryPage = new InventoryPage(driver, wait);
        cartPage = new CartPage(driver, wait);
        checkoutStepOnePage = new CheckoutStepOnePage(driver, wait);
        checkOutStepTwoPage = new CheckOutStepTwoPage(driver, wait);
        checkoutCompletePage = new CheckoutCompletePage(driver, wait);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

    }


    @Test (priority = 10)
    public void userCanLoginWithValidCredentials(){
        homePage.inputUsername("standard_user");
        homePage.inputPassword("secret_sauce");
        homePage.clickOnLoginButton();
        Assert.assertTrue(swagsLabsSidebar.getHamburgerMenu().isDisplayed());
        Assert.assertTrue(swagsLabsSidebar.getCartIcon().isDisplayed());
        Assert.assertTrue(inventoryPage.getInventoryContainer().isDisplayed());
    }

    @Test (priority = 20)
    public void userCanLogout(){
        userLogin();
        swagsLabsSidebar.clickOnHamburgerMenu();
        wait.until(ExpectedConditions.visibilityOf(swagsLabsSidebar.getLogoutLink()));
        swagsLabsSidebar.getLogoutLink().click();
        Assert.assertTrue(homePage.getUsernameField().isDisplayed());
        Assert.assertTrue(homePage.getLoginButton().isDisplayed());
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}