package freeCRMStepDef;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import fcrm.pageActions.FreeCRMHomepageActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMHomeStepDef {

	FreeCRMHomepageActions freeCRMHomepageActions = new FreeCRMHomepageActions();

	@Given("Customer  go to the google browser")
	public void customer_go_to_the_google_browser() {
		freeCRMHomepageActions.getFreeCRMHomepage();
		String expectedUrl = "https://www.freecrm.com/index.html";
		DriverSetUp.chromeDriver.get(expectedUrl);
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		Assert.assertEquals(DriverSetUp.chromeDriver.getCurrentUrl(), expectedUrl);
		System.out.println(">> Free CRM Home Page<<");
	}

	@When("Customer enter the  freecrm")
	public void customer_enter_the_freecrm() {
		freeCRMHomepageActions.selectFreeLogo();
		freeCRMHomepageActions.selectLogocrm();
	}

	@Then("Customer  should able to go freecrm homepage")
	public void customer_should_able_to_go_freecrm_homepage() {

		String expectedURL = "https://www.freecrm.com/index.html";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
}
