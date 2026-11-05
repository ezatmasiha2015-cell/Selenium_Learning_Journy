package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodConcepts {
	
	@Test
	public void loginTest() {
		System.out.println("loging into an application");
//		int i=9/0;
		Assert.fail("Failing to see how the dependsOnMethods attribute works");
		
	}
	
	@Test (dependsOnMethods= "loginTest")
	
	public void searchHomePageTest() {
		System.out.println("Search Test");
	}
	@Test(dependsOnMethods= "searchHomePageTest")
	public void addToCartTest() {
		System.out.println("Adding the items into the cart.");
	}

}
