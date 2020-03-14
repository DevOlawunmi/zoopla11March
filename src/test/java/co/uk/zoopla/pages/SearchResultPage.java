package co.uk.zoopla.pages;

import co.uk.zoopla.common.DriverLib;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage{
    public SearchResultPage(WebDriver driver)
{
    DriverLib.driver = driver;
    PageFactory.initElements(driver,this);
}
@FindBy (tagName = "h1")
    private WebElement pageTitle;
    @FindBy(css = ".listing-results-price.text-price")
    private List<WebElement> results;

    public void isSearchResultDisplayed (){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public void isLocationDisplayed(String location)
    {
        String title = pageTitle.getText();
        Assert.assertTrue(title.contains(location));
    }
    public void isPropertyTypeDisplayed(String property)
    {
        String title = pageTitle.getText();
        Assert.assertTrue(title.contains(property));
    }

    public void isCorrectURLDisplayedForSearch(String location)
    {
driver.getCurrentUrl().contains(location.toLowerCase());
    }
}
