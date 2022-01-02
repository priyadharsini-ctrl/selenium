package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.SeleniumBase;
import pages.SearchPage;

public class TC_RedBus extends SeleniumBase{
	
	@Test
	public void searchBus() throws IOException, InterruptedException {
		
		new SearchPage().enterStartPlace().enterDest().enterDate()
		.ClickSearch().CheckAfter6pm().checkSleeper().clickSeatAvailable()
		.clickViewSeats().takeScreenShot();
	}

}
