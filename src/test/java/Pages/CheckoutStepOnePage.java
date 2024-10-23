package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutStepOnePage {
    public WebDriver driver;
    public WebDriverWait wait;
    WebElement firstNameField;
    WebElement lastNameField;
    WebElement zipField;
    WebElement cancelButton;
    WebElement continueButton;
    WebElement titleCheckoutYourInformation;

    public CheckoutStepOnePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getFirstNameField() {
        return driver.findElement(By.id("first-name"));
    }

    public WebElement getLastNameField() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement getZipField() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getCancelButton() {
        return driver.findElement(By.id("cancel"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }

    public WebElement getTitleCheckoutYourInformation() {
        return driver.findElement(By.className("title"));
    }

    public void inputFirstName (String firstName){
        getFirstNameField().clear();
        getFirstNameField().sendKeys(firstName);
    }

    public void inputLastName (String lastName){
        getLastNameField().clear();
        getLastNameField().sendKeys(lastName);
    }

    public void inputZip (String zip) {
        getZipField().clear();;
        getZipField().sendKeys(zip);
    }

}




