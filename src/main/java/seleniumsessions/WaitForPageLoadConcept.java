package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForPageLoadConcept {
    static WebDriver driver;
      public static boolean isPageLoaded()
      {
    	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	 String flag=wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == \'complete\'")).toString();
    	 return Boolean.parseBoolean(flag); 
      }
    
    public static void waitForPageLoad(int timeout)
    {
    	long endTime=System.currentTimeMillis() + timeout;
    	while(System.currentTimeMillis() < endTime)
    	{
    		JavascriptExecutor js =(JavascriptExecutor)driver;
    		String pageState=js.executeScript("return document.readyState").toString();
    		if(pageState.equals("complete"))
    		{
    			System.out.println("PAGE DOM is fully loaded now.... ");
    			break;
    		}
    		else
    		{
    			System.out.println("PAGE is not loaded....." + pageState);
    		}
    	}
    	
    }
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//waitForPageLoad(5);
//		driver.findElement(By.linkText("Sign Up")).click();
//		waitForPageLoad(10);
		
		if(isPageLoaded())
		{
			System.out.println("page is fully loaded and ready to interact.");
		}
		
		
		
		

		
	}

}
