package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// xpath: address of element in the HTML DOM

		driver.findElement(By.xpath("//img[@title='naveenopencart']")).click();

		driver.findElement(By.xpath("//input[@type='text' and @name='search' and @placeholder='Search']"))
				.sendKeys("php");
		
		
		//text() function
		
		//contains function with attribute
		driver.findElements(By.xpath("//input[contains(@placeholder,'E-Mail')]"));

	}

}
