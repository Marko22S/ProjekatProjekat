package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public HomePage homePage;
    public SwagsLabsSidebar swagsLabsSidebar;
    public InventoryPage inventoryPage;
    public CartPage cartPage;
    public CheckoutStepOnePage checkoutStepOnePage;
    public CheckOutStepTwoPage checkOutStepTwoPage;
    public CheckoutCompletePage checkoutCompletePage;


    @BeforeClass
    public void setUp() {

    WebDriverManager.chromedriver().setup();
    WebDriverManager.chromedriver().setup();

    }

    @AfterClass
    public void end(){
    }

    public void userLogin() {
        homePage.inputUsername("standard_user");
        homePage.inputPassword("secret_sauce");
        homePage.clickOnLoginButton();
    }
}





