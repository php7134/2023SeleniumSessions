package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverLaunch {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		WebDriver driver1=new ChromeDriver();
		
		driver.get("https://google.com");
		driver1.get("https://amazon.com");
		
		// Use case
		// Admin & User
		
		driver=driver1;
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
