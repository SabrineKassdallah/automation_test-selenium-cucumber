package actions;

import com.e2eTests.automation.step_definitions.CommonSteps;
import elements.EbayAdvancedSearch_Elements;
import org.openqa.selenium.WebDriver;

public class EbayAdvancedSearch_Actions {

    private WebDriver driver;
    EbayAdvancedSearch_Elements ebayadvancedsearch_elements;

    public EbayAdvancedSearch_Actions() {

        this.driver = CommonSteps.getDriver();
        ebayadvancedsearch_elements = new EbayAdvancedSearch_Elements(driver);

    }

    public void clickOnEbayLogo() {

        ebayadvancedsearch_elements.ebayLogo.click();
    }

    public void enterSearchString(String str) {

        ebayadvancedsearch_elements.searchString.sendKeys(str);
    }

    public void enterExcludeString(String str) {
        ebayadvancedsearch_elements.excludeString.sendKeys(str);
    }

    public void enterMinPrice(String str) {

        ebayadvancedsearch_elements.minPrice.sendKeys(str);
    }

    public void enterMaxPrice(String str) {

        ebayadvancedsearch_elements.maxPrice.sendKeys(str);
    }

    public void clickToBtnSearch() {

        ebayadvancedsearch_elements.searchBtn.click();
    }
}
