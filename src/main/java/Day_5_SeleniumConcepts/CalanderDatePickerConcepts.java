package Day_5_SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class CalanderDatePickerConcepts {
	static WebDriver driver;

	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	By blankPath=By.cssSelector("input#datepicker");
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(blankPath)).click();
	driver.findElement(blankPath).sendKeys("1/1/2021");
		driver.findElement(By.xpath("//a[text()='15']")).click();
		String enterDate=driver.findElement(By.cssSelector("input#datepicker")).getAttribute("value");
		System.out.println(enterDate);
		
		
		//present
		
		selectDate("18");	
		String getDate=driver.findElement(By.cssSelector("input#datepicker")).getAttribute("value");
		System.out.println(getDate);
		String getText=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(getText);
		
		
//		Selecting Date for the future
		while(!getText.equalsIgnoreCase("June 2028")) {
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		 getText=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//		System.out.println(dynamicPath);
		
		}
//		Selecting Date for the past
//		while(!getText.equalsIgnoreCase("June 2023")) {
//			driver.findElement(By.xpath("//span[text()='Prev']")).click();
////			 getText=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//		}
//		 selectDate("20");	
//			String getDate=driver.findElement(By.cssSelector("input#datepicker")).getAttribute("value");
//			System.out.println(getDate);
			
//			selectFuturDate("February 2028",30)	;
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			String TextofDate=driver.findElement(By.cssSelector("input#datepicker")).getAttribute("value");
			
//			System.out.println(TextofDate);
		
//			 getText=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
//			System.out.println(dynamicPath);
	}
public static void selectDate(String dayOfDate) {
	driver.findElement(By.xpath("//a[text()='"+dayOfDate+"']")).click();
	
}
	public static void selectFuturDate(String futureYAndMonthsDate, int dayDate) {
	if (dayDate>31 || dayDate<=0) {
		System.out.println("Please pass the valid date: "+dayDate);
		return ;
		
	}
	if(futureYAndMonthsDate.contains("February") && dayDate>29){
	System.out.println("Pass the valid date: "+dayDate)	;
	return;
	}
	
	String currentDateYear=driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
	System.out.println(currentDateYear);
}





















}