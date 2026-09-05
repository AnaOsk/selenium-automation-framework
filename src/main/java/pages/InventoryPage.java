package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {

    private WebDriver driver;

    private WebDriverWait wait;


    private By inventoryContainer =
            By.id("inventory_container");

    private By backpackButton =
            By.id("add-to-cart-sauce-labs-backpack");

    private By cartBadge =
            By.className("shopping_cart_badge");

    private By cartButton =
            By.className("shopping_cart_link");

    private By menuButton =
            By.id("react-burger-menu-btn");

    private By logoutButton =
            By.id("logout_sidebar_link");


    public InventoryPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );

    }


    public boolean isInventoryDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        inventoryContainer
                )
        ).isDisplayed();

    }


    public void addBackpackToCart() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        backpackButton
                )
        ).click();

    }


    public String getCartCount() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        cartBadge
                )
        ).getText();

    }


    public void openCart() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        cartButton
                )
        ).click();

    }


    public void logout() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        menuButton
                )
        ).click();

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        logoutButton
                )
        ).click();

    }

}