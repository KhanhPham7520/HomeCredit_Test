package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class CreateNewAccountPage extends PageObject {

	WebDriver driver;

	@Step
	public void inputValue(String xpathValue, String inputValue) {
		waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue)));
		$(By.xpath(xpathValue)).type(inputValue);		
	}
	
	@Step
	public void clickRadioButton(String xpathValue) {
		waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue)));
		$(By.xpath(xpathValue)).click();
		
	}
	
	@Step
	public void clickButton(String xpathValue) {
		waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathValue)));
		$(By.xpath(xpathValue)).click();
	}
	
	@Step
	public String getText(String xpathValue) {
		return $(By.xpath(xpathValue)).getText();
	}
}
