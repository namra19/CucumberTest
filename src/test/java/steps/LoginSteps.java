package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.LoginPageActions;
import utils.SeleniumDriver;

public class LoginSteps {


    LoginPageActions loginPageActions = new LoginPageActions();

    @Given("^I am on home page \"([^\"]*)\" of ikea website$")
    public void i_am_on_home_page_of_ikea_website(String websiteUrl) {
        SeleniumDriver.openPage(websiteUrl);
    }

    @When("^I click on the user icon I am redirected to login page$")
    public void i_click_on_the_user_icon_I_am_redirected_to_login_page() {
        loginPageActions.click_on_user_icon();
    }
    @And("^I enter email as \"([^\"]*)\"$")
    public void i_enter_email_as(String email) {
       loginPageActions.enterEmailAddress(email);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void i_enter_password_as(String password) {
       loginPageActions.enterPassword(password);
    }

    @And("^I click on Login button$")
    public void i_click_on_Login_button() {
       loginPageActions.clickLoginBtn();
    }

    @Then("^I should see the message as \"([^\"]*)\"$")
    public void i_should_see_the_message_as(String message) {
        loginPageActions.verifyMessage(message);
    }

}
