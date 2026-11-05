package Day_5_SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPoup {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.navigate().to("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(2000);
		
	}

}
