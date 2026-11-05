package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class paginationConcepts {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.selectorshub.com/xpath-practice-page/");
		WebElement tablePath=driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-33c37eb e-con-full e-flex e-con e-child']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(tablePath).perform();
		Thread.sleep(3000);
		
		while (true) {
//			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
//				driver.findElement(By.xpath("//td[text()='Ukraine']//preceding-sibling::td/child::input[@type='checkbox']")).click();
			if(driver.findElements(By.xpath("//td[text()='masiha']")).size()>0) {
//				paginationsUtility("masiha");
				break;
		}else {
			WebElement nextPath=driver.findElement(By.xpath("//button[@aria-label='Next']"));
			if(nextPath.getAttribute("class").contains("disabled")){
				System.out.println("The pagination is over and the county not founded");
				break;
			}
			nextPath.click();
//			System.out.println(nextPath);
//			nextPath.click();
			Thread.sleep(1000);
		}
			
		
		}
		multiSelection("India");
		
	}
	public static void paginationsUtility (String countryName) {
//	driver.findElement(By.xpath("//td[text()='"+countryName+"']//preceding-sibling::td/child::input[@type='checkbox']")).click();	
	while (true) {
		if(driver.findElements(By.xpath("//td[text()='"+countryName+"']")).size()>0) {
			driver.findElement(By.xpath("//td[text()='"+countryName+"']//preceding-sibling::td/child::input[@type='checkbox']")).click();
			break;
	}else {
		WebElement nextPath=driver.findElement(By.xpath("//button[(@class='dt-paging-button next')]"));
//		System.out.println(nextPath);
		if(nextPath.getAttribute("class").contains("disabled")){
			System.out.println("The pagination is over and the county not founded");
		}
		nextPath.click();
		
	}
	}
	}
	public static void multiSelection (String CountryName) {
		List<WebElement> elements= driver.findElements(By.xpath("//td[text()='"+CountryName+"']//preceding-sibling::td/child::input[@type='checkbox']"));
		for(WebElement e: elements) {
			e.click();
		}
}
}	
		
			
		
			
		




