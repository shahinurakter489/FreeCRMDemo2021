package fcrm.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fcrm.pageElements.FreeCRMPageElements;
import freeCRM.utilities.DriverSetUp;


public class FreeCRMPageActions {
	FreeCRMPageElements freeCRMPageElements;
	
public 	FreeCRMPageActions() {
	this.freeCRMPageElements = new FreeCRMPageElements();
	PageFactory.initElements(DriverSetUp.chromeDriver, freeCRMPageElements);
}
public void getFreeCRMpage() {
	DriverSetUp.chromeDriver.get("https://www.freecrm.com/index.html");
	DriverSetUp.chromeDriver.manage().window().maximize();
	DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	DriverSetUp.chromeDriver.close();


}
public void selectFreeCRMforanyBussiness() {
	freeCRMPageElements.CRMforanyBussiness.click();
}

public void selectFreeCRM() {
	freeCRMPageElements.freeCRM.click();
}
}
	

