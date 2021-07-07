package com.carsguide.au.pages;

import com.carsguide.au.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Utility
{
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buy_Sell_Tab;

    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement search_Cars_Menu;

    public void mouseHoverOnBuySellTab()
    {
        mouseHoverToElement(buy_Sell_Tab);
        log.info("Mouse Hover on buy + sell tab : " + buy_Sell_Tab.toString());
    }

    public void clickOnSearchCarMenu()
    {
        clickOnElement(search_Cars_Menu);
        log.info("Clicking on search car menu : " + search_Cars_Menu.toString());
    }
}
