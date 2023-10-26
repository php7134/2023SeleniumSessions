package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrollingConcept {

	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions	 act=new Actions(driver);
		
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		act.sendKeys(Keys.PAGE_DOWN).build().perform();
//		
		
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
		//refresh the page:
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String s1="test";
		String s2="test@123";
		StringBuffer s3=new StringBuffer("Testing");
		//StringBuilder s4=new StringBuilder("Automation");
				
		driver.findElement(By.name("search")).sendKeys(s1 +" "+s2+" "+s3);
		
		driver.findElement(By.xpath("//input[@value='Login']")).sendKeys("testing");
		
		
		
		
		
		
		

		
	}

}
