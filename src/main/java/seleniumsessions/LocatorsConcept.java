package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1. id : unique attribute
		
//		driver.findElement(By.name("firstname")).sendKeys("php@gmail.com");
//		driver.findElement(By.name("lastname")).sendKeys("php@123");
//		driver.findElement(By.name("agree")).click();

		//2. name : not unique attribute
//		By fn=By.name("firatname");
//		By check=By.name("agree");
//		
//		ElementUtil eleUtil=new ElementUtil(driver);
//		eleUtil.doSendKeys(fn, "test");
//		eleUtil.doClick(check);
		
		//3. className : not unique attribute
		
		//4. xpath: is not an attribute, it is the address of the element in HTML DOM.
		//can be unique/can be duplicate
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("test");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("automation");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		
		//5. cssSelector: is not an attribute.
		
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("php");
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("php7134@gmnail.com");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		
		// xpath vs css
		
		//6. linkText: only for links.
		// can be duplicate or can be blank
		driver.findElement(By.linkText("Login")).click();
//		driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7. partiallinkText: only for links.
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8. tagName:HTML tag
		String headervalue=driver.findElement(By.tagName("h2")).getText();
		System.out.println(headervalue);
		
		
//		String text=driver.findElement(By.linkText("Recurring payments")).getText();
//		System.out.println(text);
		
		By rp=By.linkText("Recurring payments");
		String text=doGetElementText(rp);
		System.out.println(text);
		
		
	}
	
	public static String doGetElementText(By locator)
	{
		return getElement(locator).getText();
		
	}

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		
	}

}
