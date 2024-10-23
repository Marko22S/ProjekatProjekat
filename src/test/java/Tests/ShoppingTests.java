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

public class ShoppingTests extends BaseTest {

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
    public void shopping(){
        userLogin();
        Assert.assertEquals(inventoryPage.getTitleProducts().getText(), "Products");
        Assert.assertTrue(inventoryPage.getProductSortContainer().isDisplayed());
        Assert.assertTrue(inventoryPage.getInventoryContainer().isDisplayed());

        inventoryPage.getBackpackAddToCartButton().click();
        inventoryPage.getBikeLightAddToCartButton().click();
        inventoryPage.getBoltTSHirtAddToCartButton().click();
        inventoryPage.getFleeceJacketAddtoCartButton().click();
        inventoryPage.getOnesieAddtoCartButton().click();
        Assert.assertEquals(swagsLabsSidebar.getCartIcon().getText(), "5");

        inventoryPage.getBackpackRemoveButton().click();
        Assert.assertEquals(swagsLabsSidebar.getCartIcon().getText(), "4");

        swagsLabsSidebar.getCartIcon().click();


        cartPage.getCheckoutButton().click();
        Assert.assertTrue(checkoutStepOnePage.getContinueButton().isDisplayed());
        Assert.assertEquals(checkoutStepOnePage.getTitleCheckoutYourInformation().getText(), "Checkout: Your Information");
         checkoutStepOnePage.inputFirstName("Marko");
         checkoutStepOnePage.inputLastName("Stevanovic");
         checkoutStepOnePage.inputZip("12345");

        checkoutStepOnePage.getContinueButton().click();

        Assert.assertEquals(checkOutStepTwoPage.getTitleCheckoutOverview().getText(),"Checkout: Overview");
        Assert.assertTrue(checkOutStepTwoPage.getFinishButton().isDisplayed());
        checkOutStepTwoPage.getFinishButton().click();

        Assert.assertTrue(checkoutCompletePage.getGetHomeButton().isDisplayed());
        Assert.assertEquals(checkoutCompletePage.getTitleCheckoutComplete().getText(),"Checkout: Complete!");
        checkoutCompletePage.getGetHomeButton().click();
        Assert.assertTrue(inventoryPage.getProductSortContainer().isDisplayed());
        Assert.assertTrue(inventoryPage.getInventoryContainer().isDisplayed());
    }

    @AfterMethod
    public void tearDown(){
        swagsLabsSidebar.clickOnHamburgerMenu();
        wait.until(ExpectedConditions.visibilityOf(swagsLabsSidebar.getResetAppStateLink()));
        swagsLabsSidebar.getResetAppStateLink().click();
        wait.until(ExpectedConditions.visibilityOf(swagsLabsSidebar.getLogoutLink()));
        swagsLabsSidebar.getLogoutLink().click();
        driver.quit();
    }

}