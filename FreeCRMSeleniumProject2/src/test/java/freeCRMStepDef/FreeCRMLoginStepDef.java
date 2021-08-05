package freeCRMStepDef;

import org.testng.Assert;

import fcrm.pageActions.FreeCRMlLoginPageActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMLoginStepDef {
	 FreeCRMlLoginPageActions  freeCRMlLoginPageActions = new  FreeCRMlLoginPageActions();
	
	@Given("customer in freecrm login page")
	public void customer_in_freecrm_login_page() {
		freeCRMlLoginPageActions.getFreeCRMLoginPage();
	}

	@When("customer  gives userid input\"Shahin@gmail.com\"")
	public void customer_gives_userid_input_Shahin_gmail_com(String userid) {
		freeCRMlLoginPageActions.inputUserId(userid);
	}

	@When("customer gives password input\"{int}\"")
	public void customer_gives_password_input(Integer int1) {
		freeCRMlLoginPageActions.inputPassword(null);
	}

	@When("customer click the submit button")
	public void customer_click_the_submit_button() {
		freeCRMlLoginPageActions.clickSubmitButton();
	}

	
	@Then("customer should be abel to login")
	public void customer_should_be_abel_to_login() {

		String expectedURL = "https://ui.cogmento.com/";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);

	}

	@Then("Customer should NOT be able to login")
	public void customer_should_NOT_be_able_to_login() {
		String expectedURL = "https://ui.cogmento.com/";
		String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
		Assert.assertNotEquals(expectedURL, actualURL);
	}
	
}
