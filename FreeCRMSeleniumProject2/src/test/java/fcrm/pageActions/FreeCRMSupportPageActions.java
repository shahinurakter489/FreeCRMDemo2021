package fcrm.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fcrm.pageElements.FreeCRMSupportElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMSupportPageActions {

	FreeCRMSupportElements supportElements;

	public FreeCRMSupportPageActions() {

		this.supportElements = new FreeCRMSupportElements();

		PageFactory.initElements(DriverSetUp.chromeDriver, supportElements);

	}

	public void getfreeCRMSupportPage() {
		DriverSetUp.chromeDriver.get("https://support.cogmento.com/en/collections/1398782-webinars-videos");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void clickSupportButton() {
		supportElements.Support.click();

	}
}
