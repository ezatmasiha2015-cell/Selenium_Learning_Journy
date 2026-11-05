package Day_5_SeleniumConcepts;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomJSPromptFiring {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
//		driver=new ChromeDriver();
		driver=new FirefoxDriver();
		
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("prompt('Are you looking for SDET course? ')");
//		Alert alrt=driver.switchTo().alert();
//		
//		alrt.sendKeys("yes");
//		Thread.sleep(2000);
//		alrt.accept();
//		driver.close();
		
		promptGenerate("Are you a Canadian?", "Yes, I am");
		driver.close();
		
		
	}
	public static void promptGenerate(String promptMessage, String KeySendValue) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("prompt('"+promptMessage+ " ')");
		Alert a=driver.switchTo().alert();
		a.sendKeys(KeySendValue);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		a.accept();
	}
}
