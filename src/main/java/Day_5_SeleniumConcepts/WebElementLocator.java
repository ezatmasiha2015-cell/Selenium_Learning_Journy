package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocator {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		 driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
	// 1- approach	 
//		 driver.findElement(By.id("input-email")).sendKeys("masiha@gmail.com");
//		 driver.findElement(By.id("input-password")).sendKeys("Text123");
//		 
		//2 approach
		 
//		 driver.findElement(By.name("email")).sendKeys("masiha2026@gmail.com");
//		 driver.findElement(By.name("password")).sendKeys("text123");
//		 
//		 	
		//4 approach
		 
//		 driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("masiha2026@gmail.com");
//		 driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("text123");
//		 driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
//		 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/a")).click();
		//by locators 
//		By emid= By.xpath("//*[@id=\"input-email\"]");
//		By pasid= By.xpath("//*[@id=\"input-password\"]");
//		By login=By.xpath("//*[@id=\"form-login\"]/div[3]/button");
//		
//		doSendkeys(emid, "Masiha2026@gmail.com");
//		doSendkeys(pasid, "test123");
//		doClick(login);
		
		//5th approch ------> css selector
		
//		
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("masiha2026@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("1234");
//		driver.findElement(By.cssSelector("#form-login > div.text-end > button")).click();
//		6th approach
//		
//7th Approach
		 
		 
//		 driver.findElement(By.partialLinkText("Password")).click();
		
//		 By partial=By.partialLinkText("Password");
//		 doClick(partial);
		 
//		String elementText=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(elementText);
//		
//		String register= driver.findElement(By.tagName(elementText))
//		
	}
	public static WebElement getElement(By locators) {
		return driver.findElement(locators);
	}
	public static void doSendkeys(By locators, String value) {
		getElement(locators).sendKeys(value);
	}
	public static void doClick(By locators) {
		getElement(locators).click();
	}
	
	public static void doElementGetText (By locators) {
		getElement(locators).getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
