package actions;

import com.e2eTests.automation.step_definitions.CommonSteps;
import elements.EbayHome_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EbayHome_Actions {

    private WebDriver driver;
    EbayHome_Elements ebayhome_elements;
    public EbayHome_Actions() {
        this.driver = CommonSteps.getDriver();
         ebayhome_elements = new EbayHome_Elements(driver);
    }

    public void clickAdvancedLink() {
        ebayhome_elements.advancedLink.click();

    }
    
    public void searchAnItem(String srchString) {
        ebayhome_elements.searchBox.sendKeys(srchString);
        
    }

    public void clickToButonSearch() {

        ebayhome_elements.searchButton.click();
    }

    public int getSearchItemsCount() {
        String itemCount = ebayhome_elements.numOfItems.getText().trim();
        String itemCount2 = itemCount.replace(",", "");
        int itemCountInt = Integer.parseInt(itemCount2);
        return itemCountInt ;
    }

    public void selectCategoryOption(String option) {
        List<WebElement> cat = ebayhome_elements.catOptions;
        for(WebElement x : cat) {
            if(x.getText().trim().toLowerCase().equals(option.toLowerCase())) {
                x.click();
                break;
            }
        }
    }

    public void clickOnLinkByText(String Text) {

        driver.findElement(By.linkText(Text)).click();
    }
}
