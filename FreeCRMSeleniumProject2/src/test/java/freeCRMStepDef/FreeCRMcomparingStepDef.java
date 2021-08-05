package freeCRMStepDef;

import org.testng.Assert;

import fcrm.pageActions.FreeCRMCompareActionsPage;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMcomparingStepDef {
	FreeCRMCompareActionsPage freeCRMComparePageAction = new FreeCRMCompareActionsPage();
	@When("Customer click on the Compare option")
	public void customer_click_on_the_Compare_option() {
		freeCRMComparePageAction.clickCompare();
	}

	@Then("They should be able to see the Compare page {string}")
	public void they_should_be_able_to_see_the_Compare_page(String string) {
		String expectedURL = "https://freecrm.com/compare.html";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
}
