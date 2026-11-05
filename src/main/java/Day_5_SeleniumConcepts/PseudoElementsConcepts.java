package Day_5_SeleniumConcepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementsConcepts {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://qa.dmvtek.com/retail/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		String name= "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String star=js.executeScript(name).toString();
		System.out.println(star);
		if (star.contains("*")) {
			System.out.println("The content test case of(First Name)  is passed");
		}else {
			System.out.println("The test case is failed");

		}
		//*FirstName
		
		String name2= "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('color')";
		String color=js.executeScript(name2).toString();
		System.out.println(color);
		
		if (name2.contains("color")) {
			System.out.println("The test color of the (First NAme) is passed");
		}else{
			System.out.println("The color test is failed");
			
		}
		String name3="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('font-weight')";	
		String font=js.executeScript(name3).toString();
		System.out.println(font);
		
		if(name3.contains("font")) {
			System.out.println("The font test case of (First Name) is passed");
		}else {
			System.out.println("The font test case is failed");
		}
		//*lastName
		
		String LastName="return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('content')";
		String LastNameContent=js.executeScript(LastName).toString();
		System.out.println(LastNameContent);
		if(LastNameContent.contains(LastNameContent)) {
			System.out.println("The content test case of (Last Name)is passed");
		}else {
			System.out.println("The content test case is failed");
		}
		
		
		String LastNameColor="return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('color')";
		String colorName=js.executeScript(LastNameColor).toString();
		System.out.println(colorName);
		if(colorName.contains("rgb(255, 0, 0)")) {
			System.out.println("The color test case of (Last Name)is passed");
			
		}else {
			System.out.println("The color test is failed");
		}
		
		String LastNameFont="return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('font-weight')";
		String LastNameFt=js.executeScript(LastNameFont).toString();
		System.out.println(LastNameFt);
		if (LastNameFt.contains(LastNameFt)) {
			System.out.println("The font test case of ( Last Name) is passed");
		}else {
			System.out.println("The font test case is failed");
		}
		
		//*email
		String EmailPath= "return window.getComputedStyle(document.querySelector(\"label[for='input-email']\"),'::before').getPropertyValue('content')";
		String emailContent=js.executeScript(EmailPath).toString();
		System.out.println(emailContent);
		if (emailContent.contains("*")) {
			System.out.println("The content test case of (Email) is passed");
		}else {
			System.out.println("The content test case of (Email) is failed");
		}
		
		String EmailPath2="return window.getComputedStyle(document.querySelector(\"label[for='input-email']\"),'::before').getPropertyValue('color')";
		String emailColor=js.executeScript(EmailPath2).toString();
		System.out.println(emailColor);
		if (emailColor.contains("rgb(255, 0, 0)")) {
			System.out.println("The color test case of (Email) is passed");
		}else {
			System.out.println("The color test case of (Email) is failed");
		}
		
		String EmailPath3="return window.getComputedStyle(document.querySelector(\"label[for='input-email']\"),'::before').getPropertyValue('font-weight')";
		String emailFont=js.executeScript(EmailPath3).toString();
		System.out.println(emailFont);
		if(emailFont.contains("700")) {
			System.out.println("The font test case of (Email) is passed");
		}else {
			System.out.println("The font test case of (Email) is failed");
		}
		//password
		String PasswordPath="return window.getComputedStyle(document.querySelector(\"label[for='input-password']\"),'::before').getPropertyValue('content')";
		String PasswordContent=js.executeScript(PasswordPath).toString();
		System.out.println(PasswordContent);
		if(PasswordContent.contains("*")) {
			System.out.println("The content test case of the (Password) is passed");
		}else {
			System.out.println("The content test case of the (Password) is failed");
		}
		
		String PasswordP2="return window.getComputedStyle(document.querySelector(\"label[for='input-password']\"),'::before').getPropertyValue('color')";
		String PasColor=js.executeScript(PasswordP2).toString();
		System.out.println(PasColor);
		if(PasColor.contains("rgb")) {
			System.out.println("The color test case of the (Password) is passed");
		}else {
			System.out.println("The color test case of the (Password) is failed");
		}
		
		String PasswordP3="return window.getComputedStyle(document.querySelector(\"label[for='input-password']\"),'::before').getPropertyValue('font-weight')";
		String PasFont=js.executeScript(PasswordP3).toString();
		System.out.println(PasFont);
		if(PasFont.contains("700")) {
			System.out.println("The font test case of the (Password) is passed");
		}else {
			System.out.println("The font test case of the (Password) is failed");
		}
		driver.close();
		
		
		
		//first-name
		//window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('content')
		//window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('color')		
		//window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('font-weight')
		//last-name
		//window.getComputedStyle(document.querySelector("label[for='input-lastname']"),'::before').getPropertyValue('content')
		//window.getComputedStyle(document.querySelector("label[for='input-lastname']"),'::before').getPropertyValue('color')
		//window.getComputedStyle(document.querySelector("label[for='input-lastname']"),'::before').getPropertyValue('font-weight')
		//Email
		//window.getComputedStyle(document.querySelector("label[for='input-email']"),'::before').getPropertyValue('content')
		//window.getComputedStyle(document.querySelector("label[for='input-email']"),'::before').getPropertyValue('color')
		//window.getComputedStyle(document.querySelector("label[for='input-email']"),'::before').getPropertyValue('font-weight')
		//Password
		//window.getComputedStyle(document.querySelector("label[for='input-password']"),'::before').getPropertyValue('content')
		//window.getComputedStyle(document.querySelector("label[for='input-password']"),'::before').getPropertyValue('color')
		//window.getComputedStyle(document.querySelector("label[for='input-password']"),'::before').getPropertyValue('font-weight')
	}
	

}
