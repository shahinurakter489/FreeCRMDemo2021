package freeCRMStepDef;

import org.testng.Assert;

import fcrm.pageActions.FreeCRMAppstorePageActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMAppstoreStepDef {
	FreeCRMAppstorePageActions freeCRMAppstorePageAction = new FreeCRMAppstorePageActions();
	
	@Given("customer is in freecrm homepage {string}")
	public void customer_is_in_freecrm_homepage(String string) {
		freeCRMAppstorePageAction.getfreeCRMAppstorePage();
	}

	@When("customer  clicks on ios app store icon")
	public void customer_clicks_on_ios_app_store_icon() {
	    freeCRMAppstorePageAction.clickAppstoreButton();
	}

	@Then("customer should be able to see the freecrm ios app store page {string}")
	public void customer_should_be_able_to_see_the_freecrm_ios_app_store_page(String string) {
		String expectedURL = "https://apps.apple.com/us/app/cogmento/id1291380634";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}

}
