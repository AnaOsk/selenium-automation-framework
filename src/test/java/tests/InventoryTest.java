package tests;

import base.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InventoryPage;
import pages.LoginPage;


public class InventoryTest extends BaseTest {


    @Test

    public void addProductToCart() {

        LoginPage loginPage =
                new LoginPage(driver);

        InventoryPage inventoryPage =
                new InventoryPage(driver);


        loginPage.login(
                "standard_user",
                "secret_sauce"
        );


        inventoryPage.addBackpackToCart();


        Assert.assertEquals(
                inventoryPage.getCartCount(),
                "1"
        );

    }


    @Test

    public void logoutUser() {

        LoginPage loginPage =
                new LoginPage(driver);

        InventoryPage inventoryPage =
                new InventoryPage(driver);


        loginPage.login(
                "standard_user",
                "secret_sauce"
        );


        inventoryPage.logout();


        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("saucedemo.com")
        );

    }

}