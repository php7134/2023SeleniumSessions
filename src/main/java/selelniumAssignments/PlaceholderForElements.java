package selelniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsessions.ElementUtil;

public class PlaceholderForElements {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		ElementUtil eUtil = new ElementUtil(driver);

		By fn = By.id("input-firstname");
		String firstname = eUtil.doGetAttributeValue(fn, "placeholder");
		System.out.println(firstname);
		eUtil.doSendKeys(fn, "pawan");
		String fname=eUtil.doGetAttributeValue(fn, "value");
		System.out.println("Value after sendkeys:" +fname);

		By ln = By.id("input-lastname");
		String lastname = eUtil.doGetAttributeValue(ln, "placeholder");
		System.out.println(lastname);
		eUtil.doSendKeys(ln, "sinha");
		String lname=eUtil.doGetAttributeValue(ln, "value");
		System.out.println("Value after sendkeys:" +lname);

		By email = By.id("input-email");
		String mail = eUtil.doGetAttributeValue(email, "placeholder");
		System.out.println(mail);
		eUtil.doSendKeys(email, "pwa27123@gmai.com");
		String eMail=eUtil.doGetAttributeValue(email, "value");
		System.out.println("Value after sendkeys:" +eMail);

		By telePhone = By.id("input-telephone");
		String phone = eUtil.doGetAttributeValue(telePhone, "placeholder");
		System.out.println(phone);
		eUtil.doSendKeys(telePhone, "985974665");
		String telPhone=eUtil.doGetAttributeValue(telePhone, "value");
		System.out.println("Value after sendkeys:" +telPhone);

		By password = By.id("input-password");
		String psw = eUtil.doGetAttributeValue(password, "placeholder");
		System.out.println(psw);
		eUtil.doSendKeys(password, "Test@123");
		String passWord=eUtil.doGetAttributeValue(password, "value");
		System.out.println("Value after sendkeys:" +passWord);

		By passwordConfirm = By.id("input-confirm");
		String pswCnf = eUtil.doGetAttributeValue(passwordConfirm, "placeholder");
		System.out.println(pswCnf);
		eUtil.doSendKeys(passwordConfirm, "Test@123");
		String confirmPassword=eUtil.doGetAttributeValue(passwordConfirm, "value");
		System.out.println("Value after sendkeys:" +confirmPassword);

	}

}
