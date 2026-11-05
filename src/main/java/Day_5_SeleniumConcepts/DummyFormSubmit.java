package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyFormSubmit {
	static WebDriver driver;
	public static void main(String[]args) {
		driver=new ChromeDriver();
		driver.navigate().to("https://selectorshub.com/xpath-practice-page/");
		
		By email=By.xpath("//input[@type='email']");
		
		By password=By.xpath("(//input[@id='pass'])");
		By companyName=By.xpath("(//input[@name='company'])[1]");
		By mobileNumber=By.xpath("(//input[@name='mobile number'])[1]");
		By country=By.xpath("(//input[@type='text'])[2]");
		
		By crushName=By.xpath("//input[@placeholder='First Crush']");
		By submit=By.xpath("//button[text()='Submit']");
		
		
		
		
		ElementUtils calling=new ElementUtils(driver);
		calling.doSendkeys(email, "masiha@gmail.com");
		calling.doSendkeys(password, "1234");
		calling.doSendkeys(companyName, "Google");
		calling.doSendkeys(mobileNumber, "089880507");
		calling.doSendkeys(country, "Indonesia");
		
		calling.doSendkeys(crushName, "Jawahir");
		calling.doClick(submit);
		
		
		
	}

}
