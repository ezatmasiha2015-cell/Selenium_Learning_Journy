package Day_1_SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriveBasics {
//	driver.close();
	
//	driver.quit();
//	  Assignment
//	    1: Open the browser using
//	    	Chrome
//	    	Firefox
//	    	Edge
//	    	Safari
//	    2: Enter the URL
//	    3: Capture and print the title in the console
//	    4: Verify/assert the title -- if condition
//	    5: Close the browser

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String pageTitle=driver.getTitle();
		System.out.println("1 :Tested on ChromeDriver");
		System.out.println("The page title is: " + pageTitle);
		
		
		if (pageTitle.contains("Youtube")) {
		System.out.println("Test case : passed!");
		
		} else {
			System.out.println("Test case : Failed!");
		}
		
//
//		FirefoxDriver driver1 = new FirefoxDriver ();
//		driver1.get("https://www.amazon.com/");
//		
//		String pageTitleFirefox=driver1.getTitle();
//		
//		System.out.println("2 :Tested on the FirefoxDriver");
//		System.out.println("The page title is : " + pageTitleFirefox);
//		
//		if (pageTitleFirefox.equals("amazon.com")) {
//		System.out.println("The test case : passed!");
//		
//		} else {
//			System.out.println(" The test case :Failed!");
//			
//		}
////		driver1.close();
//		
		
//		EdgeDriver edgedriver= new EdgeDriver();
//		
//		edgedriver.get("https://www.google.com/");
//		String pageTitleEdge= edgedriver.getTitle();
//		System.out.println("3 : Tested on the EdgeDriver!");
//		System.out.println("The page title is :"+ pageTitleEdge );
//		
//		if (pageTitleEdge.equals("Google")) {
//			System.out.println("Test case : passed!");
//		}else {
//			System.out.println("Test case : Failed");
//		}
////		
////		edgedriver.close();
//		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
