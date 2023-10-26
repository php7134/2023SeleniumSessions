package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickElement {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");

		By emailId = By.id("username");
		By psw = By.id("password");
		By loginBtn = By.id("loginBtn");

		doSendkeys(emailId, "php@gmail.com");
		doSendkeys(psw, "php@123");
		//doClick(loginBtn);
		
		
		
		

	}
	public static void doClear(By locator)
	{
		getElement(locator).clear();
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
