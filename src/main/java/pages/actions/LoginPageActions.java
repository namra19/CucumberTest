package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.locators.LoginPageLocators;
import utils.SeleniumDriver;

public class LoginPageActions {

    LoginPageLocators loginPageLocators = null;

    public LoginPageActions() {
        this.loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), loginPageLocators);
    }

    public void click_on_user_icon() {
        loginPageLocators.userIcon.click();
    }

    public void enterEmailAddress(String email) {
        LoginPageLocators.enteremail.sendKeys(email);
    }

    public void enterPassword(String password) {
        LoginPageLocators.enterPassword.sendKeys(password);
    }

    public void clickLoginBtn() {
        LoginPageLocators.clickLogin.click();
    }

    public void verifyMessage(String message) {

        String welcomeMsg = LoginPageLocators.welcomeMsg.getText();
        Assert.assertEquals(message, welcomeMsg);
    }

}
