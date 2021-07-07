package com.carsguide.au.pages;

import com.carsguide.au.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAndUsedCarSearchPage extends Utility
{
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement page_Title;

    @FindBy(xpath = "//select[@id='makes']")
    WebElement make_DropDown;

    @FindBy(xpath = "//select[@id='models']")
    WebElement model_DropDown;

    @FindBy(xpath = "//select[@id='locations']")
    WebElement location_DropDown;

    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement priceTo_DropDown;

    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCarButton;

    public String getPageTitle()
    {
        log.info("Mouse Hover on buy + sell tab : " + page_Title.toString());
        return getTextFromElement(page_Title);
    }

    public void selectValueFromMakeDropDown(String value)
    {
        selectByValueFromDropDown(make_DropDown,value);
        log.info("Select value from make : " + make_DropDown.toString());
    }

    public void selectValueFromModelDropDown(String value)
    {
        selectByValueFromDropDown(model_DropDown,value);
        log.info("Select value from model : " + model_DropDown.toString());
    }

    public void selectValueFromLocationDropDown(String value)
    {
        selectByValueFromDropDown(location_DropDown,value);
        log.info("Select value from location : " + location_DropDown.toString());
    }

    public void selectValueFromPriceDropDown(String value)
    {
        selectByValueFromDropDown(priceTo_DropDown,value);
        log.info("Select value from price : " + priceTo_DropDown.toString());
    }

    public void clickOnFindMyNextCarButton()
    {
        clickOnElement(findMyNextCarButton);
        log.info("Click on " + findMyNextCarButton.toString());
    }
}
