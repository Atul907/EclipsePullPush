package testngKeywords;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test (invocationCount = 3)
	public void count() {
		System.out.println("how many times testcase performs depends on invocation count");
	}
	
}
