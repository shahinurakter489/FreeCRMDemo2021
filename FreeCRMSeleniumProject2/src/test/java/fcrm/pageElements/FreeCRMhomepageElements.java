package fcrm.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FreeCRMhomepageElements {
@FindBy(xpath = " //body[1]/div[1]/header[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[2]")
public WebElement logoFree;
@FindBy(xpath =" //font[contains(text(),'crm')]")
public WebElement logocrm;
}
