package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElementConcept {
     static WebDriver driver;
     
	public static void main(String[] args) {
	    driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By username = By.name("username");
		By forgotPwd = By.linkText("Forgot Password?");
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement username_ele=wait.until(ExpectedConditions.presenceOfElementLocated(username));
//		username_ele.sendKeys("test@gmail.com");
//		
//		WebElement forgot_pwd_ele=wait.until(ExpectedConditions.presenceOfElementLocated(forgotPwd));
//		forgot_pwd_ele.click();
//		waitForElementPresenece(username, 10).sendKeys("tom@gmail.com");
//		waitForElementPresenece(forgotPwd, 5).click();
		
		waitForElementVisible(username, 10).sendKeys("test@gmail.com");
		
		
		
	}
	
	/*
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible
	 */
	public static WebElement waitForElementPresenece(By locator, int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	/*
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 */

	public static WebElement waitForElementVisible(By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	

}
