package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {
    static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		//selectDate("29");
		selectFutureDate("February 2024", 30);
	}
	
	public static void selectFutureDate(String expMonthYear, int day)
	{
		if(expMonthYear.contains("February") && day>29)
		{
			System.out.println("wrong day is passed..please pass the right date..." + day);
			return;
		}
		if(day>31)
		{
			System.out.println("wrong day is passed..please pass the right date..." + day);
			return;
		}
		if(day<1)
		{
			System.out.println("wrong day is passed..please pass the right date..." + day);
			return;
		}
		
		String actMonYear=driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		System.out.println(actMonYear);
		
		
		while (!actMonYear.equalsIgnoreCase(expMonthYear)) {
			//click on next icon:
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonYear=driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		}

		selectDate(day);
		
	}
	
	public static void selectBackDate(String expMonthYear, int day)
	{
		if(expMonthYear.contains("February") && day>29)
		{
			System.out.println("wrong day is passed..please pass the right date..." + day);
			return;
		}
		if(day>31)
		{
			System.out.println("wrong day is passed..please pass the right date..." + day);
			return;
		}
		if(day<1)
		{
			System.out.println("wrong day is passed..please pass the right date..." + day);
			return;
		}
		
		String actMonYear=driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		System.out.println(actMonYear);
		
		
		while (!actMonYear.equalsIgnoreCase(expMonthYear)) {
			//click on next icon:
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			actMonYear=driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		}

		selectDate(day);
		
	}
	
	public static void selectDate(int day)
	{
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}

}
