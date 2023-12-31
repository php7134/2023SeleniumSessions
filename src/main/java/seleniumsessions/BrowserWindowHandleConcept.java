package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
     //new window/tab
	// click on ele --> new tab/window -- browser window pop up
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		//parent (driver)+child windows
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		
		String parentWindowId=it.next();
		String childWindowId=it.next();
		
		System.out.println("parent window id is: "+parentWindowId);
		System.out.println("child window id is: "+childWindowId);
		
		//Switching work:
		driver.switchTo().window(childWindowId);
		System.out.println("child window url: " + driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url: " + driver.getCurrentUrl());
		driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
