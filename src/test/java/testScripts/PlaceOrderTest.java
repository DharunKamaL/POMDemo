package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckOutPage;
import pages.DetailsCheckOutPage;
import pages.SearchPage;
import pages.SearchResultPage;

public class PlaceOrderTest extends TestBase{
	
	@BeforeTest
	public void setup() {
		initialize();
	}
	
	SearchPage searchPage;
	SearchResultPage resultPage;
	CheckOutPage checkOutPage;
	DetailsCheckOutPage detailsCheckoutPage;
	
  @Test
  public void addItemtoCart() {
	  searchPage = new SearchPage();
	  resultPage = searchPage.searchItem("Parry Hotter");
	  resultPage.selectItem();
	  resultPage.additemtoCart();
	  checkOutPage = new CheckOutPage();
	  checkOutPage.couponClick();
	  checkOutPage.enterCoupon("abcd");
	  checkOutPage.apply();
	  checkOutPage.checkOut();
	  detailsCheckoutPage = new DetailsCheckOutPage();
	  detailsCheckoutPage.enterName("Automation");
	  detailsCheckoutPage.enterSurName("Tester");
	  detailsCheckoutPage.enterAddress("39/0, Vivekanandha NAgar");
	  detailsCheckoutPage.enterZipCode("600 032");
	  detailsCheckoutPage.enterCity("Chennai");
	  detailsCheckoutPage.enterCompany("Zuci Systems");
	  detailsCheckoutPage.checkBox();
	  detailsCheckoutPage.buyButton();
  }
}

