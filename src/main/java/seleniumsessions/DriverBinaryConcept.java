package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverBinaryConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		
		//driver.quit();
		driver.close();
		
		WebDriver driver1=new SafariDriver();
		
		driver.get("https://google.com");
		
		
		
	}

}
