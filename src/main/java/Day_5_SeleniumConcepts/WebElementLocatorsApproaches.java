package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocatorsApproaches {
	static WebDriver driver;
	public static void main(String[]args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
//		WebElement EmailID= driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
//		WebElement PassId= driver.findElements(By.id("_R_1hmkqsqppb6amH1_"));
//		EmailID.sendKeys("masihaezat@gmail.com");
//		Thread.sleep(1500);
//		EmailID.clear();
//		EmailID.sendKeys("ezat2026@gmail.com");
//		PassId.sendKeys("1234@343");
		
		
		//Third approach
		
//		By EMid =By.id("_R_1h6kqsqppb6amH1_");
//		By Passid= By.id("_R_1hmkqsqppb6amH1_");
		
//		WebElement email= driver.findElement(EMid);	
//		WebElement passwoord= driver.findElement(Passid);
//		email.sendKeys("Masiha@gmail.com");
//		passwoord.sendKeys("1234@343");
		
		// 4th approach
		
//				By EMid =By.id("_R_1h6kqsqppb6amH1_");
//				By Passid= By.id("_R_1hmkqsqppb6amH1_");
//		
//		getElement(EMid).sendKeys("masiha@gmail.com");
//		getElement(Passid).sendKeys("1234@343");
//		
//		
//		
		
		//5th approach
		By EMid =By.id("_R_1h6kqsqppb6amH1_");
		By Passid= By.id("_R_1hmkqsqppb6amH1_");
		
		doSendkeys(EMid,"masiha@gmail.com");
		doSendkeys(Passid, "1234@343");
		
		//6th approach
		
//		By EMid =By.id("_R_1h6kqsqppb6amH1_");
//		By Passid= By.id("_R_1hmkqsqppb6amH1_");
//		
//		ElementUtils eleUtils= new ElementUtils(driver);
//		
//		eleUtils.doSendkeys(EMid, "masiha@gmail.com");
//		eleUtils.doSendkeys(Passid, "1234@343");
		
		String elementText = driver.findElement(By.tagName("h2")).getText();
		System.out.println(elementText);
		if (elementText.equals("Returning Customer")) {
			System.out.println("The test case passed");
		}else {
			System.out.println("the test case failed");
		}
		
		
		
		
//		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
