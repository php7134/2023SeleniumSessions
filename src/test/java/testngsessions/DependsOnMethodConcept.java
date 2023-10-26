package testngsessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	@Test
	public void homePageTest()
	{
		System.out.println("homePageTest");
		int i=9/0;
	}
	
	@Test(dependsOnMethods = "homePageTest")
	public void searchTest()
	{
		System.out.println("searchTest");
	}

	@Test(dependsOnMethods = "searchTest")
	public void cartTest()
	{
		System.out.println("cartTest");
	}

}
