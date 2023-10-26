package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		Thread.sleep(3000);
		
//		driver.switchTo()
//		      .frame("pact1")
//		         .switchTo()
//		           .frame("pact2")
//		              .switchTo()
//		                 .frame("pact3")
//		                   .findElement(By.id("glaf")).sendKeys("Riya");
		
//		driver.switchTo()
//	      .frame("pact1")
//	         .switchTo()
//	           .frame("pact2")
//	                   .findElement(By.id("jex")).sendKeys("Ankit");
		
		driver.switchTo()
	      .frame("pact1")
	         .switchTo()
	           .frame("pact2")
	               .switchTo()
                       .frame("pact3")
	                   .findElement(By.id("glaf")).sendKeys("Riya");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("Ankit");
		
	
	
		
		//Nested iframes/frames
		//Browser
		   //Page -- elements
		      //iframe1  -- elements
		         //iframe2  -- elements
		             //iframe3 -- elements
//		
//		driver.switchTo().frame("pact1");
//		driver.findElement(By.id("inp_val")).sendKeys("Tom");
//		
//		driver.switchTo().frame("pact2");
//		driver.findElement(By.id("jex")).sendKeys("Peter");
//		
//		driver.switchTo().frame("pact3");
//		driver.findElement(By.id("glaf")).sendKeys("php");
		
//		driver.switchTo().parentFrame();  //sele 4.x -- driver  --> pact2
//		driver.findElement(By.id("jex")).sendKeys("Siya");
//		
//		driver.switchTo().parentFrame();
//		driver.findElement(By.id("inp_val")).sendKeys("Ankit");
		
		
		//pact 3 to pact 1
		
//		driver.switchTo().parentFrame(); //pact2
//		driver.switchTo().parentFrame(); //pact1
//		driver.findElement(By.id("inp_val")).sendKeys("Testing");
		
//		//driver is on pact1 ---> main page (default content)
//		driver.switchTo().defaultContent(); // pact 1 --> page
//		String header=driver.findElement(By.cssSelector("h1.elementor-heading-title.elementor-size-default")).getText();
//		System.out.println(header);
//		
		
		
		
		
		
		
		
		
		
		
		
		
  
	}

}
