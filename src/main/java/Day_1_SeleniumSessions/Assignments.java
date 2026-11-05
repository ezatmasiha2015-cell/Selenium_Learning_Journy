package Day_1_SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignments {

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
	
	public static void main(String[]args) {
		
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.com/");
//		String ChromeTitle=driver.getTitle();
//		System.out.println(" The title of webepage is: " +ChromeTitle);
//		if (ChromeTitle.equals("Amazon.com. Spend less. Smile more.")){
//			System.out.println("The test case is :passed");
//		}else {
//			System.out.println("The test case is: failed");
//		}
//		driver.close();
//	ChromeDriver driver1= new ChromeDriver();
//	
//	driver1.get("https://www.toyota.com/");
//	String toyotaTitle =driver1.getTitle();
//	System.out.println("The title of Toyota page is:" +toyotaTitle);
//	
//	if (toyotaTitle.equals("New Cars, Trucks, SUVs & Hybrids | Toyota Official Site")) {
//		System.out.println("The test case is : Passed");
//		
//	}else {
//		System.out.println("The test case is : Failed");
//	}
//				
//	driver1.close();	
		EdgeDriver driver2 = new EdgeDriver();
		driver2.get("https://www.amazon.com/");
		String amazonTitle = driver2.getTitle();
		
		System.out.println("The web page title is :" +amazonTitle);
		
		if (amazonTitle.equals("Amazon.com. Spend less. Smile more.")) {
			System.out.println("The test case is : Passed");
		}else {
			System.out.println("The test case is : Failed");
		}
//		
//		driver2.close();
//		
		
//		//1:
//	WebDriver driver	=new ChromeDriver();
//	
//		driver.getTitle();
//		//2
//		
////		 WebDriver driver1=new RemoteWebDriver();
//		 
//		
//		 WebDriver driver3=new FirefoxDriver();
//	
//	SearchContext driver4=	new EdgeDriver();
		
			
		
		
		
		
		
		
		
		
		
		
	}
}
