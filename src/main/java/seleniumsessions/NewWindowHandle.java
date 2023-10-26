package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String parentWindow = driver.getWindowHandle();
		Thread.sleep(3000);
		
		//driver.switchTo().newWindow(WindowType.TAB); //open blank tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		
		
	}

}
