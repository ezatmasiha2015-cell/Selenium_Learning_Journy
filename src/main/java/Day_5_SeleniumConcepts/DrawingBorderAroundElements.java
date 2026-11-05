package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawingBorderAroundElements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
	WebElement path=driver.findElement(By.xpath("//h3[normalize-space()='Calls & Voice']"));
	driver.manage().window().maximize();
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)" ,path);
	Thread.sleep(2000);
	js.executeScript("arguments[0].style.border='2px solid red'", path);
	
	
	//Create utility methods for path, size and colors
	
	
	
//	DrawingBorder(path, "4px", "green" );

	
		
	}
	public static void DrawingBorder(WebElement Pathvalue , String pxSize, String SoliColors) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)" ,Pathvalue);
		Thread.sleep(2000);
		js.executeScript("arguments[0].style.border='"+pxSize+" solid "+SoliColors+"'", Pathvalue);

	}

}
