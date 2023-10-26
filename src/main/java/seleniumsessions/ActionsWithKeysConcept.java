package seleniumsessions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithKeysConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
//		
//		  driver.get(
//		  "https://naveenautomationlabs.com/opencart/index.php?route=account/register")
//		  ;
//		  
//		  By firstName = By.id("input-firstname"); Actions act = new Actions(driver);
//		  act.sendKeys(driver.findElement(firstName), "Duck") .sendKeys(Keys.TAB)
//		  .pause(1000) .sendKeys("Keerk") .pause(1000) .sendKeys(Keys.TAB) .pause(1000)
//		  .sendKeys("duck@gmail.com") .pause(1000) .sendKeys(Keys.TAB) .pause(1000)
//		  .sendKeys("9895789659") .pause(1000) .sendKeys(Keys.TAB) .pause(1000)
//		  .sendKeys("test@123") .pause(1000) .sendKeys(Keys.TAB) .pause(1000)
//		  .sendKeys("test@123") .pause(1000) .sendKeys(Keys.TAB) .pause(1000)
//		  .sendKeys(Keys.TAB) .pause(1000) .sendKeys(Keys.TAB) .pause(1000) .click()
//		  .pause(1000) .sendKeys(Keys.TAB) .pause(1000) .sendKeys(Keys.ENTER)
//		  .pause(1000) .build().perform();
		 
		
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB)
		   .pause(1000)
		   .sendKeys(Keys.TAB)
		   .pause(1000)
		   .sendKeys(Keys.TAB)
		   .pause(1000)
		   .sendKeys(Keys.TAB)
		   .pause(1000)
		   .sendKeys(Keys.TAB)
		   .pause(1000)
		   .sendKeys("Macbook")
		   .sendKeys(Keys.ENTER);
	}

}
