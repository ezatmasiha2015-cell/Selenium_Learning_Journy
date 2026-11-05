package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;





public class SelectDropDownConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://orangehrm.com/contact-sales");
		By country=By.cssSelector("select#Form_getForm_Country");
		
//		WebElement countrySelection=driver.findElement(country);
//		Select select=new Select(countrySelection);
//		select.selectByContainsVisibleText("Afghanistan");
//		Thread.sleep(2000);
//		select.selectByIndex(9);
//		Thread.sleep(2000);
//		select.selectByValue("Indonesia");
//		Thread.sleep(2000);
//		select.selectByContainsVisibleText("Hong");
//		Thread.sleep(2000);
	
		
		doSelectDropDownByIndex(country, 9);
		doSelectDropDownByValue(country, "Iceland");
		doSelectDropDownByVisibleText(country, "Japan");
		doSelectDropDownByContainsVisibleText(country, "Kyr");
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	public static void doSelectDropDownByValue(By locator, String Value) {
		Select select=new Select(getElement(locator));
		select.selectByValue(Value);
	}
	public static void doSelectDropDownByVisibleText(By locator, String visibleText) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
		
	}
	public static void doSelectDropDownByContainsVisibleText(By locator, String partialText) {
		Select select=new Select(getElement(locator));
		select.selectByContainsVisibleText(partialText);
	}
}
