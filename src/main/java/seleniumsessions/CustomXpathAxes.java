package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathAxes {

	static WebDriver driver;

	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		// //div[text()='Get to Know Us']/following-sibling::ul//a

		getColumnValues("Get to Know Us");
		getColumnValues("Make Money with Us");
	}

	public static void getColumnValues(String coumnName) {
		System.out.println("-------------print the values for " + coumnName);
		List<WebElement> columnValues = driver
				.findElements(By.xpath("//div[text()='" + coumnName + "']/following-sibling::ul//a"));
		for (WebElement e : columnValues) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}
