package simpleWebpage;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Xpath_01 {

		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("8975408078");
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("shubham");
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("shubham");


		}

	}



