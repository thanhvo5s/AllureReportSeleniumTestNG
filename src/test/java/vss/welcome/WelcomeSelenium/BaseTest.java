package vss.welcome.WelcomeSelenium;

import org.openqa.selenium.WebDriver;
import java.io.File;
//import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
	WebDriver browser;
	//ChromeOptions chromeOptions;
	public BaseTest() {
		//System.out.println("driver path = " + System.getProperty("user.dir") + "//chromedriver");
		//File f = new File(System.getProperty("user.dir") + "//chromedriver");
		//if(f.exists() && !f.isDirectory()) { 
		//	System.out.println("File Exists");
		//}
		//else System.out.println("File NOT Exists");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//chromedriver");
		
		//chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("start-maximized"); // open Browser in maximized mode
		//chromeOptions.addArguments("disable-infobars"); // disabling infobars
		//chromeOptions.addArguments("--disable-extensions"); // disabling extensions
		//chromeOptions.addArguments("--disable-gpu"); // applicable to windows os only
		//chromeOptions.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		//chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model
		//chromeOptions.addArguments("--remote-debugging-port=9222");
		//chromeOptions.addArguments("--headless");
	}
	
	public WebDriver GetDriver() {
		return browser;
	}
}
