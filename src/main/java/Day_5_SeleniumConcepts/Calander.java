package Day_5_SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calander {
static WebDriver driver;
public static void main(String[] args) {
	driver = new ChromeDriver ();
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	By blankSpace=By.cssSelector("input#datepicker");
	
//	driver.findElement(blankSpace).sendKeys("10/4/2026");
//	driver.findElement(blankSpace).click();
//	String getText=driver.findElement(blankSpace).getAttribute("value");
//	System.out.println(getText);
	SelectDateCalender("15");
	
	
	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(blankSpace)).click();
//	driver.findElement(By.xpath("//a[text()='12']")).click();
//	String textNumber=driver.findElement(blankSpace).getAttribute("value");
//	
//	System.out.println(textNumber);
	
	
	
}




public static void SelectDateCalender(String DayDate) {
	driver.findElement(By.cssSelector("input#datepicker")).click();
	driver.findElement(By.xpath("//a[text()='"+DayDate+"']")).click();
	String printN=driver.findElement(By.cssSelector("input#datepicker")).getAttribute("value");
	
	System.out.println(printN);
	
}
}
