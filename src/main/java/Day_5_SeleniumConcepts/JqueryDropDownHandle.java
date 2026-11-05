package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		By locator = By.cssSelector("input#justAnInputBox");
		By OptionList = By.cssSelector("ul span.comboTreeItemTitle");
		
		// Assignment
		// https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette
		// Create Reusable method for the followings
			// > How to select a single choice
			// > How to select Multiple choice
			// > How to select all
		//For all options selection
		
//		jqueryDropDownSelection(locator, OptionList, "all");
		
		//For Single Selection
//		jqueryDropDownSelection(locator, OptionList, "choice 1");
		//For Multi-selection options
		jqueryDropDownSelection(locator, OptionList, "choice 1", "choice 5", "choice 7");

	}


	

// jquery Drop Down single, multiple, and all selections Utility Method

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void jqueryDropDownSelection(By locator, By OptionListLocator, String... values) {
		getElement(locator).click();

		List<WebElement> optionsList = driver.findElements(OptionListLocator);
		for (WebElement allOptions : optionsList) {
			String printOptions = allOptions.getText();
			if(printOptions.length()!= 0) {
			System.out.println(printOptions);
			if (values[0].equals("all")) {
				allOptions.click();
			} else {
		            for (String val : values) {
		                if (printOptions.equals(val)) {
		                	allOptions.click();
		                    break;
				}
//				driver.close();
		            }

		            }
			}
}
}
}