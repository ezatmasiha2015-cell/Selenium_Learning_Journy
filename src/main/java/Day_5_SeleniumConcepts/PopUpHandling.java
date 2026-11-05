package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {
	static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
//	By AletButton=By.cssSelector("button[onclick='jsAlert()']");
		By AletButton=By.cssSelector("button[onclick='jsConfirm()']");
		By result=By.cssSelector("p[id='result']");
		driver.findElement(AletButton).click();
		
			
		Alert alrt=driver.switchTo().alert();
		String text=alrt.getText();
		System.out.println(text);
		Thread.sleep(2000);
//		alrt.accept();
		alrt.dismiss();
		String TextResult=driver.findElement(result).getText();
		System.out.println(TextResult);
		List<WebElement> ResultText=driver.findElements(result);
		for(WebElement r : ResultText) {
			String Rtext=r.getText();
			System.out.println(Rtext);
		}
		
}
	
	
	
	
	
	
	
}