package connection;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
 
	public static void chrome () throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
			
	}
	
	public static void edge () throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		;
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
			
	}
	
	public static void firefox () throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
			
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		chrome();
		edge();
		firefox();

	}
}
