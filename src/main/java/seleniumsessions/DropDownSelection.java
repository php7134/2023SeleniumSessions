package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://demo.1crmcloud.com/login.php");

		By lang = By.id("login_lang");
		By theme = By.id("login_theme");

//		doSelectByDropDownByIndex(lang, 2);
//		doSelectByDropDownByIndex(theme, 3);
		
		doSelectByDropDownByVisibleText(lang, "IT Italiano");
		doSelectByDropDownByValueAttribute(theme, "Delight");
		

	}

	public static void doSelectByDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectByDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public static void doSelectByDropDownByValueAttribute(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
