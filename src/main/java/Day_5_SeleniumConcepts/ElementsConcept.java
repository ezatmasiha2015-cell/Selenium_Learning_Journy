package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsConcept {
	
	public static  void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//		
//		driver.findElement(By.id("_R_1h6kqsqppb6amH1_")).sendKeys("masiha@gmail.com");
//		driver.findElement(By.id("_R_1hmkqsqppb6amH1_")).sendKeys("1234");
//		
		
		
		WebElement EmailID= driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
		WebElement PassId=driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
		EmailID.sendKeys("masihaezat@gmail.com");
		Thread.sleep(1500);
		EmailID.clear();
		EmailID.sendKeys("ezat2026@gmail.com");
		PassId.sendKeys("1234@343");
		
		
		
	}

}
