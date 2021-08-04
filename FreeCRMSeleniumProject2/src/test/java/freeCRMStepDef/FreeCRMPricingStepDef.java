package freeCRMStepDef;

import org.testng.Assert;

import fcrm.pageActions.FreeCRMPricingPageActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.*;

public class FreeCRMPricingStepDef {
	
	FreeCRMPricingPageActions freeCRMPricingPageAction = new FreeCRMPricingPageActions();
	
	@Given("User is in the homepage of freeCRM {string}")
	public void user_is_in_the_homepage_of_freeCRM(String string) {
		freeCRMPricingPageAction.getFreeCRMPricingPage();
	    
	}

	@When("User clicks on the Pricing button")
	public void user_clicks_on_the_Pricing_button() {
		freeCRMPricingPageAction.clickPricingPage();
	   
	}

	@Then("User should be able to redirect to the Pricing Page {string}")
	public void user_should_be_able_to_redirect_to_the_Pricing_Page(String string) {
		String expectedURL = "https://freecrm.com/pricing_us.html";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}





}
