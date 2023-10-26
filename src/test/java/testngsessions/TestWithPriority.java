package testngsessions;

import org.testng.annotations.Test;

public class TestWithPriority {
	@Test (priority = -1)
	public void searchTest() {
		System.out.println("test -- search test");
	}

	@Test (priority =5)
	public void addToCartTest() {
		System.out.println("test --- addToCartTest");
	}

	@Test (priority =3)
	public void aTest() {
		System.out.println("a test");
	}
	
	@Test (priority =2)
	public void ATest() {
		System.out.println("A test");
	}

	@Test (priority =0)
	public void bTest() {
		System.out.println("b test");
	}

}
