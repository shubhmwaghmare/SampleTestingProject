package testNg_Concept;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeMethod
	public void initilization(String browser)  {
		

		if(browser.equalsIgnoreCase("chrome")) {
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
		  
		 
	}
	
	
	
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


	


