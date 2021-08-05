package fcrm.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fcrm.pageElements.FreeCRMCompareElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMCompareActionsPage {
	FreeCRMCompareElements freeCRMCompareElements = new FreeCRMCompareElements();

	public FreeCRMCompareActionsPage() {
		this.freeCRMCompareElements = new FreeCRMCompareElements();

		PageFactory.initElements(DriverSetUp.chromeDriver, freeCRMCompareElements);

	}

	public void getFreeCRMComparePage() {
		DriverSetUp.chromeDriver.get("https://freecrm.com/compare.html");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void clickCompare() {
		freeCRMCompareElements.Compare.click();
	}
}
