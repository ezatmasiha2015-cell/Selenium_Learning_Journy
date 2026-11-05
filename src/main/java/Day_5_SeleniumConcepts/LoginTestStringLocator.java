package Day_5_SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestStringLocator {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		 driver=new ChromeDriver();
//		 driver.get("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
//		 driver.navigate().to("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		driver.navigate().to("https://qa.dmvtek.com/retail/index.php?route=account/login&language=en-gb");
		
		String emailid= "input-email";
		String password_id="input-password";
		String login_css="#form-login > div.text-end > button";
		String registerLink_linkText="Register";
		String newCustomer_tagText ="h2";
		
		ElementUtils elementUtil=new ElementUtils(driver);
		elementUtil.doSendkeys("id", emailid, "masiha@gmail.com");
		elementUtil.doSendkeys("id", password_id, "1234");
		elementUtil.doClick("css", login_css);
		
		String registerlinkText=elementUtil.doElementGetText("linkText", registerLink_linkText);
		System.out.println("Resgister link text is: " +registerlinkText);
		
	String newCustomerText=	elementUtil.doElementGetText("tag", newCustomer_tagText);
	System.out.println("The new customer text is: " +newCustomerText);
	}

}
