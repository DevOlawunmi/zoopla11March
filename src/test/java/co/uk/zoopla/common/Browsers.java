package co.uk.zoopla.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Browsers extends DriverLib {
    private WebDriver initChrome() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private WebDriver initFireFox() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    private WebDriver initHeadlessChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu", "--headless");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    public void launchBrowser(String browser) {
        switch (browser) {
            case "Chrome":
                driver = initChrome();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

        }
    }
    public void closeBrowser()
    {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}