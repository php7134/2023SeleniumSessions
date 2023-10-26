package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	//driver.manage().window().fullscreen();
	/*
	 * String pgsource=driver.getPageSource();
	 * 
	 * System.out.println(pgsource);
	 * 
	 * System.out.println(pgsource.contains("end services section"));
	 */	
	driver.navigate().refresh();
	
	driver.get(driver.getCurrentUrl());
	
	}

}
