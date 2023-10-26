package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// Create a web element + perform the action

		// 1st:
		// driver.findElement(By.id("input-email")).sendKeys("pawan@gmail.com");
		// driver.findElement(By.id("input-password")).sendKeys("pawan@123");
		// driver.findElement(By.id("input-email")).sendKeys("pawan@gmail.com");

		// 2nd:
		// WebElement emailID=driver.findElement(By.id("input-email"));
		// WebElement password=driver.findElement(By.id("input-password"));

		// emailID.sendKeys("pawan@gmail.com");
		// password.sendKeys("pawan@123");

		// 3rd:By Locator
		// By email=By.id("input-email");
		// By pwd=By.id("input-password");

		// WebElement emailId=driver.findElement(email);
		// WebElement password=driver.findElement(pwd);

		// emailId.sendKeys("pawan@gmail.com");
		// password.sendKeys("pawan@123");

		// 4th:By locator and create a generic function to create a web element
		/*
		 * By email = By.id("input-email"); By pwd = By.id("input-password");
		 * 
		 * WebElement emailId = getElement(email); WebElement password =
		 * getElement(pwd);
		 * 
		 * emailId.sendKeys("pawan@gmail.com"); password.sendKeys("test@123");
		 */
		
		//5th: By locator and create a generic function for web element and actions
		//By email=By.id("input-email");
		//By pwd=By.id("input-password");
		//doSendKeys(email, "pawan@gmail.com");
		//doSendKeys(pwd, "pawan@123");
		
		//6th:By locator and create a generic function for web element and actions in util class 
		
		By email=By.id("input-email");
		By pwd=By.id("input-password");
		
		ElementUtil eleUtil= new ElementUtil(driver);
		eleUtil.doSendKeys(email, "pawan@gmail.com");
		eleUtil.doSendKeys(pwd, "Pawan@123");
		
		
	}
	
	
}
