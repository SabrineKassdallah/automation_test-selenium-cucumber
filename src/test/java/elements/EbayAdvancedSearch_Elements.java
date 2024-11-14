package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvancedSearch_Elements {

    @FindBy(xpath = "//*[@id='gh-logo']") public WebElement ebayLogo ;
    @FindBy(xpath = "//input[@id='_nkw']") public WebElement searchString ;
    @FindBy(xpath = "//input[@id='_ex_kw']") public WebElement excludeString ;
    @FindBy(xpath = "//input[@name='_udlo']") public WebElement minPrice ;
    @FindBy(xpath = "//input[@name='_udhi']") public WebElement maxPrice ;
    @FindBy(xpath = "//body/div[2]/div[1]/main[1]/form[1]/div[2]/button[1]") public WebElement searchBtn ;

    WebDriver driver;
    public EbayAdvancedSearch_Elements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


}
