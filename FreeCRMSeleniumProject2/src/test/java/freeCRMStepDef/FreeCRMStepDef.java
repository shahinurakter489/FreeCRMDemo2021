package freeCRMStepDef;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import fcrm.pageActions.FreeCRMPageActions;
import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FreeCRMStepDef {
	
	FreeCRMPageActions freeCRMPageActions = new FreeCRMPageActions();
	
@Given("Open the freecrm homepage")
public void open_the_freecrm_homepage() {
	String expectedUrl = "https://www.freecrm.com/index.html";
	DriverSetUp.chromeDriver.get(expectedUrl);
	DriverSetUp.chromeDriver.manage().window().maximize();
	DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	Assert.assertEquals(DriverSetUp.chromeDriver.getCurrentUrl(), expectedUrl);
	System.out.println(">> Free CRM Home Page<<");
}
@When("select for Free CRM")
public void select_for_Free_CRM() {
	freeCRMPageActions.selectFreeCRM();

}

@Then("Item list should have only Free CRM related Business")
public void item_list_should_have_only_Free_CRM_related_Business() {

	String expectedURL = "https://www.freecrm.com/index.html";
	String actualURL = DriverSetUp.chromeDriver.getCurrentUrl();
	Assert.assertEquals(actualURL, expectedURL);
}
}
