package Day_5_SeleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivityConfirmMethod {
	static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
		Alert alrt = driver.switchTo().alert();
		String confirmText = alrt.getText();
		System.out.println("The text of the confrirm popup: " + confirmText);
		// alrt.accept(); // clicks ok
		alrt.dismiss(); // click cancel
		
		// Extract this text ---> "You clicked: Ok"
		// Print it to the console
		
	}
}
