package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutCompletePage {
    public WebDriver driver;
    public WebDriverWait wait;
    WebElement getHomeButton;
    WebElement titleCheckoutComplete;

    public CheckoutCompletePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getGetHomeButton() {
        return driver.findElement(By.id("back-to-products"));
    }

    public WebElement getTitleCheckoutComplete() {
        return driver.findElement(By.className("title"));
    }
}