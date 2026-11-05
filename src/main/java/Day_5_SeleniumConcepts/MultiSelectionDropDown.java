package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultiSelectionDropDown {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		By MultiSection = By.cssSelector("select[size=\"6\"]");
		By optionLocator=By.xpath("//select/child::option");
//		WebElement DropDownMultiSelection=driver.findElement(MultiSection);
//		Select select= new Select(DropDownMultiSelection);
//		if (select.isMultiple()) {
//			System.out.println("It is a multiple selection drop down: the case is Passed!");
//		}else {
//			System.out.println("It is not a multiple selection drop down : the case is Failed!");
//		}
//		select.selectByValue("Greater");
//		select.selectByVisibleText("James's flamingo");
//		select.selectByContainsVisibleText("And");
//		select.selectByIndex(0);
//		
//		
//		List<WebElement> AllSelectedOption=select.getAllSelectedOptions();
//		System.out.println(AllSelectedOption .size());
//		
//		for(WebElement e :AllSelectedOption) {
//			String text=e.getText();
//			System.out.println(text);

//		}
//		select.deselectAll();
		boolean multiDropDownOption = isMultiSelectionDropDown(MultiSection);
		System.out.println(multiDropDownOption);
		
//		selectDropDownMultiValue(MultiSection,"Andean flamingo", "James's flamingo", "Greater flamingo", "Lesser flamingo");
//		selectDropDownMultiValue(MultiSection,"American flamingo", "Andean flamingo","James's flamingo","Greater flamingo","Lesser flamingo","Chilean flamingo");
//		selectDropDownMultipleValues(MultiSection, "all");
		// All selection elements approach
		selectDropDownMultipleValues(MultiSection, optionLocator, "all");
		// muliti-selection elements approach
		selectDropDownMultipleValues(MultiSection, optionLocator, "James's flamingo","Andean flamingo","American flamingo");
		
		//single selection element approach
		selectDropDownMultipleValues(MultiSection, optionLocator, "Amearican flamingo");
		
	}


	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean isMultiSelectionDropDown(By locator) {
		Select select = new Select(getElement(locator));
		return select.isMultiple() ? true : false;

	}
//	public static void selectDropDownMultiValue( By locator, String V1, String V2, String V3, String V4 ) {
//		Select select = new Select (getElement(locator));
//		if (isMultiSelectionDropDown (locator)) {
//			select.selectByVisibleText(V1);
//			select.selectByVisibleText(V2);
//			select.selectByVisibleText(V3);
//			select.selectByVisibleText(V4);
//		List<WebElement> DropDownSelectedText=select.getAllSelectedOptions();
//		System.out.println(DropDownSelectedText.size());
//		for (WebElement e : DropDownSelectedText) {
//			String text=e.getText();
//			System.out.println(text);
	
		
		
	
	public static void selectDropDownMultiValue(By locator, String... values) {
		Select select = new Select(getElement(locator));
		if (isMultiSelectionDropDown (locator)) {
			if(values [0].equalsIgnoreCase(null))
			for(String e: values) {
				select.selectByVisibleText(e);
			}	
		}
	
	}
	/**
	 * This method is used to select the values from the select multiple drop down. It can select;
	 * 1: Single option
	 * 2: Multiple options
	 * 3: All the the options--pass "all" as the value to select all the drop down options
	 * @author Masiha
	 * @param optionLocator
	 * @param values
	 */
	public static void selectDropDownMultipleValues(By locator, By optionLocator, String...values) {
		Select select = new Select(getElement(locator));
		if (isMultiSelectionDropDown(locator)) {
			if(values [0].equalsIgnoreCase("all")){
//				List<WebElement> optionList=driver.findElements(By.cssSelector("select[size=\"6\"]>option"));
				List<WebElement> optionList=driver.findElements(optionLocator);
				for (WebElement e: optionList) {
					e.click();
				}
			}else {
				for(String e: values) {
				select.selectByVisibleText(e);
			}
			
		}
	}
	
	
	}
	
	
}
