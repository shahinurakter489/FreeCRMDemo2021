package freeCRMStepDef;

import org.testng.Assert;

import fcrm.pageActions.FreeCRMAboutPageActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class FreeCRMAboutStepDef {
	
	FreeCRMAboutPageActions freeCRMAboutPageAction = new FreeCRMAboutPageActions();

	@Given("Customer is in the home page {string}")
	public void customer_is_in_the_home_page(String string) {
	    freeCRMAboutPageAction.getfreeCRMAboutPage();
	}

	@When("Customer click on the About option")
	public void customer_click_on_the_About_option() {
		freeCRMAboutPageAction.clickAboutButton();
	    
	}

	@Then("They should be able to see the About Us page {string}")
	public void they_should_be_able_to_see_the_About_Us_page(String string) {
		String expectedURL = "https://freecrm.com/about.html";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}



}
