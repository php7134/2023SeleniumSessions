package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		String title=js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
//		String title=jsUtil.getTitleByJS();
//		System.out.println(title);
		
//		jsUtil.generateAlert("this is my js alert");
		
//		String pageText=jsUtil.getPageInnerText();
//		System.out.println(pageText.contains("Deal Pipeline"));
//		System.out.println(pageText.contains("TRACK EVERYTHING INSTANTLY"));
//		//System.out.println(pageText.contains(pageText));
		
	//	jsUtil.zoomChromeEdge("400");
		
		
//		WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
//		jsUtil.drawBorder(login);
//		
    	//WebElement form=driver.findElement(By.id("hs-login"));
    	//Thread.sleep(2000);
//		jsUtil.drawBorder(form);
//		
		
//		jsUtil.flash(form);
//		
//		jsUtil.scrollPageDown();
//		Thread.sleep(2000);
//		jsUtil.scrollPageUp();
//		
		
		WebElement ele=driver.findElement(By.xpath("//h2[text()='Live plants & planters']"));
		jsUtil.scrollIntoView(ele);
		
		
		
		
		
		
		
		
		
		
		
				
		
		
	}

}
