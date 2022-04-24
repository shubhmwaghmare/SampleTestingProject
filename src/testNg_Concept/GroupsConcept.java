package testNg_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsConcept {
	
	WebDriver driver;
	
	//pre condition
	
  @BeforeMethod
  public void initilization() {
	  
	  System.setProperty("WebDriver.Chrome.driver", "E:\\SW-TECH  Software Testing\\Latest version\\chrome version\\chromedriver_win32 (3)");
	  driver=new ChromeDriver();
	  
	 
	  
  }
  
  //test
  
  @Test(priority=1,groups= {"Sanity Test","Regression Test" })
  public void validateGoogleSearchTest() {
	  System.out.println("Test 1");
  }
  
  @Test(priority=2,groups="Regression Test")
  public void validateGmaillinkTest() {
	  System.out.println("Test 2");
  }
  
  @Test(priority=3,groups="Sanity Test")
  public void validateimageSearchTest() {
	  System.out.println("Test 3");
  }
  
  @Test(priority=4,groups={"Sanity Test","Regression Test"})
  public void validateLoginTest() {
	  System.out.println("Login successfully");
  }
  
  //post condition
  
  @AfterMethod
  public void closeResourses() {
	  driver.close();
  }
  
  
  
}
