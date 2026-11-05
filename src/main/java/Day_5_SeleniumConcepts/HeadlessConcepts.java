package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcepts {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions co= new ChromeOptions();
//		co.addArguments("--headless");
//		driver= new ChromeDriver();
//		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
//		driver.findElement(By.id("input-email")).sendKeys("masiha@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Automation123");
//		
//			System.out.println(driver.getTitle()+ driver.getCurrentUrl());
//		FirefoxOptions co= new FirefoxOptions();
//		co.addArguments("--headless");
//		driver= new FirefoxDriver();
//		Thread.sleep(3000);
//		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
//		driver.findElement(By.id("input-email")).sendKeys("masiha@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Automation123");
//		
//			
//			System.out.println(driver.getTitle()+ driver.getCurrentUrl());		
//		EdgeOptions co= new EdgeOptions();
//		co.addArguments("--headless");
//		driver= new EdgeDriver();
//		Thread.sleep(3000);
//		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
//		driver.findElement(By.id("input-email")).sendKeys("masiha@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Automation123");
//		
//			
//			System.out.println(driver.getTitle()+ driver.getCurrentUrl());		
	// calling 	
		
	
	WebDriver headlesmethod=headlessUtilMtd("firefox");	
	headlesmethod.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");

	System.out.println(driver.getTitle() + driver.getCurrentUrl());
		
	}
	public static WebDriver headlessUtilMtd(String browser) {
		switch(browser.toLowerCase().trim()){
		case "chrome": 
			ChromeOptions co= new ChromeOptions();
			co.addArguments("--headless= new");
			driver= new ChromeDriver(co);
			break;
		case "firefox":
			FirefoxOptions fo= new FirefoxOptions();
			fo.addArguments("--headless");
			driver= new FirefoxDriver(fo);
			break;
		case "edge":
			EdgeOptions eo= new EdgeOptions();
			eo.addArguments("headless=new");
			driver= new EdgeDriver(eo);
			break;
			
		default :
			System.out.println(" The browser not founded!");
		
			
		}
		return driver;
	}

}
