package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AssignmentNonSelectDD {
	static WebDriver driver;

	public static void main(String[] args) {

//		driver = new ChromeDriver();
//		driver.navigate().to("https://jqueryui.com/selectmenu/");
	
		//Select a file
		
//		driver.switchTo().frame(0);
//		driver.findElement(By.cssSelector("span#files-button")).click();
//		
//		List<WebElement>ListOptions=driver.findElements(By.cssSelector("ul#files-menu>li"));
//		System.out.println("Total size of option lists are:" +ListOptions.size());
//		for (WebElement e : ListOptions) {
//			String text=e.getText();
//			
//			System.out.println(text);
//			if(text.contains("Some unknown file")) {
//				e.click();
//				break;
//			}
//			
//		}
		//Select a title
		
//		driver = new ChromeDriver();
//		driver.navigate().to("https://jqueryui.com/selectmenu/");
//		driver.switchTo().frame(0);
//		driver.findElement(By.cssSelector("span#salutation-button")).click();
//		List<WebElement>DropDownList=driver.findElements(By.cssSelector("ul#salutation-menu >li>div"));
//		System.out.println("The total size of drop down list are: "+DropDownList.size());
//		
//		for(WebElement a: DropDownList) {
//			String text=a.getText();
//			System.out.println(text);
//			
//		if (text.contains("Mrs.")) {
//			a.click();
//			break;
//		}
//			
			

		//Select a number
		
		
		driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/selectmenu/");
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("span#number-button")).click();
		try {
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			
		}
		
		List<WebElement>ListOptions=driver.findElements(By.cssSelector("ul#number-menu>li>div"));
		System.out.println("Total size of option lists are:" +ListOptions.size());
		
		for(int i=0; i<=ListOptions.size(); i++) {
		WebElement e=ListOptions.get(i);
		System.out.println(e.getText());
		if(e.getText().equals("15")) {
			e.click();
			break;
		}
			
		}
			}

			


		
		
		
		
		
	
	

}
