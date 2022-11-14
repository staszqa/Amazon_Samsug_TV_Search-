package ApplicationNooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.utill.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	private DriverFactory driverfactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order =0)
	
	public void  getProperty(){
		
		configReader = new ConfigReader();
		
		 prop = configReader.init_prop();
		
		
	}

	@Before(order =1)
	public void launchbrowser() {
		String browserName = prop.getProperty("browser");
		driverfactory = new DriverFactory();
		 driverfactory.init_driver(browserName);
		
	}
	

	
	
	}
	
