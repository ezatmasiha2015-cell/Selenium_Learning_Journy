package Day_5_SeleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementUtilityMethods {
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		By links =By.tagName("a");
		By image=By.tagName("img");
		
		
		
	int LinkCount=getElementsCount(links);
	System.out.println("Total links are:" +LinkCount);
	
	int imagesCount=getElementsCount(image);
	System.out.println("The totla images: " +imagesCount);
		
	List<String> actualLinkText=getElementsText(links);
	System.out.println(actualLinkText);
	
	
	if (actualLinkText.contains("Laptops & Notebooks")) {
		System.out.println("The test case is passed!");
	}else {
		System.out.println("The test case is failed");
	}
	}
	
	
	public static List<WebElement> getElements (By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	public static List<String> getElementsText(By locator) {
		List<WebElement> totalListText= getElements(locator);
		List<String> totallist=new ArrayList<String>();
		for (WebElement e : totalListText) {
			String text=e.getText();
			System.out.println(text);
			
		}
		return totallist;
	}
	
	
	//footer//a
	
	
	
	

}
