package Day_5_SeleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndURL {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		By xpathContact=By.xpath("//a[text()='About Us']");
		driver.findElement(xpathContact).click();
		WebElement newVr=driver.findElement(xpathContact);
		Actions act=new Actions(driver);
		act.moveToElement(newVr).click();
		act.perform();
//		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
////		js.executeScript("arguments[0].scrollIntoView(false)", xpathContact);
//		js.executeScript("arguments[0].scrollIntoView(false)", xpathContact);
//		js.executeScript("arguments[0].click()",xpathContact);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		if(wait.until(ExpectedConditions.titleContains("About123"))){
//			System.out.println(driver.getTitle());
//		}else {
//			System.out.println("The page loading takes time and the title is not loaded");
//			
//			String pageTitle=waitForTitleContains("About", 10);	
//			System.out.println(pageTitle);
//			if(pageTitle.contains("About")) {
//				System.out.println("Test case is passed");
//			}else {
//				System.out.println("Test case is failed");
//			}
			String CompletTitle= waitForTitleCompletValue("About Us", 5);
			System.out.println(CompletTitle);
			if(CompletTitle.contains("About Us")) {
				System.out.println("The test case is passed");
			}else {
				System.out.println("The test case is failed");
			}
			
			String URltext=waitForURLValue("https://qa.dmvtek.com/retail/index.php?route", 5);
			System.out.println(URltext);
			if(URltext.contains("information&language=en-gb&information_id=1")) {
				System.out.println("The test case is passed");
			}else {
				System.out.println("The test case is failed");
			}
			
//			
		
	}
	public static String waitForTitleContains(String titlePartial, int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.titleContains(titlePartial))){
			return driver.getTitle();
	}
		}catch(TimeoutException e) {
			System.out.println("The page loading takes time and the title is not loaded");
		}
		return titlePartial;
	}
	public static String waitForTitleCompletValue(String titleCompletValue, int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.titleIs(titleCompletValue))){
			return driver.getTitle();
	}
		}catch(TimeoutException e) {
			System.out.println("The page loading takes time and the title is not loaded");
		}
		return titleCompletValue;
	}
	public static String waitForURLValue(String URLValue, int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.urlContains(URLValue))){
			return driver.getTitle();
	}
		}catch(TimeoutException e) {
			System.out.println("The page loading takes time and the title is not loaded");
		}
		return URLValue;
		
}
	public List<WebElement> waitForVisibilityOfElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public static String waitForURLCompletValue(String URLCompletValue, int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.urlToBe(URLCompletValue))){
			return driver.getTitle();
	}
		}catch(TimeoutException e) {
			System.out.println("The page loading takes time and the title is not loaded");
		}
		return URLCompletValue;
	}
}
