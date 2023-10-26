package testngsessions;

import org.testng.annotations.Test;

public class ExpectedConditionsConcept {

	@Test(expectedExceptions = ArithmeticException.class)
	public void homePageTest() {
		System.out.println("homePageTest");
		int i = 9 / 0;
	}

}
