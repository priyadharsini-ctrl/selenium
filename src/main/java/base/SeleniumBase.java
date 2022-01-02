package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import cucumber.api.testng.AbstractTestNGCucumberTests;

public class SeleniumBase extends AbstractTestNGCucumberTests {

	public static  ChromeDriver driver;
	@Parameters({"url"})
	@BeforeMethod
		public void login(String url) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
