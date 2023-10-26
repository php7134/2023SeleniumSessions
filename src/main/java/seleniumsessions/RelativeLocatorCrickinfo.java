package seleniumsessions;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorCrickinfo {
	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-cricket-world-cup-2023-24-1367856/england-vs-new-zealand-1st-match-1384392/live-cricket-score");
		driver.manage().window().fullscreen();
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='Joe Root']"));
		
		driver.findElement(with(By.cssSelector(".ds-w-3/4.ds-overflow-x-auto.ds-scrollbar-hide")).toRightOf(ele));
		
	}

}
