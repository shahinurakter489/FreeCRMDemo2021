package fcrm.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import fcrm.pageElements.FreeCRMPricingElements;
import freeCRM.utilities.DriverSetUp;

public class FreeCRMPricingPageActions {

	FreeCRMPricingElements pricingElements;

	public FreeCRMPricingPageActions() {

		this.pricingElements = new FreeCRMPricingElements();

		// initElements(WebDriver driver, Object page)
		PageFactory.initElements(DriverSetUp.chromeDriver, pricingElements);

	}

	public void getFreeCRMPricingPage() {
		DriverSetUp.chromeDriver.get("https://freecrm.com/pricing_us.html");
		DriverSetUp.chromeDriver.manage().window().maximize();
		DriverSetUp.chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void clickPricingPage() {
		pricingElements.Pricing.click();
	}
}
