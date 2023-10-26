package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptClickAndSendKeys {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.intl=in");
		
		WebElement ele=driver.findElement(By.id("persistent"));
		//ele.click();
		
//		Actions act=new Actions(driver);
//		act.click(ele).build().perform();
		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		jsUtil.clickElementByJS(ele);
		
		jsUtil.sendKeysUsingWithId("login-username", "php@yahoo.com");
		
		
		
		
		

		
	}

}
