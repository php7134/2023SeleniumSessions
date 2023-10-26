package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertHandling {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		//pop ups: Alerts Interface
		//1. Alerts
		//2. confirm
		//3. prompt
		
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(4000);
//		Alert alert=driver.switchTo().alert();
//		String alertText=alert.getText();
//		System.out.println(alertText);
//		alert.accept();
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		Alert alert=driver.switchTo().alert();
//		String alertTextJS=alert.getText();
//		System.out.println(alertTextJS);
//		alert.accept();
//		//alert.dismiss();
//		

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("testautomation");
		String alertTextJS=alert.getText();
		System.out.println(alertTextJS);
		alert.accept();
		//alert.dismiss();
		
		
		
		
		
		
		
	}

}
