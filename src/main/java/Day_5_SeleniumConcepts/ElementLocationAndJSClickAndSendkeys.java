package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementLocationAndJSClickAndSendkeys {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
		
	
		Thread.sleep(2000);
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("document.getElementById('_R_c9l6neappb6amH1_').value='masiha@gmail.com'");
		Thread.sleep(3000);
		
//		driver.get("https://login.yahoo.com/");
//		WebElement checkbox=driver.findElement(By.xpath("//input[@id='persistent']"));
		//*[@id='input-email'
		//input[contains(@name,'firstname')]
		//*[contains(name,'first')]
		
		
//		checkbox.click();
//		Actions act=new Actions(driver);
//		act.click(checkbox).perform();
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("argument[0].click();", checkbox);
		
		
		
		
//		ClickWebElementwithJS("checkbox");
		
		
		
}
	public static void ClickWebElementwithJS(String string) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click();", string);
		
	}
}
