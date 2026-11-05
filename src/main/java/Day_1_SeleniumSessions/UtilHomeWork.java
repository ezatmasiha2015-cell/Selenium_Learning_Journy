package Day_1_SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilHomeWork {
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
	
	WebDriver driver;
	public WebDriver LaunchBrowser (String BrowserName) {
		System.out.println("The browser name is " +BrowserName);
		switch (BrowserName.toLowerCase() .trim()){
			
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please add the correct browser!");
			throw new AutomationException ("Choose the correct browser" + BrowserName);
			
			
		}
		return driver;
	}
	
	public void launchUrl (String url) {
		if (url == null) {
			System.out.println("Url is null");
			throw new AutomationException ("Url is null");
		}
		if (url.indexOf("https") ==0) {
			driver.get(url);
		}else {
			throw new AutomationException ("You are missing the protocol");
		}
	}
	
	public String getPageTitle () {
		String title=driver.getTitle();
		System.out.println("Page title is :" + title);
		return title;
	}
	
	public String getPageUrl() {
	String url=	driver.getCurrentUrl();
	return url;
	
	}
	 public boolean getPageSource (String texts) {
	String pageSource =	 driver.getPageSource();
	if (pageSource.contains(texts)) {
		return true;
	}else {
		return false;
	}
	 }
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	

}
