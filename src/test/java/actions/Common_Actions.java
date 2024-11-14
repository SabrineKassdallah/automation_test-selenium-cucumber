package actions;

import com.e2eTests.automation.step_definitions.CommonSteps;
import org.openqa.selenium.WebDriver;


public class Common_Actions {

    private WebDriver driver ;
    //CommonSteps common_steps ;
    public Common_Actions() {
        this.driver = CommonSteps.getDriver();
    }


    public void goToURL(String url) {
        driver.get(url);
    }


    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }



    public String getCurrentPageTitle() {
        return driver.getTitle();
    }

    /*
    public void quitWebDriver() {
        driver.quit();
    }

     */
}
