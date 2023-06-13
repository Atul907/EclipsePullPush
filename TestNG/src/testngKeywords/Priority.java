package testngKeywords;

import org.testng.annotations.Test;

public class Priority {

	@Test (priority = -1)
	public void webpage () {
		System.out.println("opens webpage of app");
	}
	
	@Test
	public void login () {
		System.out.println("login page for app");
	}
	
	@Test (priority = 1)
	public void homepage () {
		System.out.println("opens homepage of app");
	}
	
	@Test (priority = 2)
	public void profile () {
		System.out.println("opens profile of user");
	}
	
	@Test (priority = 3)
	public void logout () {
		System.out.println("logouts from app");
	}
	
	// test cases are performed as per alphabetical order by default
	// to set order of execution we use priority keyword
	// numbers can be (-ve , 0, +ve ) will perform in ascending order
	// if priority not given it will consider as priority 0
}
