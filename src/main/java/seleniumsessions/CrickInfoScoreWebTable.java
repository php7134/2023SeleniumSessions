package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfoScoreWebTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/asia-cup-2023-1388374/sri-lanka-vs-india-final-1388414/full-scorecard");
		Thread.sleep(4000);

		String wktkrName = getWicketTakerName("Charith Asalanka");
		System.out.println(wktkrName);

		System.out.println(getPlayerScoreCardsList("Charith Asalanka"));

	}

	public static String getWicketTakerName(String playerName) {
		return driver
				.findElement(By.xpath("//span[text()='" + playerName + "']/ancestor::td/following-sibling::td//span"))
				.getText();

	}

	public static List<String> getPlayerScoreCardsList(String playerName) {
		List<WebElement> scoreList = driver.findElements(By.xpath(
				"//span[text()='" + playerName + "']/ancestor::td//following-sibling::td[contains(@class,'ds-text-typo') ]//following-sibling::td"));
		List<String> scorevalueList = new ArrayList<>();

		for (WebElement e : scoreList) {
			String text = e.getText();
			scorevalueList.add(text);

		}
		return scorevalueList;

	}

}
