package vss.welcome.WelcomeSelenium;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	WebDriver browser;
	public BaseTest() {
		System.out.println("driver path = " + System.getProperty("user.dir") + "\\drivers\\chromedriver");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver");
	}
	
	public WebDriver GetDriver() {
		return browser;
	}
}
