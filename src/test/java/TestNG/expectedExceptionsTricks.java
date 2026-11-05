package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class expectedExceptionsTricks {
	WebDriver driver;
	@Test(expectedExceptions=ArithmeticException.class)
	
	public void TitleTest() {
		int a = 9/0;
		System.out.println(" Hello future of SDETs");
		
		}
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class})
	public void URLeTest() {
		int a = 9/0;
		System.out.println(" Hello future of SDETs");
	
		String num = null;
	System.out.println(num.length());
	System.out.println("hi friends");
	
		
	}
	@Test
	public void getURLTest() {
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");;
		
		 driver.findElement(By.id("input-emailff")).sendKeys("maisha.gmail.com");
	}
	
}
