package testngKeywords;

import org.testng.annotations.Test;

public class Enable {

	
	@Test (enabled = false)
	public void unconfirmed () {
		System.out.println("this testcase will not run as it uses false");
	}
	
	
	@Test (enabled = true)
	public void confirmed() {
		System.out.println("this testcase will only run as it is true");
	}
	
}
