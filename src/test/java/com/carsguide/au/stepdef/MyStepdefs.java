package com.carsguide.au.stepdef;

import com.carsguide.au.pages.AllNewAndUsedPage;
import com.carsguide.au.pages.Homepage;
import com.carsguide.au.pages.NewAndUsedCarSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs
{
    Homepage homepage = new Homepage();
    NewAndUsedCarSearchPage newAndUsedCarSearchPage = new NewAndUsedCarSearchPage();

    @Given("^I am on homepage$")
    public void iAmOnHomepage()
    {

    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab()
    {
        homepage.mouseHoverOnBuySellTab();
    }

    @And("^I click Search Cars$")
    public void iClickSearchCars()
    {
        homepage.clickOnSearchCarMenu();
    }

    @Then("^I navigate to new and used car search page$")
    public void iNavigateToNewAndUsedCarSearchPage() 
    {
       Assert.assertEquals("New & Used Car Search - carsguide",newAndUsedCarSearchPage.getPageTitle());
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) 
    {
        newAndUsedCarSearchPage.selectValueFromMakeDropDown(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) 
    {
        newAndUsedCarSearchPage.selectValueFromModelDropDown(model);
    }


    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) 
    {
        newAndUsedCarSearchPage.selectValueFromLocationDropDown(location);
    }


    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) 
    {
        newAndUsedCarSearchPage.selectValueFromPriceDropDown(price);
    }


    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() 
    {
        newAndUsedCarSearchPage.clickOnFindMyNextCarButton();
    }


    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make)
    {
//        String result = new AllNewAndUsedPage().getMakeResult();
//        System.out.println("Hello"+result.contains(make));
//        Assert.assertEquals(make,new AllNewAndUsedPage().getMakeResult());

        Assert.assertTrue(make,new AllNewAndUsedPage().getMakeResult().contains(make));
    }
}
