package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchResultPage extends TestBase {
	
	@FindBy(css = "ul li.preview")
	WebElement itemPreview;
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement addCarttoButton;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectItem() {
		itemPreview.click();
	}
	
	public CheckOutPage additemtoCart() {
		addCarttoButton.click();
		return new CheckOutPage();
	}
}
