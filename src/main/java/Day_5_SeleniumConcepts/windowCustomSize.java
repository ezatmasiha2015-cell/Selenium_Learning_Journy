package Day_5_SeleniumConcepts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windowCustomSize {
	static WebDriver driver;
	public static void main(String[] args)  {
//		driver = new ChromeDriver();
//	Dimension dim= new Dimension(1080,800);
//	driver.manage().window().setSize(dim);
//	driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
//	Thread.sleep(3000);
			
//		driver.manage().window().setSize(new Dimension(800, 500));
//		driver.get("https://www.amazon.com/");
	
	driver = new ChromeDriver();
	Dimension dim= new Dimension(440,956);
	driver.manage().window().setSize(dim);
	driver.get("https://www.amazon.com/");
	Dimension actualDim=driver.manage().window().getSize();
	System.out.println("Actual width :" + actualDim.getWidth());
	System.out.println("Actual height :"+ actualDim.getHeight());
	
	if(actualDim.getWidth()<=440&& actualDim.getHeight()<=956){
		System.out.println("The test case is passed");
	}else {
		System.out.println("The test case is failed");
	}
//	
	
//		ChromeOptions options = new ChromeOptions();
//
//		Map<String, Object> deviceMetrics = new HashMap<>();
//		deviceMetrics.put("width", 440);
//		deviceMetrics.put("height", 956);
//		deviceMetrics.put("pixelRatio", 1.0);
//
//		Map<String, Object> mobileEmulation = new HashMap<>();
//		mobileEmulation.put("deviceMetrics", deviceMetrics);
//
//		options.setExperimentalOption("mobileEmulation", mobileEmulation);
//
//		WebDriver driver = new ChromeDriver(options);
//
//		driver.get("https://www.amazon.com/");
//		Dimension actualDim = driver.manage().window().getSize();
//
//		System.out.println("Actual width : " + actualDim.getWidth());
//		System.out.println("Actual height : " + actualDim.getHeight());
//
//		if (actualDim.getWidth() == 440 && actualDim.getHeight() == 956) {
//		    System.out.println("The test case is passed");
//		} else {
//		    System.out.println("The test case is failed");
		
	
	}
	

}
