package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class googleTest extends HomeTest {

	
	@Test(priority=1)
	
	public void googleTitleTest() {
		
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, "Google");
	}
	@Test(priority=2)
	
	public void googleURLTest() {
	String actURL=	driver.getCurrentUrl();
	System.out.println(actURL);
	Assert.assertTrue(actURL.contains("google"));
	}

}
