package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
//	BS--------db connection
//	BT--------create user
//	BC-----openBrowser
	
	
//	BM-----loginToApp
//	test --- addToCartTest
//	AM --- logout
	
	
	
//	BM-----loginToApp
//	test --- payment Test
//	AM --- logout
	
	
	
//	BM-----loginToApp
//	test -- search test
//	AM --- logout
	
	
	
//	AC --- close browser
//	AT --- deleteUser
//	PASSED: testngsessions.TestNGFeatures.searchTest
//	PASSED: testngsessions.TestNGFeatures.paymentTest
//	PASSED: testngsessions.TestNGFeatures.addToCartTest
//	AS --- closeDBConnection

	
	//1
	@BeforeSuite
	public void DBConnection()
	{
		System.out.println("BS--------db connection");
	}
	//2
	@BeforeTest
	public void createUser()
	{
		System.out.println("BT--------create user");	
	}
	//3
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("BC-----openBrowser");
	}
	//4 //7 //10
    @BeforeMethod
    public void loginToApp()
    {
    	System.out.println("BM-----loginToApp");
    }
    //11
    @Test
    public void searchTest()
    {
    	System.out.println("test -- search test");
    }
    //5
    @Test
    public void addToCartTest()
    {
    	System.out.println("test --- addToCartTest");
    }
    //8
    @Test
    public void paymentTest()
    {
    	System.out.println("test --- payment Test");
    }
    //6 //9 //12
    @AfterMethod
    public void logout()
    {
    	System.out.println("AM --- logout");
    }
    //13
    @AfterClass
    public void closeBrowser()
    {
    	System.out.println("AC --- close browser");
    }
    //14
    @AfterTest
    public void deleteUser()
    {
    	System.out.println("AT --- deleteUser");
    }
    //15
    @AfterSuite
    public void closeDBConnection()
    {
    	System.out.println("AS --- closeDBConnection ");
    }
    
    
}
