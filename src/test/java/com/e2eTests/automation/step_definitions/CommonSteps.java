package com.e2eTests.automation.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonSteps {
    private static WebDriver driver;



    @Before(order = 0 )
    public void setUp() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        System.out.println("Global before Hook Executed");

    }



    @Before(value = "@setCookies",order = 1 )
    public void setCookies() {
        System.out.println("Scenario specific Hook - setCookies Executed");
    }

    /*
    @After(order = 1 )
    public void tearDown() throws Exception  {
        driver.quit();
        Thread.sleep(1000);
        System.out.println("Global after Hook Executed");
    }

     */

    @After(value = "@Test", order = 0)
    public void testAfterHook() {
        System.out.println("Scenario specific Hook - testAfterHook Executed");
    }

    public static WebDriver getDriver() {

        return driver;
    }
}
