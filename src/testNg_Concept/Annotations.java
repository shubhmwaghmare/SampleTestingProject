package testNg_Concept;

import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class Annotations {

	@Test
	public void FacebookTest() {
		System.out.println("Facebook test annotation");
	}

	@Test
	public void AmezonTest() {
		System.out.println("Amezon test annotation");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("Before Method annotation");
	}

	@BeforeClass
	public void bc() {
		System.out.println("Before Class annotation");
	}

	@BeforeTest
	public void bt() {
		System.out.println("Before Test annotation");
	}

	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite annotation");
	}

	@AfterMethod
	public void am() {
		System.out.println("After Method annotation");
	}

	@AfterClass
	public void ac() {
		System.out.println("After Class annotation");
	}

	@AfterTest
	public void at() {
		System.out.println("After Test annotation");
	}

	@AfterSuite
	public void as() {
		System.out.println("After Suite annotation");
	}
}
