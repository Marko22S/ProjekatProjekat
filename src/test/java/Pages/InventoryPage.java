package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
    public WebDriver driver;
    public WebDriverWait wait;
    WebElement inventoryContainer;
    WebElement backpackAddToCartButton;
    WebElement backpackRemoveButton;
    WebElement bikeLightAddToCartButton;
    WebElement boltTSHirtAddToCartButton;
    WebElement fleeceJacketAddtoCartButton;
    WebElement onesieAddtoCartButton;
    WebElement tShirtRedAddtoCartButton;
    WebElement titleProducts;
    WebElement productSortContainer;



    public InventoryPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getInventoryContainer() {
        return driver.findElement(By.id("inventory_container"));
    }

    public WebElement gettShirtRedAddtoCartButton() {
        return driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    }

    public WebElement getOnesieAddtoCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
    }

    public WebElement getFleeceJacketAddtoCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    }

    public WebElement getBoltTSHirtAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    }

    public WebElement getBikeLightAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
    }

    public WebElement getBackpackAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getTitleProducts() {
        return driver.findElement(By.className("title"));
    }

    public WebElement getProductSortContainer() {
        return driver.findElement(By.className("product_sort_container"));
    }

    public WebElement getBackpackRemoveButton() {
        return driver.findElement(By.id("remove-sauce-labs-backpack"));

    }



}