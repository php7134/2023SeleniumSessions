package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		String username="admin";
		String password="admin";
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		
		
	}

}
