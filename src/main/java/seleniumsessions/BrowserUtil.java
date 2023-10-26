package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	/**
	 * Date: Sep 7, 2023
	 * @author php
	 */
	WebDriver driver;
    /**
     * This method is initializing  the driver on the basis of given browser. 
     * Possible browsers are chrome, firefox, safari, edge
     * @param browserName
     * @return 
     *
     */
	public WebDriver initDriver(String browserName) {
		System.out.println("launching the browser: " + browserName);

		if (browserName == null) {
			System.out.println("browserName can not be null");
			throw new MySeleniumException("BROWSERNAMENULLEXCEPTION");
		}

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();

			break;
		case "edge":

			driver = new EdgeDriver();

			break;
		case "firefox": {

			driver = new FirefoxDriver();

			break;
		}

		default:

			System.out.println("plz pass the correct browser name." + browserName);
			throw new MySeleniumException("WRONGBROWSEREXCEPTION");

		}
		return driver;

	}

	/**
	 * This method is used to launch the URL. Please pass URL with http/https
	 * @param url
	 */
	public void launchURL(String url) {
		if (url == null) {
			System.out.println("URL can not be null");
			throw new MySeleniumException("URLBLANKEXCEPTION");
		}
		if (url.contains("http")) {
			driver.get(url);
		} else {
			System.out.println("http(s) is missing");
		}
	}
	
	// 
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
    
	public void closeBrowser()
	{
		driver.close();
	}
}
