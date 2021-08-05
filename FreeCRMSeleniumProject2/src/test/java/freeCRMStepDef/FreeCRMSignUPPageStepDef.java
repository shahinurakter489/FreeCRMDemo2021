package freeCRMStepDef;

import org.testng.Assert;

import fcrm.pageActions.FreeCRMSignUpActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FreeCRMSignUPPageStepDef {
	FreeCRMSignUpActions freeCRMSignUpActions = new FreeCRMSignUpActions();
	@Given("customer in Free CRM Sign up  page")
	public void customer_in_Free_CRM_Sign_up_page() {
		freeCRMSignUpActions.getFreeCRMSignUpPage();
	}

	@When("customer gives input  email address")
	public void customer_gives_input_email_address(String email) {
		freeCRMSignUpActions.enterUserEmail(email);

	}

	@When("customer gives input  country name and phonenumber")
	public void customer_gives_input_country_name_and_phonenumber() {
		freeCRMSignUpActions.enteruserPhonenumber(null);

	}

	@When("customer  select the agreement box")
	public void customer_select_the_agreement_box(String check) {
		freeCRMSignUpActions.checkBox(check);

	}

	@Then("customer should able to Sign up")
	public void customer_should_able_to_Sign_up() {
		  String expectedURL ="https://register.freecrm.com/register/";
		   String acturalURL = DriverSetUp.chromeDriver.getCurrentUrl();
		   Assert.assertEquals(acturalURL, expectedURL);

	}


}
