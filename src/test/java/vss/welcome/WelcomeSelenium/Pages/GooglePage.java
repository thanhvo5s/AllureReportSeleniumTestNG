package vss.welcome.WelcomeSelenium.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class GooglePage {
	WebDriver browser;
	public GooglePage(WebDriver browser) {
		this.browser = browser;
	}
	
	public void SearchGoogleByKeyword(String keyword) {
		WebElement keywordInput = browser.findElement(By.xpath("//textarea[@name='q']"));
		keywordInput.sendKeys("selenium");
		keywordInput.sendKeys(System.lineSeparator());
	}
	
	public void ClickFirstSearchResult() {
		WebElement firstResult = browser.findElement(By.xpath("//a[contains(@href, 'www.selenium.dev')]"));
		firstResult.click();
	}
	
	public void VerifyCurrentUrl(String expectedUrl) {
		Assert.assertEquals(browser.getCurrentUrl(), expectedUrl);
	}
}
