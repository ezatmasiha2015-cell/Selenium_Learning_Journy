package Day_5_SeleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomConcepts {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.body.style.zoom='10%'");
////	    js.executeScript("document.body.style.zoom='100%'");
//	    String currentZoom = (String) js.executeScript("return document.body.style.zoom;");
//	    System.out.println("the curren zoom is: "+ currentZoom);
//	    if(currentZoom.equals("100%")) {
//	    	System.out.println("The test case is passed");
//	    }else {
//	    	System.out.println("The test case is failed");
//	    }
	
		zoomINwihtUtil("100%");
		
	}
	public static void zoomINwihtUtil(String zoomPercentage) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='"+zoomPercentage+"'");
	    String currentZoom = (String) js.executeScript("return document.body.style.zoom;");
	    System.out.println("the curren zoom is: "+ currentZoom);
	    if(currentZoom.equals(currentZoom)) {
	    	System.out.println("The test case is passed");
	    }else {
	    	System.out.println("The test case is failed");
	    }
	
	}

}
