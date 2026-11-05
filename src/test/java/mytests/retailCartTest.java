package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retailCartTest extends HomeTest{

	
	@Test(priority=1)
	
	public void retailCartTitleTest() {
		
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, "Your store of fun");
	}
	@Test(priority=2)
	public void retailURLTest() {
	String actURL=	driver.getCurrentUrl();
	System.out.println(actURL);
	Assert.assertTrue(actURL.contains("dmvtek"));
	}
	
}
