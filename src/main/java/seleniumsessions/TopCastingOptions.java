package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		//1. valid only for chrome
		//ChromeDriver driver=new ChromeDriver();
		
		//2. valid --not recommended
		//SearchContext driver=new ChromeDriver();
		
		//3. valid  -- recommended	
		//WebDriver driver=new ChromeDriver();
		
		//4. valid  -- recommended
		//RemoteWebDriver driver=new ChromeDriver(); 
		
		//5. Valid  --recommended for remote --other machines GRID, Cloud - LT, BrowserStack, AWS
		//WebDriver driver=new RemoteWebDriver(null, null);
		//capabilities = chrome, 110
		
		//6. Valid - not recommended
		//SearchContext driver=new RemoteWebDriver(null, null); 
		
		//7. Valid -- only for chromium based browser
		//ChromiumDriver driver=new ChromeDriver();
		//ChromiumDriver driver1=new EdgeDriver();
		
		
		
		
		
	
		
		
		

	}

}
