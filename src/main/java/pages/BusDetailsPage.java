package pages;

import base.SeleniumBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class BusDetailsPage extends SeleniumBase {
	@And("click after 6 pm")
	public BusDetailsPage CheckAfter6pm() throws InterruptedException {
		Thread.sleep(300);
		driver.findElementByXPath("(//label[@class='custom-checkbox'])[4]").click();
		return this;
	}
	@And("click bus type as sleeper")
	public BusDetailsPage checkSleeper() {
		driver.findElementByXPath("(//label[@class='cbox-label'])[6]").click();
		return this;
	}
	@And("click seats available")
	public BusDetailsPage clickSeatAvailable() {
		driver.findElementByLinkText("Seats Available").click();
		return this;
	}
	@And("get the number of seats available")
	public BusDetailsPage getNumberOfSeats() {
		System.out.println(driver.findElementByXPath("(//div[@class='seat-left m-top-30'])[1]").getText());
		return this;
	}
	@When("click on view seats")
	public ResultPage clickViewSeats() throws InterruptedException {
		driver.findElementByXPath("(//div[text()='View Seats'])[1]").click();
		Thread.sleep(300);
		return new ResultPage();
	}
	
	
	
	
	
}
