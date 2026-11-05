package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SvgGraphElements {
	
	static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException {
 
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		driver.manage().window().maximize();
 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]")));
		String stateXpath = "//*[local-name()= 'svg' and @id='map-svg']//*[name() ='g' and @id='regions']//*[name() = 'g' and @class='region']";
		List<WebElement> stateLocator = driver.findElements(By.xpath(stateXpath));
        
		System.out.println("Number of regions in USA is: " + stateLocator.size());
		
		Actions act = new Actions(driver);
		for(WebElement e : stateLocator) {
			act.moveToElement(e).perform();
			String PrintRegionsName = e.getAttribute("id");
			System.out.println(PrintRegionsName);
			if(PrintRegionsName.contains("virginia")) {
				e.click();
				break;
			}
		}
		driver.close();
		
	}
	

}
