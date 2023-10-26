package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//Browser
		    //page
		      //shadow DOM
		         //elements
		
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(4000);
		
        String pizza_JsPath="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";		
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement pizza=(WebElement)js.executeScript(pizza_JsPath);
        pizza.sendKeys("Veg Pizza");
        
        
        
        
        
        
        

		
	}

}
