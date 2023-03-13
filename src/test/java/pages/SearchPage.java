package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchPage extends TestBase{
	
	//PageFactory for locating the element
	
	@FindBy(name = "searchbar")
	WebElement srcBox;
	
	@FindBy(id = "button-search")
	WebElement srcBtn;
	
	@FindBy(id = "cart")
	WebElement viewcartBtn;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	//-->Searchitem
	
	public SearchResultPage searchItem(String strItem) {
		srcBox.sendKeys(strItem);
		srcBtn.click();
		return new SearchResultPage();
	}
}
