package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with; 


public class RelativeLocatorsConcept {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("(//a[contains(text(),'Gatineau, Canada')])[last()-(last()-1)]"));
		
		//right of ele  --->
		String rightScore=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightScore);
		
		
		//left of ele  --->
		String leftIndex=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndex);
		
		//below of ele  --->
		String belowCity=driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);		
		
		
		//above of ele  --->
		String aboveCity=driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		//near of ele  --->
		String nearCity=driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCity);
		
		
		
		

		
	}

}
