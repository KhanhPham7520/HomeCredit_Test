package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://demo.guru99.com/")
public class RegisterLoginPage extends PageObject {
	
	WebDriver driver;
	
	
	@Step
	public void inputEmailID() {
		$(By.name("emailid")).type("phamphannnhatkhanh@gmail.com");
	}
	@Step
	public void ClickRegisterSubmit() {
		$(By.name("btnLogin")).click();
	}
	
	@Step
	public String getUserId() {		
		return $(By.xpath("//td[text()='User ID :']//following-sibling::td")).getText();
		
	}
	
	@Step
	public String getPasswordID() {
		return $(By.xpath("//td[text()='Password :']//following-sibling::td")).getText();
	}
	
	@Step
	public void inputEmail(String inputValue) {
		$(By.name("uid")).sendKeys(inputValue);
	}
	
	@Step
	public void inputPassword(String inputValue) {
		$(By.name("password")).sendKeys(inputValue);
		
	}
	
	@Step
	public void clickLoginButton() {
		$(By.name("btnLogin")).click();
		
	}
	
	@Step
	public String getTextOfMarquee() {
		return $(By.xpath("//marquee[text()=\"Welcome To Manager's Page of Guru99 Bank\"]")).getText();
	}
	
	
}
