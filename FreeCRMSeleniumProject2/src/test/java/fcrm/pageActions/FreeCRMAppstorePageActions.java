package fcrm.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fcrm.pageElements.FreeCRMAppstoreElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMAppstorePageActions {
	FreeCRMAppstoreElements appstoreElements;
	public FreeCRMAppstorePageActions() {
		this.appstoreElements = new FreeCRMAppstoreElements();
		PageFactory.initElements(DriverSetUp.chromeDriver, appstoreElements);
	}
	
	public void getfreeCRMAppstorePage() {
		DriverSetUp.chromeDriver.get("https://apps.apple.com/us/app/cogmento/id1291380634");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void clickAppstoreButton() {
		appstoreElements.Appstore.click();
	}
	
	
}
