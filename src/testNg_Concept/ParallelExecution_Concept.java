package testNg_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecution_Concept  {
	
	WebDriver driver;
	
	//pre condition
	
  @BeforeMethod
  public void initilization() {
	  
	  System.setProperty("WebDriver.Chrome.driver", "E:\\SW-TECH  Software Testing\\Latest version\\chrome version\\chromedriver_win32 (3)");
	  driver=new ChromeDriver();
	 
	  
  }
  
  //test
  @Test
  public void googleSeachTest() {
	  
	  driver.get("https://www.google.com/");
	  driver.findElement(By.cssSelector("[title='Search']")).sendKeys("Automation Tester");
  }
  
  @Test
  public void bingSearchTest() {
	  
	  driver.get("https://www.bing.com/");
	  driver.findElement(By.id("sb_form_q")).sendKeys("manual Tester");
  }
  
 
  //post condition
  
  @AfterMethod
  public void closeResourses() {
	  driver.close();
  }
  
  
  
}
