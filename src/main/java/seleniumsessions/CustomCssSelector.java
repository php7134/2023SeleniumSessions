package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {
  static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		List<WebElement> mandEles=
				driver.findElements(By.cssSelector(" input#username,input#password,input#remember,button#loginBtn"));
		if(mandEles.size()==4)
		{
			System.out.println("mandatory elements are present ------PASS");
		}
			}

}
