package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase
{
    HomePage homePage;
    ComputerPage computerPage;

    @BeforeMethod (alwaysRun = true)
    public void setUp()
    {
        homePage = new HomePage();
        computerPage = new ComputerPage();
    }

    @Test (groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToDesktopPage() throws InterruptedException {
        homePage.clickOnComputersMenu();
        Thread.sleep(5000);
        computerPage.clickOnDesktop();
        String expectedMessage = "Desktops";
        String actualMessage = computerPage.getDesktopPageTittle();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToNotebooksPage() throws InterruptedException {
        homePage.clickOnComputersMenu();
        Thread.sleep(5000);
        computerPage.clickOnNotebook();
        String expectedMessage = "Notebooks";
        String actualMessage = computerPage.getNotebookPageTittle();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test (groups = {"regression"})
    public void verifyUserShouldNavigateToSoftwarePage() throws InterruptedException {
        homePage.clickOnComputersMenu();
        Thread.sleep(5000);
        computerPage.clickOnSoftware();
        String expectedMessage = "Software";
        String actualMessage = computerPage.getSoftwarePageTittle();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
