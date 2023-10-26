package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {
	
	@Test
	public void searchTest()
	{
		String name="macbook";
		Assert.assertEquals(name, "macbook123");
	}
	
	@Test
	public void sumTest()
	{
		int a= 10;
		int b= 20;
		int sum=a+b;
		Assert.assertEquals(sum, 30);
	}
	@Test
	public void nameTest()
	{
		String userName="test";
		Assert.assertNotNull(userName);
	}
	
	@Test
	public void isElementDisplayed()
	{
		String loginBtn="loginAmazonButton";
		Assert.assertTrue(loginBtn.contains("loginAmazon"));
	}
	
	@Test
	public void isUserActive()
	{
		boolean inactiveFlag=false;
		Assert.assertTrue(inactiveFlag);
	}

}
