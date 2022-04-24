package testNg_Concept;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	
	import org.testng.annotations.Test;

	public class DotProperties_Concepts {
	  
		
	WebDriver driver;
	Properties prop;

		
		
		@BeforeMethod
		public void initilization() throws IOException {
			
			FileInputStream file = new FileInputStream("C:\\Users\\dell\\eclipse-workspace1\\SpeedwatechSeleniumjan2\\configuration.properties");
			 prop =new Properties();
			prop.load(file);
			
			String browser=prop.getProperty("browser");
			if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("WebDriver.Chrome.driver", "E:\\SW-TECH  Software Testing\\Latest version\\chrome version\\chromedriver_win32 (3)");
	        driver= new ChromeDriver();    
			}
			
			else if(browser.equalsIgnoreCase("firefox")) {
			 System.setProperty("WebDriver.gecko.driver", "E:\\SW-TECH  Software Testing\\Latest version\\Firefox version\\geckodriver-v0.30.0-win32");
			 driver = new FirefoxDriver();
			}
			
			else {
				System.out.println("Please select valid browser");
			}
	        
	        driver.get(prop.getProperty("url"));
		}
		
		
		@Test
		public void validateloginTest() throws InterruptedException {
			
			driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys(prop.getProperty("username"));
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(prop.getProperty("password"));
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
			Thread.sleep(5000);
			
		
		
		}
		
		
		//Post condition
		@AfterMethod
		public void closeResources() {
			driver.close();
			
		}
	}



