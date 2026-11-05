package Day_5_SeleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentElementText {
//	Assignment:
//	•	Launch the browser.
//	•	Navigate to: https://qa.dmvtek.com/retail/index.php?route=account/register&language=en-gb
//	•	Capture the total number of links from the right-hand side section of the page (where Login, Register, Forgotten Password, My Account, Address Book, Wish List, etc. are available).
//	•	Do the automation using the rough code approach and then use the utility approach by creating it.
//  close the browser

// By rightPanelSideLinks = By.className("list-group-item")
	
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/register&language=en-gb");
		
		
		By links=By.className("list-group-item");
		
		
		//Rough Method
		
//		List<WebElement> TextLinks=driver.findElements(links);
//		System.out.println("The total number of the links are :" +TextLinks.size());
		
//		for (WebElement e : TextLinks) {
//			String text= e.getText();
//			System.out.println(text);
//		
//		}
//		for (int i = 0; i<TextLinks.size(); i++) {
//		String text=TextLinks.get(i).getText();
//		System.out.println(i+"----------->" + text);
//		}
		//Utility Methods
		//Used for finding the total links of elements
	int Totallinks = getElementCount(links);	
	System.out.println(" The total links on the right sides are: " + Totallinks);
	// Used for getting the texts	
	List <String> AllText=getElementText(links);
	System.out.println(AllText);
	
	
	//Used for adding the numbers
	List<String> AllNumbers=getElement1(links);
	System.out.println(AllNumbers);
	
	}
 public static List<WebElement> getElement(By locator) {
	 return driver.findElements(locator);
 }
 // Methods to count the total number of links
 public static int getElementCount(By locator) {
	 return getElement(locator).size();
 }
 // Methods to bring the texts
 public static List<String> getElementText (By locator) {
	 List<WebElement> TotalLinkText=getElement(locator);
	 
	List<String> linkText=new ArrayList <String>();
	for (WebElement e : TotalLinkText) {
		String text=e.getText();
		System.out.println(text);
	}
	 return linkText;
	 
}
 // Methods to bring the numbers
 
 public static List<String> getElement1 (By locator) {
	 List<WebElement> totalLinkText=getElement(locator);
	 List <String> linkText=new ArrayList<String>();
	 
	 for (int i = 0; i<totalLinkText.size(); i++) {
		 String text=(i+1) +" "+totalLinkText.get(i).getText();
		 System.out.println(text);
		
		 
		 
	 }
	 return linkText;
 }
}
