package Day_5_SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptJSPopupHandle {
	static WebDriver driver;
	public static void main(String[]args) {
		
	driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.cssSelector("[onclick='jsPrompt()']")).click();
		
		Alert alrt=driver.switchTo().alert();
		String text=alrt.getText();
		System.out.println(text);
		alrt.sendKeys("DMVTEK is the best school to learn software automation");
		alrt.accept();
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
