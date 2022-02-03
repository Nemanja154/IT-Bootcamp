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
     * Log in parameters: username = standard_user , password = secret_sauce
     * 1.Go on website url = https://www.saucedemo.com/
     * 2.Log In(username = standard_user, password = secret_sauce
     * 3.Click button log in
     * 4.Sort products from A to Z
     * Assert is sort
     */

    @Test
    public void sortByNameAZ() throws InterruptedException {
        logInPage.logIn();
        homePageHeader.sortProduct("az");

        Assert.assertTrue(homePageProduct.inventoryListName() <= 0, "Not sort");
    }

    /**Test sort products from Z to A
     * Log in parameters: username = standard_user , password = secret_sauce
     * 1.Go on website url = https://www.saucedemo.com/
     * 2.Log In(username = standard_user, password = secret_sauce
     * 3.Click button log in
     * 4.Sort products from Z to A
     * Assert is sort
     */


    @Test
    public void sortByNameZA() throws InterruptedException {
        logInPage.logIn();
        homePageHeader.sortProduct("za");

        Assert.assertTrue(homePageProduct.inventoryListName() >= 0, "Not sort");
    }

    /**Test sort products by price from low to high
     * Log in parameters: username = standard_user , password = secret_sauce
     * 1.Go on website url = https://www.saucedemo.com/
     * 2.Log In(username = standard_user, password = secret_sauce
     * 3.Click button log in
     * 4.Sort products from low to high
     * Assert is sort
     */

    @Test
    public void sortByPriceLoHi() throws InterruptedException {
        logInPage.logIn();
        homePageHeader.sortProduct("lohi");

        Assert.assertTrue(homePageProduct.inventoryListPrice() <= 0, "Not sort");
    }

    /**Test sort products by price from high to low
     * Log in parameters: username = standard_user , password = secret_sauce
     * 1.Go on website url = https://www.saucedemo.com/
     * 2.Log In(username = standard_user, password = secret_sauce
     * 3.Click button log in
     * 4.Sort products from high to low
     * Assert is sort
     */


    @Test
    public void sortByPriceHiLo() throws InterruptedException {
        logInPage.logIn();
        homePageHeader.sortProduct("hilo");

        Assert.assertTrue(homePageProduct.inventoryListPrice() >= 0, "Not sort");
    }


}
