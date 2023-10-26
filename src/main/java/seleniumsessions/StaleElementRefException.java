package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefException {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emaiId=By.id("input-email");
		
		ElementUtil elUtil=new ElementUtil(driver);
		elUtil.doSendKeys(emaiId, "test@gmail.com");
		driver.navigate().refresh();
		elUtil.doSendKeys(emaiId, "test@gmail.com");
		
		
		
		
		//WebElement ele=driver.findElement(By.id("input-email"));
		//ele.sendKeys("test@gmail.com");
		//driver.navigate().refresh();
		//ele=driver.findElement(By.id("input-email"));
		//ele.sendKeys("test123@gmail.com");
		
		// org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found 
		
		
	}

}
