package testNg_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersConcepts {
  
	
WebDriver driver;

	
	@Parameters("url")
	@BeforeMethod
	public void initilization(String url) {
		System.setProperty("WebDriver.Chrome.driver", "E:\\SW-TECH  Software Testing\\Latest version\\chrome version\\chromedriver_win32 (3)");
        driver= new ChromeDriver();    
      // driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.get(url);
	}
	
	@Parameters({"username","password"})
	@Test
	public void validateloginTest(String username,String password ) {
		
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		
		
	}
	
	@Test
	public void pimTest() {
		
		System.out.println("PIM Test");
	}
	
	@Test
	public void dashboardTest() {
		
		System.out.println("Dashboard Test");
	}
	
	//Post condition
	@AfterMethod
	public void closeResources() {
		driver.close();
		
	}
}
