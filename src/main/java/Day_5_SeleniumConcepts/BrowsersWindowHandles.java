package Day_5_SeleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class BrowsersWindowHandles {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it=handle.iterator();
		String parentWindowID=it.next();
		System.out.println("The parent window ID is : " +parentWindowID);
		String childWindoID=it.next();
		System.out.println("The child window ID is: " +childWindoID);
		System.out.println("------------------------------");
			//switching 
		driver.switchTo().window(childWindoID);
		System.out.println("Child page title is: " +driver.getTitle());
		System.out.println("Child page URL is : " + driver.getCurrentUrl());
		driver.close();
		System.out.println("------------------------------");
		driver.switchTo().window(parentWindowID);
		System.out.println( "Parent page title is: "+ driver.getTitle());
		System.out.println( "Parent page URL is : "+driver.getCurrentUrl());
		}
		
		
		
	}

