package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutStepTwoPage {
    public WebDriver driver;
    public WebDriverWait wait;
    WebElement cancelButton;
    WebElement finishButton;
    WebElement titleCheckoutOverview;

    public CheckOutStepTwoPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getCancelButton() {
        return driver.findElement(By.id("cancel"));
    }

    public WebElement getFinishButton() {
        return driver.findElement(By.id("finish"));
    }

    public WebElement getTitleCheckoutOverview() {
        return driver.findElement(By.className("title"));
    }
}