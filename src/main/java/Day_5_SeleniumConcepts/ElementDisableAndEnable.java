package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class ElementDisableAndEnable {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/SabawoonAutomation.html");
		driver.findElement(By.cssSelector("#username")).sendKeys("masiha@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("123Selenium");
		
		
		
		WebElement CheckBox=driver.findElement(By.cssSelector("#termsCheckbox"));
		
		CheckBox.click();
		if(CheckBox.isSelected()) {
			System.out.println("The check box is selected and the test case is: Passed");
			
		}else {
			System.out.println("The check box is not selected and the test case is : Failed");
		}
		
	WebElement DosignIn=driver.findElement(By.cssSelector("#submitBtn"));
	DosignIn.click();
	if(DosignIn.isEnabled()) {
	System.out.println("sign in button is selected and the test case is : passed");
	}else {
		System.out.println("Sign in button is not selected and the test case is: failed");
		
	}
	driver.close();
		
		
		
		
		
	}
	
	

}
