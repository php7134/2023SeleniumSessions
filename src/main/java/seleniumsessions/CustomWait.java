package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement retryingElement(By locator, int timeout) {

		WebElement element = null;
		int attempts = 0;

		while (attempts < timeout) {
			try {
				element = getElement(locator);
				System.out.println("Element is found...." + locator + " in attempts: " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("Element is not found...." + locator + " in attempts: " + attempts);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}

		if (element == null) {
			System.out.println(
					"element is not found...tried for " + timeout + "secs" + " within the interval of 500 milliseconds");
		}
		return element;
	}
	
	public static WebElement retryingElement(By locator, int timeout,int pollingTime) {

		WebElement element = null;
		int attempts = 0;

		while (attempts < timeout) {
			try {
				element = getElement(locator);
				System.out.println("Element is found...." + locator + " in attempts: " + attempts);
				break;
			} catch (NoSuchElementException e) {
				System.out.println("Element is not found...." + locator + " in attempts: " + attempts);
				try {
					Thread.sleep(pollingTime);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}

		if (element == null) {
			System.out.println(
					"element is not found...tried for " + timeout + " secs " + " within the interval of 500 milliseconds");
		}
		return element;
	}


	public static void main(String args[]) {
		// static wait -----> dynamic wait
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
		By twitterLink = By.xpath("//a[contains(@href,'twitter1')]");
		retryingElement(twitterLink, 20, 2000).click();
	}

}
