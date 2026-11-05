package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login?hubs_signup-url=www.hubspot.com");
//		driver.findElement(By.className("TextInput__StyledInput-dZxQPg eaGEy")).sendKeys("masiha@gmail.com");
//		driver.findElement(By.cssSelector(".TextInput__StyledInput-dZxQPg.eaGEy")).sendKeys("masiha@gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("masiha@gmail.com");
		
		//		List<WebElement> RowList= driver.findElements(By.xpath("//table[@class='table table-striped']/child::tbody/child::tr"));
//		List<WebElement> Columnheader=driver.findElements(By.xpath("//table[@class='table table-striped']/child::thead//following-sibling::tbody/child::tr"));
//		for (WebElement R :Rowlist) {
//			List<WebElement>cellslist=R.findElements(By.tagName("td"));
//			HasMap<String String> rowMap=new HashMap<>();
//			
//		}
	}

}
