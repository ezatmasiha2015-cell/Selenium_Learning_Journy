package Day_1_SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeURL {
	public static void main(String[] args) {
		
		
		ChromeDriver drive =new ChromeDriver();
		
		drive.get("https://www.alibaba.com/");
		String AlibbTitle=drive.getTitle();
		System.out.println("The tile name of page is: " +AlibbTitle);
		
		if (AlibbTitle.equals("Alibaba")) {
			System.out.println("The test case is: passed");
			
		}else {
			System.out.println("The test case is: failed");
		}
		
		
		
		
		
	}

}
