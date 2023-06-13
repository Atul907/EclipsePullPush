package testngKeywords;

import org.testng.annotations.Test;

public class Timeout {

	@Test (invocationCount = 5)
	public void loading () {
		System.out.println("this method takes time to load");
	}
	
	@Test (timeOut = 2000)
	public void waiting () {
		System.out.println("will wait till time given");
	}
}
