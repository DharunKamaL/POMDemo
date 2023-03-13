package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DetailsCheckOutPage extends TestBase {
	
	@FindBy(id = "s-name")
	WebElement name;
	
	@FindBy(xpath = "(//input[@id = 's-surname'])[1]")
	WebElement surName;
	
	@FindBy(id = "s-address")
	WebElement address;
	
	@FindBy(id = "s-zipcode")
	WebElement zipCode;
	
	@FindBy(id = "s-city")
	WebElement city;
	
	@FindBy(id = "s-company")
	WebElement company;
	
	@FindBy(css = "input[id=asap]")
	WebElement radioBtn;
	
	@FindBy(xpath = "//button[text()='Buy']")
	WebElement buyBtn;
	
	public DetailsCheckOutPage() {
		PageFactory.initElements(driver, this);
	} 
	
	public void enterName(String strName) {
		name.sendKeys(strName);
	}
	
	public void enterSurName(String strSurName) {
		surName.sendKeys(strSurName);
	}
	
	public void enterAddress(String strAdd) {
		address.sendKeys(strAdd);
	}
	
	public void enterZipCode(String strZipCode) {
		zipCode.sendKeys(strZipCode);
	}
	
	public void enterCity(String strCity) {
		city.sendKeys(strCity);
	}
	
	public void enterCompany(String strCompany) {
		company.sendKeys(strCompany);
	}
	
	public void checkBox() {
		radioBtn.click();
	}
	
	public void buyButton() {
		buyBtn.click();
	}





}
