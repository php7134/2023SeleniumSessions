package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pawan\\Documents\\SeleniumDrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());

	}

}
