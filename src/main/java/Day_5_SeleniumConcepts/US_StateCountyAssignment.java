package Day_5_SeleniumConcepts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class US_StateCountyAssignment {
	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/giardia/dog/united-states/virginia/2849-fairfax-county");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]")));
		driver.findElement(By.xpath("//*[@id='virginia']")).click()	;
		
		String countyPath="//*[local-name() = 'g' and @id='virginia']//*[name() = 'g' and @class = 'rpath']//*[name()='g' and @class='subregion']//*[name()='path' and @class='child']";
		List<WebElement> Virginia=driver.findElements(By.xpath(countyPath));
		System.out.println("Number of regions in USA is: " + Virginia.size());
		Actions act = new Actions(driver);
		
		for(WebElement e : Virginia) {
			act.moveToElement(e).perform();
			String printRegonPath = e.getAttribute("name");
			System.out.println(printRegonPath);
			if(printRegonPath.equalsIgnoreCase("Fairfax County")) {
				e.click();
				break;
				
			}
		}
		
	}
}
	
	


