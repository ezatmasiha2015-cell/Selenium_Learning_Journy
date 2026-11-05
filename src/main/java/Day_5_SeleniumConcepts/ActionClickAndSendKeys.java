package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickAndSendKeys {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		 driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		 By emailId=By.cssSelector("input#input-email");
		 By passwordId=By.cssSelector("input#input-password");
		By loginButton= By.xpath("//button[text()='Login']");
		
		
//		Actions act= new Actions(driver);
//		act.sendKeys(driver.findElement(emailId), "masiha@gmail.com").perform();
//		Thread.sleep(2000);
//		act.sendKeys(driver.findElement(passwordId), "123abc").perform();
//		Thread.sleep(2000);
//		act.click(driver.findElement(loginButton)).perform();
//		 driver.close();
//		 
	 MultiActionSendKeys(emailId,"masiha@gmail.com",passwordId,"123abc");
	 
	 ActionClick(loginButton);
		 
		 
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	public static void MultiActionSendKeys(By emailIDLocator ,String value,  By passwordIdLocator, String values) throws InterruptedException {
		Actions act= new Actions(driver);
		act.sendKeys(getElement(emailIDLocator), value).perform();
		Thread.sleep(2000);
		act.sendKeys(getElement(passwordIdLocator), values).perform();
		Thread.sleep(2000);
		
	}
	
	public static void ActionClick(By locator) {
		Actions act= new Actions(driver);
		act.click(getElement(locator)).perform();;
	}
	
}
