package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest extends TestBase
{
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod (alwaysRun = true)
    public void setUp()
    {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test (groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToLoginPage()
    {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Test (groups = {"smoke","regression"})
    public void verifyUserShouldNotLoginWithInvalidCredentials() throws InterruptedException {
        homePage.clickOnLoginLink();
        Thread.sleep(2000);
        loginPage.enterEmailId("Div@gmail.com");
        loginPage.enterPassword("Div@123");
        loginPage.clickOnLoginButton();

        Thread.sleep(2000);
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = loginPage.getErrorMessage();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Test (groups = {"regression"})
    public void verifyUserShouldLoginWithValidCredentials() throws InterruptedException {
        homePage.clickOnLoginLink();
        Thread.sleep(2000);
        loginPage.enterEmailId("Div@gmail.com");
        loginPage.enterPassword("Div@123");
        loginPage.clickOnLoginButton();

        String expectedMessage = "Welcome to our store";
        String actualMessage = loginPage.getWelcomeStoreMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
