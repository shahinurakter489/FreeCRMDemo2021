package fcrm.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMPageElements {
	
		@FindBy(xpath = " //a[contains(text(),'Free CRM')]")
		public WebElement freeCRM;
		@FindBy(xpath=" //a[contains(text(),'CRM for Any Business')]")
		public WebElement CRMforanyBussiness;
}
