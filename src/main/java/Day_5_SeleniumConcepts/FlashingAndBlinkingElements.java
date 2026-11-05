package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashingAndBlinkingElements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		driver.manage().window().maximize();
 
		WebElement emalID = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		
		// Rough Code
		JavascriptExecutor js = (JavascriptExecutor) driver;
		emalID.sendKeys("sabawoon@gmail.com");
		for(int i = 0; i<10; i++) {
			js.executeScript("arguments[0].style.backgroundColor = 'orange';", emalID);
			Thread.sleep(300);
			js.executeScript("arguments[0].style.backgroundColor = 'blue';", emalID);
			Thread.sleep(300);
			js.executeScript("arguments[0].style.backgroundColor = 'black';", emalID);
			Thread.sleep(300);
			js.executeScript("arguments[0].style.backgroundColor = 'yellow';", emalID);
			Thread.sleep(300);
//			password.sendKeys("123456");
//			for(int a=0; a<10; a++) {
//			js.executeScript("arguments[0].style.backgroundColor= 'pink'", password);
//			Thread.sleep(300);
//			js.executeScript("arguments[0].style.backgroundColor= 'blue'", password);
//			Thread.sleep(300);
//			js.executeScript("arguments[0].style.backgroundColor= 'yellow'", password);
//			Thread.sleep(300);
//			}
		//	
			By email = By.id("input-email");
			
			blinkingAndFlashingUtils(email, "masiha@gmail.com", "red", "yellow");
			
		}
			
			
			//need to create the utility methods?
		
		
		}
			
	public static void blinkingAndFlashingUtils(By emailID, String sentKeysValue, String FirstColor, String SecondColor)  {
	WebElement path = driver.findElement(emailID);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	path.sendKeys(sentKeysValue);
	for(int a=0; a<10; a++) {
	js.executeScript("arguments[0].style.backgroundColor= '"+FirstColor+"'", path);
 
	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	js.executeScript("arguments[0].style.backgroundColor= '"+SecondColor+"'", path);
	try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
 
		e.printStackTrace();
	}
			
			
			
		}

}


}
