package Day_5_SeleniumConcepts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Non_SelectDropDown {
	/*	Non-Selected DD
	  1. DD that is not built with <Select> HTML tag.
	  2. You cannot use the Select class methods to handle this DD.
	  3. AKA. jQuery DD.
	  4. Built; with UL, li, span and DIV.
	Handle them?
	1. Click on them expand them
	2. Use findElement()-- iterate on them
	3. specific option -- click on that
	4. allays with for the items to appear
	  
	 */
		static WebDriver driver;
		public static void main(String[]args) {
			
			driver=new ChromeDriver();
			driver.get("https://jqueryui.com/selectmenu/");
		driver.switchTo().frame(0);
			driver.findElement(By.cssSelector("span#speed-button")).click();
		List <WebElement>optionList=driver.findElements(By.cssSelector("ul#speed-menu>li>div"));
		System.out.println("the total size number of the non-selected options are: " +optionList.size());
		
		for(WebElement e: optionList) {
			String text=e.getText();
			System.out.println(text);
			if(text.contains("Faster")) {
				e.click();
				break;
			}
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
