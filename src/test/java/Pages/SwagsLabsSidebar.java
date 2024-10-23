package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagsLabsSidebar {
    public WebDriver driver;
    public WebDriverWait wait;
    WebElement cartIcon;
    WebElement hamburgerMenu;
    WebElement logoutLink;
    WebElement ResetAppStateLink;

    public SwagsLabsSidebar(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getCartIcon() {
        return driver.findElement(By.id("shopping_cart_container"));
    }

    public WebElement getHamburgerMenu() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }


    public WebElement getLogoutLink() {
        return driver.findElement(By.id("logout_sidebar_link"));
    }

    public WebElement getResetAppStateLink() {
        return driver.findElement(By.id("reset_sidebar_link"));
    }


    public void clickOnHamburgerMenu() {
        getHamburgerMenu().click();
    }
}