package vss.welcome.WelcomeSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import vss.welcome.WelcomeSelenium.Pages.GooglePage;
import vss.welcome.WelcomeSelenium.Utils.TestListenerDemo;

@Listeners({TestListenerDemo.class})
@Epic("EPIC 1: Regression test")
@Feature("Feature: Google search")
public class GoogleTest extends BaseTest {
	@BeforeClass
    public void before_class() {
		browser = new ChromeDriver(chromeOptions);
	}
	
	@Test(description="Verify the first search result in Google Search")
	@Description("Verify that the first result of Google search with 'selenium' keyword should be https://www.selenium.dev/")
	@Story("Impelement top search result by keyword")
	public void test_google_search() {
	    browser.get("https://www.google.com");
		
		GooglePage googlePage = new GooglePage(browser);
		googlePage.SearchGoogleByKeyword("selenium");
		
		googlePage.ClickFirstSearchResult();
		googlePage.VerifyCurrentUrl("https://www.selenium.dev/");
	}
	
	@AfterClass
	public void after_class() {
		browser.quit();
	}
}
