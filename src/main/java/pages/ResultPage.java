package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import base.SeleniumBase;
import cucumber.api.java.en.Then;

public class ResultPage extends SeleniumBase{
	@Then("take screenshot of page")
	public ResultPage takeScreenShot() throws IOException {
		File src= driver.getScreenshotAs(OutputType.FILE);
		File dsc= new File("./snap/img.png");
		FileUtils.copyFile(src, dsc);
		return this;
	}
}
