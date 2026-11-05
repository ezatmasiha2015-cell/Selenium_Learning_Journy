package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSNavigationConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
//		driver=new FirefoxDriver();
		
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
		System.out.println(driver.getTitle());
		
		
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		js.executeScript("history.go(-1)");
//		System.out.println(driver.getTitle());
//		js.executeScript("history.go(1)");
//		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
//		js.executeScript("history.go(0)");
		nevigateForward();
		nevigateBackward();
		nevigateRefresh();
		
		
	}
	public static void nevigateForward() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(1)");
	}
	public static void nevigateBackward() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(-1)");
}
	public static void nevigateRefresh() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
}
}
