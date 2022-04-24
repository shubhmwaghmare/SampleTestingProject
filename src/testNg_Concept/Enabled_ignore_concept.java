package testNg_Concept;

import org.testng.annotations.Test;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.Ignore;


	public class Enabled_ignore_concept {
		
		WebDriver driver;
		
		//pre condition
		
	  @BeforeMethod
	  public void initilization() {
		  
		  System.setProperty("WebDriver.Chrome.driver", "E:\\SW-TECH  Software Testing\\Latest version\\chrome version\\chromedriver_win32 (3)");
		  driver=new ChromeDriver(); 
		  
	  }
	  
	  //test
	  
	  @Ignore
	  @Test(priority=1)
	  public void validateGoogleSearchTest() {
		  System.out.println("Test 1");
	  }
	  
	  @Test(priority=2)
	  public void validateGmaillinkTest() {
		  System.out.println("Test 2");
	  }
	  
	  @Test(priority=3,enabled=false)
	  public void validateimageSearchTest() {
		  System.out.println("Test 3");
	  }
	  
	  @Test(priority=4)
	  public void validateflipcartlinkTest() {
		  System.out.println("Test 4");
	  }
	  
	  
	  //post condition
	  
	  @AfterMethod
	  public void closeResourses() {
		  driver.close();
	  }
	  
	  
	  
	}
