package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		WebElement Slider=driver.findElement(By.cssSelector("div#slider>span.ui-slider-handle"));
		Actions act = new Actions(driver);
		act.clickAndHold(Slider).moveByOffset(100, 0).perform();
		act.clickAndHold(Slider).sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		act.clickAndHold(Slider).sendKeys(Keys.HOME).perform();
		
	Dimension dem=	Slider.getSize();
	System.out.println ("Slidr dimension is:" +dem);
	int height=Slider.getSize().getHeight();
	int width=Slider.getSize().getWidth();
	
	System.out.println("slider height is: "+height);
	System.out.println("slider width is : "+width);
	
	
	
		
		
	}
	

}
