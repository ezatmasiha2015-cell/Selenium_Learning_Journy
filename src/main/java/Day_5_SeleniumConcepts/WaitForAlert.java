package Day_5_SeleniumConcepts;

import java.time.Duration;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
//		driver.switchTo().alert();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	Alert alrt=	wait.until(ExpectedConditions.alertIsPresent());
	String alertText=alrt.getText();
	System.out.println(alertText);
	alrt.accept();
	}
	public static Alert waitForJsAlerts(int timeOut) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	public static void acceptJSAlert(int timeOut) {
		waitForJsAlerts(timeOut).accept();
	}
	public static void dismissJSAlert(int timeOut) {
		waitForJsAlerts(timeOut).dismiss();
	}
	public static void getJSAlertText(int timeOut) {
		waitForJsAlerts(timeOut).getText();
	}
	public static void enterValueJSAlertPrompt(int timeOut, String valueToSend) {
		waitForJsAlerts(timeOut).sendKeys(valueToSend);
}
}