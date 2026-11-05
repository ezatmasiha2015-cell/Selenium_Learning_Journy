package Day_5_SeleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExcutorConcepts {
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		
//		String pageTitle=js.executeScript("return document.title").toString();
//		System.out.println(pageTitle);
//		
//		String pageURL=js.executeScript("return document.URL").toString();
//		System.out.println(pageURL);
		
		
		
		getPagetitleWithJF();
		getPageURLwithJS();
		
		
		
		
		
		
		
		
		
	}
	public static String getPagetitleWithJF() {
		JavascriptExecutor js= (JavascriptExecutor)driver;
	
		String pageTitle=js.executeScript("return document.title").toString();
		System.out.println(pageTitle);
		return pageTitle;
		
	}
	public static String getPageURLwithJS() {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String pageURL=js.executeScript("return document.URL").toString();
		System.out.println(pageURL);
		return pageURL;
	}

}
