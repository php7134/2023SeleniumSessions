package selelniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipProducts {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     driver.manage().window().maximize();
     
     
     
     WebElement searhBar=driver.findElement(By.cssSelector("input.Pke_EE"));
     searhBar.sendKeys("i phone");
     searhBar.sendKeys(Keys.ENTER);
     Thread.sleep(2000);
     
     //driver.findElement(null)
     
	}

}
