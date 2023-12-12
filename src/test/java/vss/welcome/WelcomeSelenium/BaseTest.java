package vss.welcome.WelcomeSelenium;

import org.openqa.selenium.WebDriver;
import java.io.File;

public class BaseTest {
	WebDriver browser;
	public BaseTest() {
		System.out.println("driver path = " + System.getProperty("user.dir") + "//chromedriver");
		File f = new File(System.getProperty("user.dir") + "//chromedriver");
		if(f.exists() && !f.isDirectory()) { 
			System.out.println("File Exists");
		}
		else System.out.println("File NOT Exists");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver");
	}
	
	public WebDriver GetDriver() {
		return browser;
	}
}
