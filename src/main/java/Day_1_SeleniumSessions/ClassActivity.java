package Day_1_SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivity {
	
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
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		String pageTitle=driver.getTitle();
		System.out.println("The page title is: "+ pageTitle);
		
		if (pageTitle.equals("Target : Expect More. Pay Less.")) {
			System.out.println("Test case Passed");
		}else {
			System.out.println("Test case Failed");
		}
//		String pageUrl= driver.getCurrentUrl();
//		System.out.println("The page URL name is:" +pageUrl);
//		
//		if (pageUrl.contains("subscribe")) {
//			System.out.println(" The page url searched phrase passed");
//		}else {
//			System.out.println(" The page url searched phrase failed");
//		}
//		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
//		
//		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
