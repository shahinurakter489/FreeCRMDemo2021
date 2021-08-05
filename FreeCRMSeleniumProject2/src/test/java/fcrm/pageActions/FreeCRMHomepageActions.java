package fcrm.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fcrm.pageElements.FreeCRMhomepageElements;
import freeCRM.utilities.DriverSetUp;


public class FreeCRMHomepageActions {
	FreeCRMhomepageElements freeCRMhomepageElements;
	
	
	public FreeCRMHomepageActions() {
		this.freeCRMhomepageElements = new FreeCRMhomepageElements();
		PageFactory.initElements(DriverSetUp.chromeDriver, freeCRMhomepageElements);
	}
	
	
	
	public void getFreeCRMHomepage() {
		DriverSetUp.chromeDriver.get("https://www.freecrm.com/index.html");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		DriverSetUp.chromeDriver.close();
	
	}
	
	public void selectFreeLogo() {
		freeCRMhomepageElements.logocrm.click();
	}
	
	public void selectLogocrm() {
		freeCRMhomepageElements.logocrm.click();
	}
	
	
}
