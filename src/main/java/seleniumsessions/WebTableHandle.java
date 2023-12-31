package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		selectUser("Joe.Root");
		selectUser("John.Smith");
		
		List<String> joeInfo=getUserInfo("Joe.Root");
		System.out.println(joeInfo);
	}
	
	public static void selectUser(String userName)
	{
		driver.findElement(By.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
	
	public static List<String> getUserInfo(String userName)
	{
		List<WebElement>  UserInfoList=driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> userInfoValueList=new ArrayList<>();
		
		for(WebElement e:UserInfoList)
		{
			String text=e.getText();
			userInfoValueList.add(text);
		}
		return userInfoValueList;
	}

}
