package freeCRMStepDef;

import freeCRM.utilities.DriverSetUp;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeActions {
@Before
public void beforeScenarioActions(Scenario scenario) {
	System.out.println(">>Initializing chrome Driver<<");
	DriverSetUp.setupChromeDriver();
	System.out.println("Scenario Executed:"+scenario.getName());
}
}
