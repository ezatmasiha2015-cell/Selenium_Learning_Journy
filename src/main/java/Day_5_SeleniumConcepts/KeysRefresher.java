package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysRefresher {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	By webElementPath=By.xpath("//a[text()='Help']");
	WebElement help=driver.findElement(webElementPath);
	
	Actions act=new Actions(driver);
	act.scrollToElement(help).perform();
		act.pause(300).perform();
		act.click(help).perform();
		
//		act.sendKeys(Keys.F5).perform();
		act
			.keyDown(Keys.CONTROL)
				.sendKeys("r")
					.keyUp(Keys.CONTROL)
						.perform();
	
	}
	
}
