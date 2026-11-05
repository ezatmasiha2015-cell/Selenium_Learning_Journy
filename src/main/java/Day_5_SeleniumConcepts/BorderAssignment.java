package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BorderAssignment {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			driver=new ChromeDriver();
			driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
			
		WebElement path=driver.findElement(By.xpath("//div[@class='list-group mb-3']"));
		
		
		
	
		DrawingBorder(path,"5px", "orange");
}
public static void DrawingBorder(WebElement Pathvalue , String pxSize, String SoliColors) throws InterruptedException {
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)" ,Pathvalue);
	Thread.sleep(2000);
	js.executeScript("arguments[0].style.border='"+pxSize+" solid "+SoliColors+"'", Pathvalue);

}

}
