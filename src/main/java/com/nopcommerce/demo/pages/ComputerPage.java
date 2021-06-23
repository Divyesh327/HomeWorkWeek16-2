package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility
{
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(xpath = "//ul[@class = 'sublist']/li[1]/a")
    WebElement desktop;

    @FindBy(xpath = "//ul[@class = 'sublist']/li[2]/a")
    WebElement notebook;

    @FindBy (xpath = "//ul[@class = 'sublist']/li[3]/a")
    WebElement software;

    @FindBy (xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopPageTittle;

    @FindBy (xpath = "//h1[contains(text(),'Notebooks')]")
    WebElement notebookPageTittle;

    @FindBy (xpath = "//h1[contains(text(),'Software')]")
    WebElement softwarePageTittle;

    public void clickOnDesktop()
    {
        Reporter.log("Clicking on Desktop Menu" + desktop.toString() + "<br>");
        clickOnElement(desktop);
        log.info("Clicking on Desktop Menu --> " + desktop.toString());
    }

    public void clickOnNotebook()
    {
        Reporter.log("Clicking on Notebook Menu" + notebook.toString() + "<br>");
        clickOnElement(notebook);
        log.info("Clicking on Notebook Menu --> " + notebook.toString());
    }

    public void clickOnSoftware()
    {
        Reporter.log("Clicking on Software Menu : " + software.toString() + "<br>");
        clickOnElement(software);
        log.info("Clicking on Software Menu --> " + software.toString());
    }

    public String getDesktopPageTittle()
    {
        return getTextFromElement(desktopPageTittle);
    }

    public String getNotebookPageTittle()
    {
        return getTextFromElement(notebookPageTittle);
    }

    public String getSoftwarePageTittle()
    {
        return getTextFromElement(softwarePageTittle);
    }
}
