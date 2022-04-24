package testNg_Concept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_02 {
	
	
  @Test
  public void facebookTest() {
	  System.out.println("Facebook test annotation");
  }
  
  @Test
  public void FlipcartTest() {
	  System.out.println("Flipcart test annotation");
  }
  
  @BeforeMethod
  public void bm() {
	  System.out.println("Before methode annotation");
  }
  
  @BeforeClass
  public void bc() {
	  System.out.println("Before class annotations");
  }
  
  @BeforeTest
  public void bt() {
	  System.out.println("Before Test Annotations");
  }
  
  @BeforeSuite
  public void bs() {
	  System.out.println("Before Suite annotations");
  }
  
  @AfterMethod
  public void am() {
	  System.out.println("After method annotations");
  }
  
  @AfterClass
  public void ac() {
	  System.out.println("After class annotations");
  }
  
  @AfterTest
  public void at() {
	  System.out.println("After Test annotations");
  }
  
  @AfterSuite
  public void as() {
	  System.out.println("After Suite annotations");
  }
  
  
  
  
  
  
  
}
