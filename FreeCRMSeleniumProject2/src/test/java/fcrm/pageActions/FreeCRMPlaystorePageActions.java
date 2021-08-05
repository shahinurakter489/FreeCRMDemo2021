package fcrm.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fcrm.pageElements.FreeCRMPlaystoreElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMPlaystorePageActions {
	
	FreeCRMPlaystoreElements playstoreElements;
	public FreeCRMPlaystorePageActions() {
		this.playstoreElements = new FreeCRMPlaystoreElements();
		PageFactory.initElements(DriverSetUp.chromeDriver, playstoreElements);
	}
	public void getfreeCRMPlaystore() {
		DriverSetUp.chromeDriver.get("https://play.google.com/store/apps/details?id=com.cogmento.app");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void clickPlaystore() {
		playstoreElements.Playstore.click();
	}


}
