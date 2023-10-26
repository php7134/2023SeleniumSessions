package selelniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOnPageAndHrefValues {
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		List<WebElement> linkList= driver.findElements(By.tagName("a"));
		//int totalLinks=linkList.size();
		int count=0;
		for(WebElement links:linkList)
		{
			if((!(links.getAttribute("href")==null)))
			{
			System.out.println(count +":"+ links.getAttribute("href"));
			count ++;
			}
			
		}
		

	}

}
