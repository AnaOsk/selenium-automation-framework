package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InventoryPage;
import pages.LoginPage;


public class LoginTest extends BaseTest {


    @Test

    public void successfulLogin() {

        LoginPage loginPage =
                new LoginPage(driver);

        InventoryPage inventoryPage =
                new InventoryPage(driver);


        loginPage.login(
                "standard_user",
                "secret_sauce"
        );


        Assert.assertTrue(
                inventoryPage.isInventoryDisplayed(),
                "Inventory page is not displayed!"
        );

    }


    @Test

    public void invalidLogin() {

        LoginPage loginPage =
                new LoginPage(driver);


        loginPage.login(
                "wrong_user",
                "wrong_password"
        );


        Assert.assertTrue(

                loginPage
                        .getErrorMessage()
                        .contains("Username and password do not match")

        );

    }
    @Test

    public void verifyLoginPageTitle() {

        Assert.assertTrue(
                driver.getTitle()
                        .contains("Swag Labs")
        );

    }

}