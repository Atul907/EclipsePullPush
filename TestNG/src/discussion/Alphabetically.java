package discussion;

import org.testng.annotations.Test;

public class Alphabetically {

	@Test
	public void webpage () {
		System.out.println("opens webpage of app");
	}
	
	@Test
	public void login () {
		System.out.println("login page for app");
	}
	
	@Test
	public void homepage () {
		System.out.println("opens homepage of app");
	}
	
	@Test
	public void profile () {
		System.out.println("opens profile of user");
	}
	
	@Test
	public void logout () {
		System.out.println("logouts from app");
	}
	
	// test cases are performed as per alphabatical order by default
}
