package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingAllTextofPageWithJS {
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
			Thread.sleep(800);
		
		
		}
		
	

}
}