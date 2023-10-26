package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelectTag {

	public static void main(String[] args) {

		//drop down --- html tag =<select>
		//Select class
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		By country=By.id("Form_getForm_Country");
		WebElement countryEle=driver.findElement(country);
		
		Select select=new Select(countryEle);
		//select.selectByIndex(5);
		//select.selectByVisibleText("Australia");
		//select.selectByValue("Barbados");
		//select.selectByVisibleText("pawan");
		select.selectByIndex(500);
		
	}

}
