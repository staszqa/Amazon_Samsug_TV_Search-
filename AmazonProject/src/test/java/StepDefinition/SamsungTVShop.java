package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pages.ShopSamsungpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SamsungTVShop {
	
	
private ShopSamsungpage shopSamsungpage = new ShopSamsungpage(DriverFactory.getDriver());
	
	@Given("open Amazon page")
	public void openAmazon() {
		
		DriverFactory.getDriver().get(" https://www.amazon.in/");
		
		
	}
	
	@When("Click on the hamburger menu")
	
	public void ClickonMenu() {
		
		shopSamsungpage.clickonMenu();
		
	}
	@Then("Click on the TV, Appliances and Electronics link under Shop by Department section")
	public void ClickonTVAppliances() throws InterruptedException {
		
		shopSamsungpage.link();
		
	}
	@And("click on Televisions under Tv, Audio & Cameras sub section")
	public void clickonTelevisions() {
		
		shopSamsungpage.Tele();
		
		
	}
	@And("check 'samsung' under Brands")
	public void checkSamsung() {
		
		shopSamsungpage.checkbox();;
		
	}
	@And("Sort the Samsung results with price High to Low")
	public void SorttheSamsung() {
		
		shopSamsungpage.sortBy();
		
	}
	@Then("Click on the second highest priced item")
	public void Click_on_second__item() {
		
		shopSamsungpage.sItem();
		
		
	}
	@Then("Switch the Window")
	public void SwitchtheWindow() {
		
		
		shopSamsungpage.getwindow();
		
	}
	@And("Assert that “About this item” section is present")
	public void AssertTit() {
		
		String  about = shopSamsungpage.getTileAbout();
		String axpected = "About this item";
		
		Assert.assertEquals(axpected , about);;
		
		shopSamsungpage.quit();
	}
	
		
	}



