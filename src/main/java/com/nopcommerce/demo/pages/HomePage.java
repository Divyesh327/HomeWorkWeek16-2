package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]")
    WebElement computersMenu;

    public void clickOnLoginLink()
    {
        Reporter.log("Clicking on login link : " + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
        log.info("Clicking on Login link --> " + loginLink.toString());
    }

    public void clickOnRegisterLink()
    {
        Reporter.log("Clicking on login link : " + registerLink.toString() + "<br>");
        clickOnElement(registerLink);
        log.info("Clicking on Register link --> " + registerLink.toString());
    }

    public void clickOnComputersMenu()
    {
        Reporter.log("Clicking on computers menu" + computersMenu.toString() + "<br>");
        clickOnElement(computersMenu);
        log.info("Clicking on computers menu --> " + computersMenu.toString());
    }
}

