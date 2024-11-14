package com.e2eTests.automation.step_definitions;

import actions.Common_Actions;
import actions.EbayHome_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class EbayHomeSteps {
    //WebDriver driver;
     Common_Actions common_actions;
     EbayHome_Actions ebayhome_actions;

    public EbayHomeSteps(Common_Actions common_actions, EbayHome_Actions ebayhome_actions) {

       // this.driver = CommonSteps.getDriver();
        this.common_actions = common_actions;
        this.ebayhome_actions = ebayhome_actions;
    }


    @Given("I am on Eaby Home Page")
    public void i_am_on_eaby_home_page() {

        //driver.get("https://www.ebay.com/");
        common_actions.goToURL("https://www.ebay.com/");


    }

    @When("I click on Advanced")
    public void i_click_on_advanced() {
        //driver.findElement(By.linkText("Advanced")).click();
        ebayhome_actions.clickAdvancedLink();

    }

    @Then("I navigate to Advanced Search page")
    public void i_navigate_to_advanced_search_page() {
        String expURL =  "https://www.ebay.com/sch/ebayadvsearch" ;
        //String actURL = driver.getCurrentUrl();
        String actURL = common_actions.getCurrentPageUrl();
        if (!expURL.equals(actURL)) {
            fail("Page does not navigate to expected page");
        }


    }

    @When("I search for {string}")
    public void i_search_for(String str1) throws Exception  {

        //driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(str1);
        ebayhome_actions.searchAnItem(str1);
        //driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        ebayhome_actions.clickToButonSearch();
        Thread.sleep(1000);

    }


    @Then("I validate atleast {int} search items present")
    public void i_validate_atleast_search_items_present(int count) {
        //String itemCount = driver.findElement(By.cssSelector("h1.srp-controls__count-heading>span.BOLD:first-child")).getText().trim();

        //String itemCount2 = itemCount.replace(",", "");
        //int itemCountInt = Integer.parseInt(itemCount2);
        int itemCountInt = ebayhome_actions.getSearchItemsCount();
        if(!(itemCountInt >= count)) {
            fail("less than:" +count + "results");
        }

    }


    @When("I search for {string} in {string} category")
    public void i_search_for_in_category(String string1, String string2) throws Exception {

        //driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(string);
        ebayhome_actions.searchAnItem(string1);
        ebayhome_actions.selectCategoryOption(string2);

        //driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        ebayhome_actions.clickToButonSearch();
        Thread.sleep(1000);


    }

    @When("I click on {string}")
    public void iClickOn(String string) throws Exception {
        //driver.findElement(By.linkText(string)).click();
        ebayhome_actions.clickOnLinkByText(string);
        Thread.sleep(1000);

    }
    // this function is used when you need to click on many links
    @Then("I validate that page navigates to {string} and title contains {string}")
    public void iValidateThatPageNavigatesToAndTitleContains(String url, String title) {
        String actUrl = common_actions.getCurrentPageUrl();
        String actTitle = common_actions.getCurrentPageTitle();
        //Assertions.assertTrue(actUrl.contains(url), "page is not reached");
        if (!actUrl.equals(url)) {
            fail("page does not navigate to expected url" +url );
        }

        if (!actTitle.contains(title)) {
            fail("title mismatch");
        }

    }

}

