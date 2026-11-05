package Day_5_SeleniumConcepts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoading {
	static WebDriver driver;
	public static void main(String[] args) {
		
		
		
		driver = new ChromeDriver();
				driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
				
				By emailID = By.cssSelector("input#input-email");
				By Pass = By.cssSelector("input#input-password");
				By login = By.xpath("//button[text()= 'Login']");
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//				
				String pageLoading = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'")).toString();
//				String javaScript=wait.until(ExpectedConditions.jsReturnsValue(" return document.readyState === 'complete'")).toString();
//				if(Boolean.parseBoolean(javaScript)) {
//				
//					System.out.println("page is fully loaded :" + javaScript);
//					wait.until(ExpectedConditions.visibilityOfElementLocated(emailID)).sendKeys("masiha@gmail.com");
//					wait.until(ExpectedConditions.visibilityOfElementLocated(Pass)).sendKeys("automaiotn123");
//					wait.until(ExpectedConditions.visibilityOfElementLocated(login)).click();
//				}
                if(Boolean.parseBoolean(pageLoading)) {
                	System.out.println("The url is fully loaded");
                	 wait.until(ExpectedConditions.visibilityOfElementLocated(emailID)).sendKeys("Sahar@gmail.com");
                     wait.until(ExpectedConditions.visibilityOfElementLocated(Pass)).sendKeys("123456");
                     wait.until(ExpectedConditions.visibilityOfElementLocated(login)).click();
                }
 
		
		
		
//		driver=new ChromeDriver();
//		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
//		By emailId=By.id("input-email");
//		By password=By.id("input-password");
//		By loginBtn=By.xpath("//button[text()='Login']");
//		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//	
//		String javaScript=wait.until(ExpectedConditions.jsReturnsValue(" return document.readyState === 'complete'")).toString();
//		if(Boolean.parseBoolean(javaScript)) {
//		
//			System.out.println("page is fully loaded :" + javaScript);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys("masiha@gmail.com");
//			wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("automaiotn123");
//			wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn)).click();
			
		
//boolean loading=pageLoadingUtil(5);
//System.out.println(driver.getTitle() + driver.getCurrentUrl());
//System.out.println("page is fully loaded :" + loading);
	
	}
	public static boolean pageLoadingUtil(int timeOut) {
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeOut));	
	String javaScript=wait.until(ExpectedConditions.jsReturnsValue(" return document.readyState === 'complete'")).toString();
	return Boolean.parseBoolean(javaScript);
	}
	
}
