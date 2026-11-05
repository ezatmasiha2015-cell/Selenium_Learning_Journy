package Day_5_SeleniumConcepts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHadlingConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
	driver = new ChromeDriver();
	driver.get("https://www.selectorshub.com/xpath-practice-page/");
	try {
		Thread.sleep(2000);
	}catch(Exception e) {
	}
//	driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td//preceding-sibling::td/child::input[@type='checkbox']")).click();	
//	List<WebElement> Threepath=driver.findElements(By.xpath("//table[@class='table hover']/child::tbody/child::tr/child::td"));
//	System.out.println(Threepath.size());
//	for(WebElement e : Threepath) {
//		
//		String text=e.getText();
//		System.out.println(text +" ");
//	
//		
//	};
//	String JohSmith=driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td//following-sibling::td[text()='Admin']")).getText();
//	
//		System.out.println("JohSmith role is: "+JohSmith);
//		
//		String	SmithStatu=driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td//following-sibling::td[text()='Enabled']")).getText()	;
//		System.out.println("Smith Statu is: " +SmithStatu);
		

		selectUser("Garry.White");
		selectUser("Jasmine.Morgan");
		selectUser("Joe.Root");
		selectUser("John.Smith");
		selectUser("Jordan.Mathews");
		selectUser("Kevin.Mathews");
	
		
		
		
//		getUserinfo("John Smith");
		
}
	
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td//preceding-sibling::td/child::input[@type='checkbox']")).click();
		}
//	public static List<String> getUserinfo(String userName) {
//		List<WebElement> userInformation=driver.findElements(By.xpath("\"//a[text()='"+userName+"']/parent::td//following-sibling::td"));
//		List<String> eleText=new ArrayList<>();
//		
//		System.out.println(userInformation);
//		for (WebElement e : userInformation) {
//			String text=e.getText();
//			eleText.add(text);
//			System.out.println(text);
//		}
//		return eleText;
	
	
	
//	

//	
//	
//}
//
//public static void Click_Checkbox(String username) {
//	driver.findElement(By.xpath("//a[text() = '"+username+"']/parent::td//preceding-sibling::td/child::input[@type = 'checkbox']")).click();
	
	


}
