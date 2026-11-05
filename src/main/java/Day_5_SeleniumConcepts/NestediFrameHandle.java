package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediFrameHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.selectorshub.com/iframe-scenario/");
		
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("SQl");
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Java");
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Automation Engineer");
		
		//frame 3 - frame 2
		driver.switchTo().parentFrame();
		WebElement CurrentCrush=driver.findElement(By.id("jex"));
		CurrentCrush.clear();
		CurrentCrush.sendKeys("Winter");
		
		
		
		//frame 2-frame 1
		driver.switchTo().parentFrame();
		WebElement crushName=driver.findElement(By.id("inp_val"));
		crushName.clear();
		crushName.sendKeys("Spring");
		
	}

}
