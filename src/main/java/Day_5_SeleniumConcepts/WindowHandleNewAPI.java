package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleNewAPI {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		
	String parentWindow=driver.getWindowHandle();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(parentWindow);
	
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.cssSelector("#input-email")).sendKeys("masiha@gmail.com");
	driver.findElement(By.cssSelector("#input-password")).sendKeys("1234masiha");
//	driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	if(driver.findElement(By.xpath("//button[text()='Login']")).isDisplayed()){
		System.out.println("Test case is passed");
		
	}else {
		System.out.println("Test case is failed");
		
	}
		
		
		
		
		
		
		
		
		
		
	}

}
