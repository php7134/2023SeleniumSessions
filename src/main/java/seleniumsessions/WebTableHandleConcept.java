package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandleConcept {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();		
		driver.navigate().refresh();
		
	    Thread.sleep(2000);
	    
	}

}
