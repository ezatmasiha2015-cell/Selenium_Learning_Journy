package Day_5_SeleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomJSalertCreation {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("alert('Please write the correct phone number!')");
//		
		
		AlertGenerate("Please add you number!");
		
		
		
	}
	public static void AlertGenerate(String alertMessage) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('"+ alertMessage+"')");
	}
}
