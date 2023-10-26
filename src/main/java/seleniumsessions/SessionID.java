package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionID {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	
	System.out.println(driver.getCurrentUrl());
	
	// driver.quit(); 
	
	driver.close();
	
	
	driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	System.out.println(driver.getTitle());
	//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
    //org.openqa.selenium.NoSuchSessionException: invalid session id	

	}

}
