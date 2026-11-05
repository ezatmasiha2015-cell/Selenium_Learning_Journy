package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopup {
	static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
//		driver=new FirefoxDriver();
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		Thread.sleep(2000);
		String userName="admin";
		String password="admin";
		driver.get("https://"+userName+":"+password+ "@"+"the-internet.herokuapp.com/basic_auth");
		
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		String pageURL=driver.getCurrentUrl();
		System.out.println(pageURL);
		
		String heading=driver.findElement(By.xpath("//h3")).getText();
		if(heading.equals("Basic Auth")) {
			System.out.println("Credentials are correct. Login successful");			
		}else {
			System.out.println("Credentials are incoreect. Login unsuccessful");
		}
		
		
		
		
		
	}
}
