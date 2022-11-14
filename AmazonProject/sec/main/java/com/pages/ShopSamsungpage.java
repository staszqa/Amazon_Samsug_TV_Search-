package com.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopSamsungpage {
	
	private WebDriver driver;
	// create constructor of the page 
	public ShopSamsungpage(WebDriver driver) {
		this.driver = driver;
	}
	
	//  will create By locators for hamburger menu
	private By hmenu = By.xpath("//i[@class='hm-icon nav-sprite']");
	
	private By TVlink = By.xpath("//div[normalize-space()='TV, Appliances, Electronics']");
	
	private By Tele = By.xpath("//a[normalize-space()='Televisions']");
	
	
	// locator for sort By button 
	
	private By sortBy = By.xpath("//span[@id='a-autoid-0-announce']");
	
	// locator for 
	private By highLow  = By.xpath("//a[@id='s-result-sort-select_2']");
	
	// locator of a second item on the page 
	
	private By sItem = By.xpath("//img[@alt='Samsung 214 cm (85 inches) 4K Ultra HD Smart Neo QLED TV QA85QN90BAKXXL (Titan Black)']");
	
	
	//verify description of the item 
	
		private By about = By.xpath("//h1[normalize-space()='About this item']");
		
	
	//click on menu 
	public void clickonMenu() {
		
		driver.findElement(hmenu).click();
	}
	//click onTVlink 
		public void link() {
	
			driver.findElement(TVlink).click();
			
		}
		
		//click on Television 
		public void Tele() {

	driver.findElement(Tele).click();
	
}
		//click on check box
				public void checkbox() {
					
					driver.findElement(By.xpath("//span[contains(@class,'a-size-base a-color-base')][normalize-space()='Samsung']")).click();

				}
				//click on sortBy 
				public void sortBy() {
					
					driver.findElement(sortBy).click();
					driver.findElement(highLow).click();
					
				}
				
				//click on second item 
				public void sItem() {
					driver.findElement(sItem).click();
				}
				//click on get TitleAbout
				public String getTileAbout() {
					
					
					String  about = driver.findElement(By.xpath("//h1[normalize-space()='About this item']")).getText();
					
					
					return about;
					
					

				}
				
				
	//Swich window , page actions 
	
public void getwindow() {
	
	Set <String> getwindow = driver.getWindowHandles();
	List <String> listwondow = new ArrayList<String>(getwindow);
	
	driver.switchTo().window(listwondow.get(1));
	
}

//quit driver
public void quit() {
	driver.quit();
}
}
