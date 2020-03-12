package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
public HomePage(WebDriver driver)
{
    this.driver = driver;
    PageFactory.initElements(driver,this);
}
    @FindBy(id = "search-input-location")
    private WebElement searchBox;
    @FindBy(id = "forsale_price_max")
    private WebElement maxPrice;

    public void enterLocation(String location)
    {

        searchBox.clear();
        searchBox.sendKeys(location);
    }
}
