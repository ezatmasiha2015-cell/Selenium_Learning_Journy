package Day_5_SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenueHandle {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/pc/beverages/tea/green-tea/?nc=nb");
		By parenShopMenue=By.xpath("(//span[text()='Shop by'])[2]");
		By BeveragesSecondMenue=By.linkText("Beverages");
		By TeaThirdMenue=By.linkText("Tea");
		By GreenTeaFourthMenue=By.linkText("Green Tea");
		
//		Actions act=new Actions(driver);
//		
//		driver.findElement(parenShopMenue).click();
//		Thread.sleep(2000);
//		act.moveToElement(driver.findElement(BeveragesSecondMenue)).perform();
//		Thread.sleep(2000);
//		act.moveToElement(driver.findElement(TeaThirdMenue)).perform();
//		Thread.sleep(2000);
//		driver.findElement(GreenTeaFourthMenue).click();
//		
//		
//		
		
		BigBasketMenueSelection(parenShopMenue,BeveragesSecondMenue,TeaThirdMenue,GreenTeaFourthMenue);
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void BigBasketMenueSelection(By parentShopMenueLocator, By BeveragesSecondLocator, By TeaThirdLocator, By GreenTeaLocator) throws InterruptedException {
		Actions act=new Actions(driver);
		getElement(parentShopMenueLocator).click();
	act.moveToElement(getElement(BeveragesSecondLocator)).perform();
	Thread.sleep(2000);
	act.moveToElement(getElement(TeaThirdLocator)).perform();
	Thread.sleep(2000);
	getElement(GreenTeaLocator).click();
	
	}
	
	

}
