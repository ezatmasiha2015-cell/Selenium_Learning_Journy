package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSuggestion {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	By googleSearchField=By.name("q");
	By Suggestionlink=By.xpath("//div[@class ='wM6W7d']/span");
	
//	driver.findElement(googleSearchField).sendKeys("Selenium Testing Jobs");
//	Thread.sleep(2000);
//	List<WebElement>totlasuggestionlinks=driver.findElements(Suggestionlink);
//	System.out.println(totlasuggestionlinks.size());
//	
//	
//	
//	for (WebElement e: totlasuggestionlinks) {
//		String text= e.getText();
//		System.out.println(text);
//		if (text.contains("selenium testing jobs remote")) {
//			System.out.println("The test case passed!");
//		}else {
//			System.out.println("The test case failed!");
//			
//		}
		
//		if (text.contains("selenium testing jobs in hyderabad")){
//			e.click();
//			break;
//		}
//		}
//		}
//	By googleSearch=By.name("q");
//	By suggestion=By.xpath("//div[@class='pcTkSc']");
//		
//	driver.findElement(googleSearch).sendKeys("laptop");
//	
//	
//	List<WebElement>listSuggestion=driver.findElements(suggestion);
//	System.out.println(listSuggestion.size());
//	
//	for (WebElement e: listSuggestion) {
//		String text=e.getText();
//		System.out.println(text);
//		if (text.contains("laptop lenovo")) {	
//			e.click();
//			break;
			

	googleSearch(googleSearchField, Suggestionlink, "laptop", "laptop dell");
	
	
	}
	
	public static void googleSearch(By googleSearchFieldLocator, By SuggestionlinkLocator, String SreachPhrase, 
			String SuggestionTextForClick ) {
		driver.findElement(googleSearchFieldLocator).sendKeys(SreachPhrase);
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
		}
			List<WebElement> suggistList=driver.findElements(SuggestionlinkLocator);
			System.out.println(suggistList.size());
		for(WebElement e: suggistList) {
		String text=e.getText();
		System.out.println(text);
		if (text.contains(SuggestionTextForClick)) {
			e.click();
			break;
		}
		}
	

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
