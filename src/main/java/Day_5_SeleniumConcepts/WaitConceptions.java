package Day_5_SeleniumConcepts;

import java.time.Duration;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConceptions {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(10000);
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		
		
		
//		driver.findElement(By.id("input-email")).sendKeys("masiha@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("123@yours");
		
		By emailID= By.id("input-email");
		By passwodOID=By.id("input-passowrd");
		By loginButton=By.xpath("(//button[@type='submit'])[2]");
		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
//		WebElement waitingTime= wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
//	
//		driver.findElement(emailID).sendKeys("masiha@gmail.com");
//		driver.findElement(passwodOID).sendKeys("Automation123");
//		driver.findElement(loginButton).click();
		
		expicitWait(loginButton,5).click();
		
	}
	public static  WebElement expicitWait(By locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

}
