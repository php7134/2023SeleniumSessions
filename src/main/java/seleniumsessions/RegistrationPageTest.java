package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.initDriver("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title=brUtil.getPageTitle();
		System.out.println("page title: "+title);
		
		System.out.println(brUtil.getPageURL());
		
		By fn=By.id("input-firstname");
		By ln=By.id("input-lastname");
		By email=By.id("input-email");
		By tele=By.id("input-telephone");
		By psw=By.id("input-telephone");
		By cpsw=By.id("input-confirm");
		
		ElementUtil eUtil=new ElementUtil(driver);
		eUtil.doSendKeys(fn, "tony");
		eUtil.doSendKeys(ln, "stark");
		eUtil.doSendKeys(email, "tony@123");
		eUtil.doSendKeys(tele, "9589598959");
		eUtil.doSendKeys(psw, "tony@123");
		eUtil.doSendKeys(cpsw, "tony@123");
		
		Thread.sleep(5000);
		brUtil.closeBrowser();
		
		
		
	}

}
