package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class incognitorConcept {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	ChromeOptions co= new ChromeOptions();
	co.addArguments("--incognito");
	driver = new ChromeDriver(co);
	driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
	
	
	driver.findElement(By.id("input-email")).sendKeys("Masiha@gmail.com");
	 driver.findElement(By.id("input-password")).sendKeys("Automations123");


	
	
	
	
	}
	
	

}
