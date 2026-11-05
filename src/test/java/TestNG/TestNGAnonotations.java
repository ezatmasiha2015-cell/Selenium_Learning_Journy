package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNGAnonotations {
	@BeforeSuite
	
	public void connectWithDataBase() {
		System.out.println("Before Suite -- Connecting with DataBase");
	}

	@BeforeClass
	
	public void launchBrowser() {
		System.out.println("Before Class -- launching the browser");
		System.out.println("------------------------");
	}
	
	@BeforeMethod
	public void loginToApp() {
		System.out.println("Before Method -- login into the application");
	}
	@Test
	public void searchTest() {
		System.out.println("Sreach Test");
	}

	@Test
	public void checkoutTest() {
		System.out.println("Checkout Test");
	}
	@AfterMethod
	public void logout() {
		System.out.println("After Method -- loging out of application");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("After class -- closing the browser");
	}
	@AfterTest
	public void deletBrowser() {
		System.out.println("After Test -- Deleting the User");
	}
	@AfterSuite
	public void disconnectWithDataBase() {
		System.out.println("After Suite -- Disconnect with the DataBase");
	}
	
	@BeforeTest
	
	public void createUser() {
		System.out.println("Before Test -- Creating User");
	}
	

}
