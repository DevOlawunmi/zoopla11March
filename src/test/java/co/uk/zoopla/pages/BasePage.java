package co.uk.zoopla.pages;

import co.uk.zoopla.common.DriverLib;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverLib
{
    private String BASE_URL = "https://www.zoopla.co.uk/";
    public Select select;

    public void launchURL()
    {
        driver.navigate().to(BASE_URL);
    }
}
