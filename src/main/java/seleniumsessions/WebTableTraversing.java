package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTraversing {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);

		// By.xpath("//table[@id='customers']//tr/th");
		System.out.println("total cols: " + getColumnCount());
		System.out.println("col values are: " + getColumnValues());

		//// *[@id="customers"]/tbody/tr[2]/td[1]

		String beforeXpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";

//		for(int row=2;row<=getRowCount();row++)
//		{
//			String fullXpath=beforeXpath+row+afterXpath;
//			System.out.println(fullXpath);
//			
//			String text=driver.findElement(By.xpath(fullXpath)).getText();
//			System.out.println(text);
//		}

		List<WebElement> tableDataList = driver.findElements(By.xpath("//table[@id='customers']/tbody//td"));
		for (WebElement e : tableDataList) {
			String text = e.getText();
			System.out.println(text);
		}

	}

	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	}

	public static int getColumnCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
	}

	public static List<String> getColumnValues() {
		List<WebElement> colList = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		List<String> colValList = new ArrayList<>();

		for (WebElement e : colList) {
			String text = e.getText();
			colValList.add(text);

		}

		return colValList;
	}

	//// th[text()='Company']/parent::tr/following-sibling::tr/td[1]
}
