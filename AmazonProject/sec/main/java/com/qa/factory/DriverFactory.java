package com.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

		public WebDriver Driver;
	
		public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();
		
		/*
		 * This method used to inilaze the paralel execution if needed 
		 */
		
		public  WebDriver init_driver(String browser) {
			
			if(browser.equals("chrome")) {
				//System.setProperty("Webdriver.Chrome.driver", "/Users/a/eclipse-workspace/AmazonProject/Drivers/chromedriver");
				
				WebDriverManager.chromedriver().setup();
				tdriver.set(new ChromeDriver());
				
			}else {
				System.out.println("Please pass the correct browser value" + browser);
			}
			getDriver().manage().window().maximize();
			getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			return getDriver();
			
			
		}
		/*
		 * This is ued to get driver with TreadLocal
		 */
		public static synchronized WebDriver getDriver() {
			return tdriver.get();
			
		}
		
		
	
	
}
