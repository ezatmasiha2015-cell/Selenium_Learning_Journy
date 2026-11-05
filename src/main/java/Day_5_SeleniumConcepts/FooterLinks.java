package Day_5_SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		
		
		By links = By.xpath("//footer//a");
		List<WebElement> linkslist =driver.findElements(links);
		System.out.println(linkslist.size());
		for (WebElement e : linkslist) {
		String text= e.getText();
		System.out.println(text);
		
		}
		System.out.println("\n**************************************************\n");
		
		for ( int i = 0; i<linkslist.size(); i ++) {
		String text=linkslist.get(i).getText();
		System.out.println(i +"-------"+ text);
		}
		
	}
	
	

}
