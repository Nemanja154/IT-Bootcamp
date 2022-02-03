package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BaseClass.Driver;

public class TestSortProduct extends Driver {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    /**Test sort products from A to Z
     * Log in parametars: username = standard_user , password = secret_sauce
     * 1.Go on web site url = https://www.saucedemo.com/
     * 2
     *
     */

    @Test
    public void sortByNameAZ() throws InterruptedException {
        logInPage.logIn();
        homePageHeader.sortProduct("az");

        Assert.assertTrue(homePageProduct.inventoryListName() <= 0, "Not sort");
    }

    @Test
    public void sortByNameZA() throws InterruptedException {
        logInPage.logIn();
        homePageHeader.sortProduct("za");

        Assert.assertTrue(homePageProduct.inventoryListName() >= 0, "Not sort");
    }

    @Test
    public void sortByPriceLoHi() throws InterruptedException {
        logInPage.logIn();
        homePageHeader.sortProduct("lohi");

        Assert.assertTrue(homePageProduct.inventoryListPrice() <= 0, "Not sort");
    }

    @Test
    public void sortByPriceHiLo() throws InterruptedException {
        logInPage.logIn();
        homePageHeader.sortProduct("hilo");

        Assert.assertTrue(homePageProduct.inventoryListPrice() >= 0, "Not sort");
    }


}
