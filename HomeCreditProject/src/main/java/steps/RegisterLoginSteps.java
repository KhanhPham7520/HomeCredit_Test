package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.RegisterLoginPage;

public class RegisterLoginSteps {
		
    @Managed
    WebDriver driver;
    
    @Steps
    RegisterLoginPage registerLoginPage;

    String registeredUserId;
    String registeredPassword;
	

    @Given("^I want to navigate to Register Page$")
    public void i_want_to_navigate_to_Register_Page() {
        registerLoginPage.open("http://demo.guru99.com/");
    }

    @When("^I input email$")
    public void i_input_email() {
    	registerLoginPage.inputEmail("phamphannhatkhanh@gmail.com");
        
    }

    @When("^I click Submit button$")
    public void i_click_Submit_button() {
        registerLoginPage.ClickRegisterSubmit();
    }

    @When("^I get User ID$")
    public void i_get_User_ID() {
    	registeredUserId = registerLoginPage.getUserId();
    }

    @When("^I get Password$")
    public void i_get_Password() {
    	registeredPassword = registerLoginPage.getPasswordID();
    }

    @When("^I navigate to Login Page$")
    public void i_navigate_to_Login_Page() {
        registerLoginPage.open("http://demo.guru99.com/v4/");
    }

    @When("^I input registered User ID$")
    public void i_input_registered_User_ID() {
        registerLoginPage.inputEmail(registeredUserId);
    }

    @When("^I input registered Password$")
    public void i_input_registered_Password() {
        registerLoginPage.inputPassword(registeredPassword);
    }

    @When("^I click Login button$")
    public void i_click_Login_button() {
        registerLoginPage.clickLoginButton();
    }

    @Then("^I verified welcome marquee displayed$")
    public void i_verified_welcome_marquee_displayed() {
    	assertEquals("Welcome To Manager's Page of Guru99 Bank",registerLoginPage.getTextOfMarquee());
    }
}
