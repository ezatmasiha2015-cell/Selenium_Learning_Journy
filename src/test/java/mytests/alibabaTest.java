package mytests;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class alibabaTest extends HomeTest {

	@Test(priority = 1)

	public void alibabaTitleTest() {
	
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		Assert.assertTrue(driver.getTitle().contains("Alibaba.com"));
	
	}

	@Test(priority = 2)
	public void alibabaURLTest() {
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		Assert.assertTrue(actURL.contains("alibaba"));
	}

}
