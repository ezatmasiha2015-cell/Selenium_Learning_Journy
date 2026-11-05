package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest {
	
	
	// sum(): feature-- method/function-- API(GET POST)--webservice
	
	public int sum(int a , int b) {
		return a+b;
	}
	 //Unit Testing + Assertion -- Developer
	// White box testing
	
	@Test
	
	public void test() {
		Assert.assertEquals(sum(119, 1), 120);
		Assert.assertEquals(sum(150,10), 160);
	}
	@Test
	public void test1() {
		Assert.assertEquals(sum(10, -90), -80);
	}
	@Test
	public void test2() {
		Assert.assertEquals(sum(119,0), 119);
	}
	@Test
	public void test3() {
		Assert.assertEquals(sum(0, 0), 0);
	}
	@Test
	public void test4() {
		Assert.assertEquals(sum(-119, -1), -120);
	}
}
