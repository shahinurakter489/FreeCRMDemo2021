package fcrm.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fcrm.pageElements.FreeCRMAboutElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMAboutPageActions {

	FreeCRMAboutElements aboutElements;

	public FreeCRMAboutPageActions() {

		this.aboutElements = new FreeCRMAboutElements();

		// initElements(WebDriver driver, Object page)
		PageFactory.initElements(DriverSetUp.chromeDriver, aboutElements);

	}

	public void getfreeCRMAboutPage() {
		DriverSetUp.chromeDriver.get("https://freecrm.com/about.html");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void clickAboutButton() {
	  aboutElements.About.click();
		
	}
}
