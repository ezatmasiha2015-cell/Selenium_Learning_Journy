package Day_1_SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class UtilityAssignment {
	
public static WebDriver driver;
public static void main(String[] args) {
//	launchBrowser("Chrome");

	
//	*/Assignment: (Automation Challenge: Testing BrowserUtils on eBay)
//	Now that you have practiced testing the BrowserUtils generic methods with the Retail application,
//	your challenge is to automate the following scenario using ebay.com.
//		1.	Launch the Browser: Open a new browser session using the BrowserUtils method.
//		2.	Navigate to eBay: Open: https://www.ebay.com/
//		3.	Verify the Page Title
//				Fetch the page title using the utility method.
//				Verify that the title is correct.
//		4.	Verify the Page URL
//				Fetch the current page URL using the utility method.
//				Verify that it matches the expected eBay URL.
//		5.	Verify Page Content
//				Use the BrowserUtils page-source utility method to search for a phrase that exists on the eBay page.
//				Verify that the phrase is found.
//		6.	Close the Browser: Use the appropriate BrowserUtils method to close the browser.
//	Challenge: Try to complete the entire test using only the generic BrowserUtils methods you have developed, 
//	rather than directly accessing the WebDriver instance.
//*/
}
	public static void  launchBrowser (String BrowserName) {
		System.out.println("The browser name is: " +BrowserName);
	String BrowserName1 = "Chrome";
	switch (BrowserName1.toLowerCase().trim()) {
	
	case "Chrome":
		driver = new ChromeDriver();
		break;
	case "Firefox":
		driver = new FirefoxDriver();
		break;
		
	case "Edge":
		driver = new EdgeDriver();
		break;
	case "Safari":
		driver = new SafariDriver();
		break;
	default:
		System.out.println("This browser is not available!");
		throw new AutomationException("This is an Invalid Browser" + BrowserName1);
		
	
	
	}
	return;
	}
			
	public String LaunchUrl (String url) {
		if (url == null) {
			System.out.println("URL IS NULL");
			throw new AutomationException("URL  is null");
			
	}
		if (url.indexOf("http") == 0) {
			driver.get(url);
		}else {
			throw new AutomationException ("The http is missing!");
			
		}
		return url;
		
	}
		
	public String getPageTitle () {
	String pageTitle=driver.getTitle();
	System.out.println("The page title is: " +pageTitle);
	return pageTitle;
	}
		
	
	public String pageUrl () {
		String url = driver.getCurrentUrl();
		return url;
	}
		
		
	
	
	
	

}
