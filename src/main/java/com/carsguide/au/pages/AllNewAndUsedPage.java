package com.carsguide.au.pages;

import com.carsguide.au.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllNewAndUsedPage extends Utility
{
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @FindBy(xpath = "//h1[@class = 'listing-search-title']")
    WebElement make_Result;

    public String getMakeResult()
    {
        log.info("getting text from " + make_Result.toString());
        return getTextFromElement(make_Result);
    }
}
