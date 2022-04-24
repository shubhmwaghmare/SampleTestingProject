package testNg_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethod {

	WebDriver driver;
	
	//pre conditions
	@BeforeMethod
	public void initilization() {
		System.setProperty("WebDriver.Chrome.driver", "E:\\SW-TECH  Software Testing\\Latest version\\chrome version\\chromedriver_win32 (3)");
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void validateloginTest() {
		
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("shubham");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods="validateloginTest")
	public void pimTest() {
		
		System.out.println("PIM Test");
	}
	
	@Test(dependsOnMethods="validateloginTest")
	public void dashboardTest() {
		
		System.out.println("Dashboard Test");
	}
	
	//Post condition
	@AfterMethod
	public void closeResources() {
		driver.close();
		
	}
	
	
		
		
		
		
		
	}
	
	


