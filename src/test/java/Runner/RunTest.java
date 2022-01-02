package Runner;

import base.SeleniumBase;
import cucumber.api.CucumberOptions;


@CucumberOptions(features = "src/test/java/Features" , glue = "pages" , monochrome=true)
public class RunTest extends SeleniumBase {
// done
}
