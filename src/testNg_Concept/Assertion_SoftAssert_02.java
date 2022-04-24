package testNg_Concept;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;

	import java.io.IOException;
	import java.util.Properties;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
		
		

		
		public class Assertion_SoftAssert_02 {
			
		WebDriver driver;
		Properties prop;
		SoftAssert Softassert;

			
			
			@BeforeMethod
			public void initilization() throws IOException {
				
				Softassert = new SoftAssert();
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
				
				//Actual vs expected or validation
				//Assertions
				    //SoftAssert
				
			   String UID =  driver.findElement(By.cssSelector("#welcome.panelTrigger")).getText();
			  // Softassert.assertEquals(UID, "Welcome Pa ul", "Element not Found");	//case:1(true)   
			   Softassert.assertEquals(UID, "Welcome ", "Element not Found");	   //case:2(false)
			   
			   String QID =  driver.findElement(By.cssSelector("#menu_admin_viewAdminModule")).getText();
			  // Softassert.assertEquals(QID, "Admin", "Element not Found");	//case:1(true)
			   Softassert.assertEquals(QID, "Admi", "Element not Found");       //case:2(false)
			    System.out.println("rest of test");
			     
			     Softassert.assertAll();
			
			}
			
			
			//Post condition
			@AfterMethod
			public void closeResources() {
				driver.close();
				
			}
		}





	

