package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownHandle2 {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		
		By dropD=By.cssSelector("input#justAnInputBox");
		By listOption = By.cssSelector("div#comboTree568644DropDownContainer >ul span.comboTreeItemTitle");
//		By listOption=By.cssSelector("ul span.comboTreeItemTitle");
		driver.findElement(dropD).click();
		Thread.sleep(2000);
		
		List<WebElement>OptionList=driver.findElements(listOption);
		System.out.println("The total size are: " + OptionList.size());
		for(WebElement e: OptionList) {
			
//			e.click();
			String text=e.getText();
			System.out.println(text);
		}
		
		
		
		
	}

}
