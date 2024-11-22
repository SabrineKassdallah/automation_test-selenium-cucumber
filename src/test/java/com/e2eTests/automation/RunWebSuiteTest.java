package com.e2eTests.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

/**
 * The Test Runner File uses the @RunWith() Annotation from JUnit for executing
 * tests.
 */
@RunWith(Cucumber.class)

/**
 * The @CucumberOptions Annotation is used to define the location of feature
 * files, step definitions, reporting integration.
 */
@CucumberOptions(features = { "src/spec/features" }, 
                plugin = { "pretty","json:target/json-report/cucumber.json","html:target/cucumber-report.html"},
                tags = "@P1 or @P2",
		        // glue = {"step_definitions"},
		       monochrome = false, 
		       snippets = CAMELCASE,
		       dryRun = false

)

/**
 * This class is used to run the test, which is a JUnit Test Runner Class
 * containing the Step Definition location and the other primary metadata
 * required to run the test.
 */
public class RunWebSuiteTest {

}
