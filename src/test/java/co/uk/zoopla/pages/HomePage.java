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
    @FindBy(id  = "forsale_price_min")
    private WebElement minPrice;
    @FindBy(name = "property_type")
    private WebElement typeOfProperty;
    @FindBy(id = "beds_min")
    private WebElement noOfBeds;
    @FindBy(css = ".button.button--primary")
    private WebElement searchButton;

    public void enterLocation(String location)
    {
        searchBox.clear();
        searchBox.sendKeys(location);
    }
    public void selectMaximumPrice(String maxiPrice)
    {
       selectElementByVisibleText(maxPrice, maxiPrice);
    }
    public void selectMinimumPrice(String miniPrice)
    {
        selectElementByVisibleText(minPrice, miniPrice);
    }
    public void selectTypeOfProperty(String property)
    {
        selectElementByVisibleText(typeOfProperty, property);
    }
    public void selectNumberOfBeds(String beds)
    {
        selectElementByVisibleText(noOfBeds, beds);
    }
    public SearchResultPage clickOnSearchButton()
    {
        searchButton.click();
       return new SearchResultPage(driver);
    }
}
