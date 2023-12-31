package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithoutSelectMethods {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");

		By country = By.id("Form_getForm_Country");
		
		ElementUtil elUtil=new ElementUtil(driver);
		boolean flag=elUtil.doSelectDropDownValue(country, "pawan");
		System.out.println(flag);
//		WebElement countryEle = driver.findElement(country);

//		int actCount = getDropDownvalaueCount(country);
//		if (actCount == 233) {
//			System.out.println("Pass -- count");
//		}
//
//		List<String> actCountryList = getAllDropDownOptions(country);
//		System.out.println(actCountryList.contains("India"));
//		System.out.println(actCountryList.contains("Brazil"));

		// System.out.println(getAllDropDownOptions(country).contains("India"));
		
		doSelectDropDownValue(country, "India");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static int getDropDownvalaueCount(By locator) {
		return getAllDropDownOptions(locator).size();
	}

	public static List<String> getAllDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();
		System.out.println("total values :" + optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			optionsValueList.add(text);
		}
		return optionsValueList;
	}
	public static void doSelectDropDownValue(By locator,String dropDownValue) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values :" + optionsList.size());

		for (WebElement e : optionsList) {
			String text = e.getText();
			
			if(text.equals(dropDownValue))
			{
				e.click();
				break;
			}
			
		}

	}
	

}
