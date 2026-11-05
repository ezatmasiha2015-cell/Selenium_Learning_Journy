package TestNG;

import org.testng.annotations.Test;

public class InvocationCountConcepts {
/*
 invocationCount property/attribute
 1: Execute the same test multiple times 
 2: Syntax:
 @Test(invocationCount=x)
 3: Default of test case execution : 1
  
 */
	@Test(invocationCount=20)
	public void testMethodTest() {
		System.out.println("I am running multiple times this test...");
	}
}
