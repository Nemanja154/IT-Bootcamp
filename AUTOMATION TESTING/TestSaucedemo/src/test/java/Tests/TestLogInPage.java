package Tests;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import BaseClass.Driver;


public class TestLogInPage extends Driver {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void logInHappyPath() throws InterruptedException {
        logInPage.getUsernameInput("standard_user");
        logInPage.getPasswordInput("secret_sauce");
        logInPage.clickLoginButton();

        wait.until(ExpectedConditions.visibilityOf(homePageHeader.getTitle()));
        Assert.assertTrue(homePageHeader.getTitle().getText().contains("PRODUCTS"), "User not LoginHappyPath");
    }

    @Test
    public void logInUnhappyPathWrongUsername() {

        logInPage.getUsernameInput("wrong");
        logInPage.getPasswordInput("secret_sauce");
        logInPage.clickLoginButton();
        wait.until(ExpectedConditions.visibilityOf(logInPage.getErrorMessage()));
        Assert.assertTrue(logInPage.getErrorMessage().getText().contains("Username and password do not match"), "Log in is successful");

    }

    @Test
    public void logInUnhappyPathWrongPassword() {
        logInPage.getUsernameInput("standard_user");
        logInPage.getPasswordInput("wrong");
        logInPage.clickLoginButton();
        wait.until(ExpectedConditions.visibilityOf(logInPage.getErrorMessage()));
        Assert.assertTrue(logInPage.getErrorMessage().getText().contains("Username and password do not match"), "Log in is successful");
    }

    @Test
    public void logInButtonColor() {
        Assert.assertEquals(logInPage.buttonColor(), "#e2231a", "Color is not corect");
    }


}
