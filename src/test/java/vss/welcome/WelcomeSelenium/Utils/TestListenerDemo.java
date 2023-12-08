package vss.welcome.WelcomeSelenium.Utils;

import java.io.ByteArrayInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import vss.welcome.WelcomeSelenium.BaseTest;

public class TestListenerDemo implements ITestListener {
	@Attachment(value="Page screenshot", type="image/png")
	public static byte[] getScreenShot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	public void onTestFailure(ITestResult iTestResult) {
		Object testClass = iTestResult.getInstance();
		WebDriver driver = ((BaseTest)testClass).GetDriver();//You need implement method GetDriver in BaseTest
		getScreenShot(driver);
		String imageFileName = iTestResult.getMethod().getMethodName() +
						new SimpleDateFormat("MM-dd-yyy_HH-mm-ss").format(new Date()) + ".png";
		Allure.addAttachment(imageFileName, new ByteArrayInputStream(getScreenShot(driver)));
	}
}
