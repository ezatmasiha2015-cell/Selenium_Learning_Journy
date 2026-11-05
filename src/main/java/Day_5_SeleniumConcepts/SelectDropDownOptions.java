package Day_5_SeleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;



public class SelectDropDownOptions {
	/*
	 * 1. launch the browser 
	 * 2. navigate to (enter the URL) :https://orangehrm.com/contact-sales 
	 * 3. create the By locator for the select tag. 
	 * 4. Find out how many options or <options> tags there are (Here, we are
	 * not selecting any values of the dropdown). 
	 * 5. Also print each and every option to the console except Pakistan. 
	 * 6. Select a specific value from the
	 * dropDown without using the select class's available method like Afghanistan
	 * or any country. 
	 * 7. Close the Driver. 
	 * Create the following utility method. 
	 * A utility method that will print size, options text, and click on a predefined/selected options. 
	 * a utility method that will return the available
	 * options in a select tag, no clicking or not selecting a specific country. and
	 * only return the text of these options. a utility method that return the count
	 * of the dropdown options. Move all these utilities into the ElementUtil class.
	 * 
	 * 
	 */
	static  WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.navigate().to("https://orangehrm.com/contact-sales");
		By country= By.cssSelector("select#Form_getForm_Country");
		
//		WebElement optionsList=driver.findElement(country);
//		Select select=new Select(optionsList);
//		
//		List<WebElement> countryList=select.getOptions();
//		System.out.println("The total number of country list are: "+ countryList.size());
//		for (WebElement e: countryList) {
//			String text=e.getText();
//		if (text.contains("Pakistan")) {
//			continue;
//		}
//			System.out.println(text);
//			if (text.equals("Afghanistan")) {
//				e.click();
//				break;
//			}
//			driver.close();
			
//		}
	
//		getDropDownOption(country, "Afghanistan");
//	List<String>allOptions=	getDropDownOption(country);
//	System.out.println(allOptions);
//	if (allOptions.contains("Canada")) {
//	System.out.println("the test case passed");	
//	}else {
//		System.out.println("the test case failed");
//	}
int dropDownCount=getDropDownCountryCount(country)-1;
System.out.println(dropDownCount);
	if(dropDownCount==232) {
		System.out.println("the test case is: Passed");
	}else {
		System.out.println("the test case is: Failed");
	}
	

				
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void getDropDownOption(By locator, String dropDownValue) {
		Select select=new Select(getElement(locator));
		List<WebElement> optionsList=select.getOptions();
		System.out.println("The total number options are: "+optionsList.size());
		for (WebElement e: optionsList) {
			String text= e.getText();
			System.out.println(text);
			if (text.equals(dropDownValue)) {
				e.click();
				break;
				
			}
			
		}
	}
	public static List<String> getDropDownOption(By locator) {
		Select select=new Select(getElement(locator));
	List<WebElement>optionsList=select.getOptions();
	List<String> optionsTextList=new ArrayList<>();
	for(WebElement e : optionsList) {
		String text = e.getText();
		optionsTextList.add(text);
	}
	return optionsTextList;
	}
	public static int getDropDownCountryCount(By locator) {
		Select select=new Select(getElement(locator));
		return select.getOptions().size();
	}
}

	
