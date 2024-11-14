package com.e2eTests.automation.step_definitions;

import static org.junit.Assert.fail;

import actions.Common_Actions;
import actions.EbayAdvancedSearch_Actions;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayAdvancedSearchSteps {
   // WebDriver driver;
    Common_Actions common_actions;
    EbayAdvancedSearch_Actions ebayadvancedsearch_actions;


    public EbayAdvancedSearchSteps(Common_Actions common_actions, EbayAdvancedSearch_Actions ebayadvancedsearch_actions) {

       // this.driver = CommonSteps.getDriver();

        this.common_actions = common_actions;
        this.ebayadvancedsearch_actions = ebayadvancedsearch_actions;
    }

    @Given("I am on Advanced Search Page")
    public void i_am_on_advanced_search_page() {

        //driver.get("https://www.ebay.com/sch/ebayadvsearch");
        common_actions.goToURL("https://www.ebay.com/sch/ebayadvsearch");

    }
    @When("I click on Ebay Logo")
    public void i_click_on_ebay_logo() {

        //driver.findElement(By.xpath("//*[@id='gh-logo']")).click();
        ebayadvancedsearch_actions.clickOnEbayLogo();
    }


    @Then("I navigate to Ebay Home Page")
    public void i_navigate_to_ebay_home_page() {
        String expURL = "https://www.ebay.com/";
        //String actURL = driver.getCurrentUrl();
        String actURL = common_actions.getCurrentPageUrl();
        if (!expURL.equals(actURL)) {
            fail("Page does not navigate to expected page");
        }

    }

    @When("I advanced search an item")
    public void iAdvancedSearchAnItem(DataTable dataTable) throws Exception{
      //driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys(dataTable.cell(1,0));
        ebayadvancedsearch_actions.enterSearchString(dataTable.cell(1,0));
      //driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys(dataTable.cell(1,1));
        ebayadvancedsearch_actions.enterExcludeString(dataTable.cell(1,1));
      //driver.findElement(By.xpath("//input[@name='_udlo']")).sendKeys(dataTable.cell(1,2));
        ebayadvancedsearch_actions.enterMinPrice(dataTable.cell(1,2));
      //driver.findElement(By.xpath("//input[@name='_udhi']")).sendKeys(dataTable.cell(1,3));
        ebayadvancedsearch_actions.enterMaxPrice(dataTable.cell(1,3));
      //driver.findElement(By.xpath("//body/div[2]/div[1]/main[1]/form[1]/div[2]/button[1]")).click();
        ebayadvancedsearch_actions.clickToBtnSearch();
      Thread.sleep(3000);
    }



}
