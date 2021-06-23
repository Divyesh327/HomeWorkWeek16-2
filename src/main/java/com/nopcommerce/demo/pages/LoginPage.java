package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility
{
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    private static String email = "test" + generateRandomNumber() + "@gmail.com";

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//button[@class = 'button-1 login-button']")
    WebElement loginBtn;

    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement welcomeText;

    @FindBy(xpath = "//div[@class = 'message-error validation-summary-errors']")
    WebElement errorMessage;

    @FindBy(xpath = "//div[@class = 'topic-block-title']/h2")
    WebElement welcomeStoreMessage;

    public void enterEmailId(String email)
    {
        Reporter.log("Entering email address : " + email + " to email field : " + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
        log.info("Entering email address : " + email + " to email field : " + emailField.toString());
    }

    public void enterPassword(String password) {
        Reporter.log("Entering password : " + password + " to password field : " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
        log.info("Entering email address : " + password + " to email field : " + password.toString());
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicking on login button : " + loginBtn.toString() + "<br>");
        clickOnElement(loginBtn);
        log.info("Clicking on Login button...." + loginBtn.toString());
    }

    public String getWelcomeText() {
        Reporter.log("Getting text from : " + welcomeText.toString() + "<br>");
        log.info("Getting Text from ...." + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public String getErrorMessage()
    {
        return getTextFromElement(errorMessage);
    }

    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }

    public String getWelcomeStoreMessage()
    {
        Reporter.log("Getting text from : " + welcomeStoreMessage.toString() + "<br>");
        log.info("Getting Text from ...." + welcomeStoreMessage.toString());
        return getTextFromElement(welcomeStoreMessage);
    }
}
