package Day_5_SeleniumConcepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
	
		By twitter=By.xpath("//a[contains(@href,'twitter')]");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		if(wait.until(ExpectedConditions.numberOfWindowsToBe(2))){
		
		Set<String> handle=driver.getWindowHandles();
		
		Iterator<String> it=handle.iterator();
		String parentWindowId=it.next();
		System.out.println("Parent window ID is : "+ parentWindowId);
		String childWindowId=it.next();
		System.out.println("Child window ID is : "+ childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("Child page title is :" + driver.getTitle());
		System.out.println("Child page URL is: "+ driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent page title is : "+ driver.getTitle());
		System.out.println("Parent page URL is : " +driver.getCurrentUrl());
		driver.quit();
	}else {
		System.out.println("adding for test");
	}
	}
}
