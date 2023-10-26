package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");

		By forgotPwdLink = By.linkText("Forgot Password?");
		By pricing = By.linkText("Pricing");

		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.clickElementWhenReady(forgotPwdLink, 10);

//		String title=waitForTitleIsAndCpature("Log In", 5);
//		System.out.println(title);
		
		//url:
		eleUtil.clickElementWhenReady(pricing, 10);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		if(wait.until(ExpectedConditions.urlContains("pricing.html")));
		{
			String url=driver.getCurrentUrl();
			System.out.println(url);
		}

	}
	public static String waitForURLContainsAndCpature(String urlFragment, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.urlContains(urlFragment))) {
			String url = driver.getCurrentUrl();
			return url;
		} else {
			System.out.println("url is not present in the given timeout : " + timeout);
			return null;
		}

	}
	public static String waitForURLAndCpature(String urlValue, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.urlToBe(urlValue))) {
			String url = driver.getCurrentUrl();
			return url;
		} else {
			System.out.println("url is not present in the given timeout : " + timeout);
			return null;
		}

	}

	public static String waitForTitleIsAndCpature(String titleFragment, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.titleContains(titleFragment))) {
			String title = driver.getTitle();
			return title;
		} else {
			System.out.println("title is not present in the given timeout : " + timeout);
			return null;
		}

	}
	public static String waitForFullTitleAndCpature(String titleVal, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if (wait.until(ExpectedConditions.titleIs(titleVal))) {
			String title = driver.getTitle();
			return title;
		} else {
			System.out.println("title is not present in the given timeout : " + timeout);
			return null;
		}

	}

}
