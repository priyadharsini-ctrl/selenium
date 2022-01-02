import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OnlineBookTicket {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElementById("src").sendKeys("chennai");
		Thread.sleep(3000);
		driver.findElementById("src").sendKeys("chennai",Keys.TAB);

		driver.findElementById("dest").sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElementById("dest").sendKeys("Bangalore",Keys.TAB);

		driver.findElementByXPath("//label [text()='Onward Date']").click();
		Date date= new Date(); 
		DateFormat sdf = new SimpleDateFormat("dd"); 
		String today = sdf.format(date);
		driver.findElementByXPath("(//td[text()='"+today+"'])[2]").click();
		driver.findElementById("search_btn").click();
		//driver.findElementByXPath("//button[text()='Search Buses']").click();
		driver.findElementByXPath("(//label[@class='custom-checkbox'])[4]").click();
		driver.findElementByXPath("(//label[@class='cbox-label'])[6]").click();
		driver.findElementByLinkText("Seats Available").click();
		//System.out.println(driver.findElementByClassName("seat-left m-top-30").getText());
		System.out.println(driver.findElementByXPath("(//div[@class='seat-left m-top-30'])[1]").getText());
		driver.findElementByXPath("(//div[text()='View Seats'])[1]").click();
		
		File src= driver.getScreenshotAs(OutputType.FILE);
		File dsc= new File("./snap/img.png");
		FileUtils.copyFile(src, dsc);
		
		/*
		 * WebElement table =
		 * driver.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]");
		 * Date date= new Date(); DateFormat sdf = new SimpleDateFormat("dd"); String
		 * today = sdf.format(date);
		 * table.findElement(By.xpath("//td[contains(text(),'"+today+"')]")).click();
		 */
	}
}
