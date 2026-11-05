package Day_1_SeleniumSessions;

public class UtileBayTesting {
	
	
	
	
	public static void main(String[] args) {
		
		UtilHomeWork test = new UtilHomeWork ();
		test.LaunchBrowser("chrome");
		test.launchUrl("https://www.ebay.com/");

		String pageTitle=test.getPageTitle();
		if (pageTitle.equals("Electronics, Cars, Fashion, Collectibles & More | eBay")) {
			System.out.println("The test case is : Passed");
		}else {
			System.out.println("The test case is : Failed");
		}
		test.getPageSource("container");
		String pageUrl=test.getPageUrl();
		if (pageUrl.contains("ebay")) {
			System.out.println(" The pageUrl is passed");
		}else {
			System.out.println("The pageUrl is failed");
		}
		test.closeBrowser();
		
		
	}

}
