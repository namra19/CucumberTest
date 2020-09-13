package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;

    //init WebDriver

    private static WebDriver driver;
    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 20;

    /*for defining a driver we'll make a private constructor beacuse whenever we'll be creating an object of selenium
    webdriver class, all the time constructor will be called. So everytime I'll create an object of Selenium Webdriver
    it should invoke a new browser*/

    private SeleniumDriver() {

        System.setProperty("webdriver.chrome.driver","src/test/resources/executables/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, TIMEOUT);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    public static void openPage(String url) {

        driver.get(url);
    }
    //for getting the driver reference
    public static WebDriver getDriver() {

        return driver;
    }
    //singleton design pattern
    public static void setUpDriver() {

        if (seleniumDriver==null) {

            seleniumDriver = new SeleniumDriver();
        }
    }

    public static void tearDown() {

        if (driver !=null) {

            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }





}
