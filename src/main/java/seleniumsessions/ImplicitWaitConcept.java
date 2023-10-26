package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //sele 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //sele 4.x
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");//10
		String label=driver.findElement(By.id("nav-logo-sprites")).getAttribute("aria-label");//10
		System.out.println(label);
		
		
	}

}
