package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	
	static WebDriver driver;
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://www.pexels.com/");
		List<WebElement> listImages= driver.findElements(By.tagName("img"));
		int totlaimages=listImages.size();
		System.out.println(totlaimages);
		
		for (WebElement e : listImages) {
		String srcValue=e.getAttribute("src");
		String altValue=e.getAttribute("alt");
		System.out.println(srcValue + "------->"+ altValue);
		
		
			
		}
		
		
		
		
		 
		 
	}
	
	
	
	

}
