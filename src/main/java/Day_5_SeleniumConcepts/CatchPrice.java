package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CatchPrice {
	static WebDriver driver;
	public static void main(String[] args) {
//		driver=new ChromeDriver();
//		
//		driver.get("https://www.amazon.com/");
//		
//		By Input=By.id("twotabsearchtextbox");
//	By priceList=By.xpath("//div[@role='row']");
//		
//		
//		Search(Input,priceList, "bags", "bagsmart" );
//		
//		
//		
//		
//	}
//	public static void Search(By inputLocator, By priceListLocator, String TextPhrase, String SuggestionClick) {
//		driver.findElement(inputLocator).sendKeys(TextPhrase);
//		List<WebElement> suggestlist=driver.findElements(priceListLocator);
//		System.out.println(suggestlist.size());
//		
//	for (WebElement e : suggestlist) {
//		String text=e.getText();
//		System.out.println(text);
//	if (text.contains(SuggestionClick))	{
//		e.click();
//		break;
//	}
//	}
//		
//	}
//	
		driver = new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}
		
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//descendant::tr")).size();
		
		String beforeXpath = "//table[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int row = 2; row<=rowCount; row++) {
			String actXpath = beforeXpath + row + afterXpath;
			// System.out.println(actXpath);
			String companyColumn = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(companyColumn);
		}
	}
 

	
}
