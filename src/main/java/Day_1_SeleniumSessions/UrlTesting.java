package Day_1_SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlTesting {
	/*			Class Activity
 	1: Open the browser --> chrome -- firefox -- edge -- safari
 	2: Enter the URL --> https://www.target.com/
 	3: Get the title of the page -- print it to the console
 	4: Verify the title -- Actual Result Vs Expected
 	5: Fetch the page URL
 	6: Verify the page URL
 	7: Get/fetch the source of the page
 	8: Verify a few keywords in the page source
 	9: close the browser
 */
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		String pageTitle=driver.getTitle();
		System.out.println("The page title is " +pageTitle);
		
		if (pageTitle.equals("Target : Expect More. Pay Less.")) {
			System.out.println("The test case is passed");
		}else {
			System.out.println("The test case is failed");
		}
		String pageUrl = driver.getCurrentUrl();
		
		System.out.println("The page url is " +pageUrl);
		
		if (pageUrl.contains("target")) {
			System.out.println("The page url test case passed!");
		}else {
			System.out.println("The page url test case failed!");
		}
		
		String pageSource =driver.getPageSource();
		if (pageSource.contains("subscribe")) {
			System.out.println("the test case passed!");
		}else {
			System.out.println("The test case failed!");
		}
			
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
