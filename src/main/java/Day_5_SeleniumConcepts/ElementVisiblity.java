package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ElementVisiblity {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		WebElement DMVTEKLOGO=driver.findElement(By.xpath("//img[@class='img-fluid']"));
		boolean logo=DMVTEKLOGO.isDisplayed();
		System.out.println(logo);
		if (logo) {
			System.out.println("The test case is passed");	
		}else {
			System.out.println("The test case is failed");
		}
		driver.close();
		
		
		
		
		
	}

}
