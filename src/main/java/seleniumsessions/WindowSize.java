package seleniumsessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//Dimension dim=new Dimension(800, 500);
		
		//driver.manage().window().setSize(dim);
		
        driver.manage().window().setSize(new Dimension(1080, 960));
		driver.get("https://www.amazon.com");
		
	}

}
