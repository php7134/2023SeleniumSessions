package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chrome
		WebDriver driver=new ChromeDriver();
		
		//Automation Steps:
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		
		//verification point/checkpoint/Actual vs Expected Result
		if(title.contains("Amazon.com"))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("Incorrect Title");
		}
		System.out.println(driver.getCurrentUrl());
		//Automation Steps + verification point = Automation Testing
		
		// driver.quit(); //close the browser
		// driver.close();

	}

}
