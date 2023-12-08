package vss.welcome.WelcomeSelenium;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	WebDriver browser;
	public BaseTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
	}
	
	public WebDriver GetDriver() {
		return browser;
	}
}
