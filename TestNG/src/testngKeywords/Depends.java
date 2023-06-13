package testngKeywords;

import org.testng.annotations.Test;

public class Depends {
	
	@Test (priority = 1, enabled = true)
	public void login () {
		System.out.println("user logins to app");
	}
	
	@Test (priority = 2, dependsOnMethods = "login")		// will get passed
	public void homepage () {
		System.out.println("user lands on homepage of app");
	}
	
	@Test (priority = 3, enabled = false)   
	public void profile () {
		System.out.println("after login user can access user profile");
	}
	
	@Test (priority = 4, dependsOnMethods = "profile")     //  will throw testng exception
	public void logout () {
		System.out.println("user logouts from app");
	}
}
	
	// dependsOnMethod will run only when that method passes or will throw exception