package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Keys;

import base.SeleniumBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class SearchPage extends SeleniumBase {
	@Given("enter start place")
	public SearchPage enterStartPlace() throws InterruptedException {
		driver.findElementById("src").sendKeys("chennai");
		Thread.sleep(3000);
		driver.findElementById("src").sendKeys(Keys.TAB);
		return this;
	}
	@And("enter destination")
	public SearchPage enterDest() throws InterruptedException {
		driver.findElementById("dest").sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElementById("dest").sendKeys(Keys.TAB);
		return this;
	}
	@And("enter date")
	public SearchPage enterDate() {
		driver.findElementByXPath("//label [text()='Onward Date']").click();
		Date date= new Date(); 
		DateFormat sdf = new SimpleDateFormat("dd"); 
		String today = sdf.format(date);
		driver.findElementByXPath("(//td[text()='"+today+"'])[2]").click();
		return this;
	}
	@And("click search")
	public BusDetailsPage ClickSearch() {
		driver.findElementById("search_btn").click();
		return  new BusDetailsPage();
	}
	

}
