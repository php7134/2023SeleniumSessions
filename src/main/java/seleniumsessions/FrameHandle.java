package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(3000);
		
		
	}

}
