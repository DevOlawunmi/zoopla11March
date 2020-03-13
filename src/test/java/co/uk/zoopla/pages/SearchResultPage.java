package co.uk.zoopla.pages;

import co.uk.zoopla.common.DriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage{
    public SearchResultPage(WebDriver driver)
{
    this.driver = DriverLib.driver;
    PageFactory.initElements(DriverLib.driver,this);
}
}
