package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By backpackItem =
            By.id("item_4_title_link");

    private By removeBackpackButton =
            By.id("remove-sauce-labs-backpack");

    private By cartItems =
            By.className("cart_item");


    public CartPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10)
        );
    }


    public boolean isBackpackDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        backpackItem
                )
        ).isDisplayed();
    }


	
	public void removeBackpack() {

    wait.until(
            ExpectedConditions.elementToBeClickable(
                    removeBackpackButton
            )
    ).click();

    wait.until(
            ExpectedConditions.numberOfElementsToBe(
                    cartItems,
                    0
            )
    );
}


    public boolean isCartEmpty() {

        return driver.findElements(cartItems).isEmpty();

    }
}
