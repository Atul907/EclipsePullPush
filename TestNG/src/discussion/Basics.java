package discussion;

import org.testng.annotations.Test;

public class Basics {

	@Test							// ctrl+shift+o -- to import required packages
	public void method1 () {
		
		System.out.println("this is method 1");
	}
	
	@Test
	public void method2 () {
		System.out.println("this is method 2");
	}
	
	// @Test when used it becomes test case 
	// when @Test not used it is program
}
	
	// here no main method present so run as java application will not be available
	// run as java application option available only when main method is present

	// here using testng we we should run script as testng test