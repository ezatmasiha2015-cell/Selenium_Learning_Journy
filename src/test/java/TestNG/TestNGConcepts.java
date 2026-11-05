package TestNG;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGConcepts {
	
	WebDriver driver;
	
	//Precondition
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://qa.dmvtek.com/retail/");		
	}
	
	//Test cases
	@Test(priority=2)
	public void isRetailCartLogoVisibleTest() {
	boolean logoExistance=driver.findElement(By.cssSelector("img.img-fluid")).isDisplayed();
	System.out.println(logoExistance);
	Assert.assertEquals(logoExistance, true);
	}
	@Test (priority = 1)
	public void retailCartPageTitle() {
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Your store of fun");
	}
	@Test (priority=3)
	public void retailCartURLTest() {
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains(".com/retail"));
	}
	//PostConditions or teaDowns
	@AfterTest
	
	public void tearDown() {
		driver.quit();
	}
}
