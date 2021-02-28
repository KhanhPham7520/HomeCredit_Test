package steps;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.CreateNewAccountPage;

public class CreateNewAccountSteps {

	@Managed
	WebDriver driver;
	
	@Steps
	CreateNewAccountPage createNewAccountPage;

	@Given("^I want to navigate to New Customer Page$")
	public void i_want_to_navigate_to_New_Customer_Page() {
		createNewAccountPage.clickOn((WebElement) By.xpath("//a[text()='New Customer']"));
	}

	@When("^I input customer name with value \"([^\"]*)\"$")
	public void i_input_customer_name_with_value(String customerName) {
		createNewAccountPage.inputValue("//input[@name='name']", customerName);
	}

	@When("^I choose Male gender with \"([^\"]*)\" option$")
	public void i_choose_Male_gender_with_option(String male) {
		createNewAccountPage.clickRadioButton("//input[@name='rad1' and @value='m']");
	}

	@When("^I input DOB with \"([^\"]*)\"$")
	public void i_input_DOB_with(String birthDate) {
		createNewAccountPage.inputValue("//input[@id='dob']", birthDate);
	}

	@When("^I input Address with \"([^\"]*)\"$")
	public void i_input_Address_with(String Address) {
		createNewAccountPage.inputValue("//textarea[@name='addr']", Address);
	}

	@When("^I input City with \"([^\"]*)\"$")
	public void i_input_City_with(String City) {
		createNewAccountPage.inputValue("//input[@name='city']", City);
	}

	@When("^I input Pin number with \"([^\"]*)\"$")
	public void i_input_Pin_number_with(String Pinno) {
		createNewAccountPage.inputValue("//input[@name='pinno']", Pinno);

	}

	@When("^I input Mobile number with \"([^\"]*)\"$")
	public void i_input_Mobile_number_with(String MobileNumber) {
		createNewAccountPage.inputValue("//input[@name='telephoneno']", MobileNumber);
	}

	@When("^I input email with \"([^\"]*)\"$")
	public void i_input_email_with(String Email) {
		createNewAccountPage.inputValue("//input[@name='emailid']", Email);
	}

	@When("^I input password with \"([^\"]*)\"$")
	public void i_input_password_with(String Password) {
		createNewAccountPage.inputValue("//input[@name='emailid']", Password);
	}

	@When("^I click Submit$")
	public void i_click_Submit() {
		createNewAccountPage.clickButton("//input[@name='sub']");
	}
	
	@Then("^I verified Customer ID is displayed well$")
	public void i_verified_Customer_ID_is_displayed_well() {

	}

	@Then("^I verify Customer Name displayed with \"([^\"]*)\" correctly$")
	public void i_verify_Customer_Name_displayed_with_correctly(String CustomerName) {
		assertEquals(CustomerName, createNewAccountPage.getText("//td[text()='Customer ID']//following-sibling::td"));
	}

	@Then("^I verify Gender displayed with \"([^\"]*)\" correctly$")
	public void i_verify_Gender_displayed_with_correctly(String Gender) {
		assertEquals(Gender, createNewAccountPage.getText("//td[text()='Gender']//following-sibling::td"));
	}

	@Then("^I verify Birthdate displayed with \"([^\"]*)\" correctly$")
	public void i_verify_Birthdate_displayed_with_correctly(String BirthdateVerified) {
		assertEquals(BirthdateVerified, createNewAccountPage.getText("//td[text()='Birthdate']//following-sibling::td"));

	}

	@Then("^I verify City displayed with \"([^\"]*)\" correctly$")
	public void i_verify_City_displayed_with_correctly(String City) {
		assertEquals(City, createNewAccountPage.getText("//td[text()='City']//following-sibling::td"));
	}

	@Then("^I verify State displayed with \"([^\"]*)\" correctly$")
	public void i_verify_State_displayed_with_correctly(String State) {
		assertEquals(State, createNewAccountPage.getText("//td[text()='City']//following-sibling::td"));

	}

	@Then("^I verify Pin displayed with \"([^\"]*)\" correctly$")
	public void i_verify_Pin_displayed_with_correctly(String Pinno) {
		assertEquals(Pinno, createNewAccountPage.getText("//td[text()='Pin']//following-sibling::td"));
	}

	@Then("^I verify MobileNumber displayed with \"([^\"]*)\" correctly$")
	public void i_verify_MobileNumber_displayed_with_correctly(String MobileNumber) {
		assertEquals(MobileNumber, createNewAccountPage.getText("//td[text()='Mobile No.']//following-sibling::td"));
	}

	@Then("^I verify Email displayed with \"([^\"]*)\" correctly$")
	public void i_verify_Email_displayed_with_correctly(String Email) {
		assertEquals(Email, createNewAccountPage.getText("//td[text()='Email']//following-sibling::td"));
	}

}
