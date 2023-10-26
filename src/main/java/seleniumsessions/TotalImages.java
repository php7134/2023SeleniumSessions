package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		// Total number of images
//				List<WebElement>imglist=driver.findElements(By.tagName("img"));
//				System.out.println("total images:" + imglist.size());
//				
//				
//				//int count=0;
//				for(WebElement e:imglist)
//				{
//					String altValue=e.getAttribute("alt");
//					System.out.println(altValue);
//					//String images=img.getText();
////					if (images.length()>0)
////					{
////						System.out.println(count + " = " + images);
////					}
//					//System.out.println(count);
//					//count++;
//				}
		By image = By.tagName("img");
		By links = By.tagName("a");

		int imagesCount=getElementsCount(links);
		if(imagesCount>=200) {
			
		}
		List<String> imagesAttrList=getElementsAttributeValue(image, "alt");
		if(imagesAttrList.contains("Computer mice"))
		{
			System.out.println("PASS");
		}
		getElementsAttributeValue(links, "href");
		

	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<String> getElementsAttributeValue(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			//System.out.println(attrValue);
			eleAttrList.add(attrValue);
		}
		return eleAttrList;
	}

	public static List<WebElement> getElements(By locators) {
		return driver.findElements(locators);
	}

}
