package seleniumsessions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		driver.manage().window().fullscreen();
		Thread.sleep(6000);
		getCarouselItems("Trending deals in Televisions");

	}

	public static void getCarouselItems(String sectionName) {
		String xpath = "//h2[text()='" + sectionName
				+ "']/parent::div/../following-sibling::div//div[@data-qa='product-name']";
		String next_xpath = "//h2[text()='" + sectionName
				+ "']/parent::div/../following-sibling::div/div[contains(@class,'swiper-button-next')]";

		List<WebElement> productList = driver.findElements(By.xpath(xpath));
		System.out.println(productList.size());
		Set<String> prodTextList = new TreeSet<String>();
		// List<String> productTextList = new ArrayList<String>();
		while (!driver.findElement(By.xpath(next_xpath)).getAttribute("class").contains("swiper-button-disabled")) {
			// capture the product names:
			for (WebElement e : productList) {
				String text = e.getText();
				if (!text.isEmpty()) {
					prodTextList.add(text);
				}
			}
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath(next_xpath)));
			driver.findElement(By.xpath(next_xpath)).click();
		}
		// print the productTextList:
		for (String e : prodTextList) {
			System.out.println(e);
		}
		System.out.println("---------------------------");
	}

}
