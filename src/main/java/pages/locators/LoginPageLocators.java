package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {

    @FindBy(how= How.XPATH, using="/html/body/header/div/div/div/ul/li[3]/a/span/span")
    public static WebElement userIcon;

    @FindBy(how= How.ID, using="username")
    public static WebElement enteremail;

    @FindBy(how=How.ID, using = "password")
    public static WebElement enterPassword;

    @FindBy(how=How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div[3]/form/button")
    public static WebElement clickLogin;

    @FindBy(how=How.ID, using = "profile-page-headline")
    public static WebElement welcomeMsg;

}
