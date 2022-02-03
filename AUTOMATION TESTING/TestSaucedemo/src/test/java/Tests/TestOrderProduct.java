package Tests;

import BaseClass.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOrderProduct extends Driver {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void orderOneProduct(){
        logInPage.logIn();
        Assert.assertTrue(homePageHeader.getTitle().getText().contains("PRODUCTS"), "User not LoginHappyPath");
        homePageProduct.clickAddToCartSauceLabsBackpack();
        homePageHeader.clickCartButton();
        Assert.assertTrue(cartPage.cartSize() == 1,"There is not one element in the list");
        cartPage.clickCheckoutButton();
        checkoutPage.checkOutYoutInformation("Pera","Peric","123456");
        checkoutPage.clickContinueButton();
        checkoutOverviewPage.clickFinish();
        Assert.assertTrue(checkoutCompletePage.getTextTitle().contains("COMPLETE!"));

    }
}
