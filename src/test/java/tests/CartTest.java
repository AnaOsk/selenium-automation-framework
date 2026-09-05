package tests;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;


public class CartTest extends BaseTest {


    @Test

    public void removeProductFromCart() {

        LoginPage loginPage =
                new LoginPage(driver);

        InventoryPage inventoryPage =
                new InventoryPage(driver);

        CartPage cartPage =
                new CartPage(driver);


        loginPage.login(
                "standard_user",
                "secret_sauce"
        );


        inventoryPage.addBackpackToCart();


        inventoryPage.openCart();


        Assert.assertTrue(
                cartPage.isBackpackDisplayed()
        );


        cartPage.removeBackpack();


        Assert.assertTrue(
                cartPage.isCartEmpty()
        );

    }
}