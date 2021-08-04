package freeCRM.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {
public static WebDriver chromeDriver= null;
public static void setupChromeDriver() {
	WebDriverManager.chromedriver().setup();
	chromeDriver = new ChromeDriver();
} 
public static void quiteChromeDriver() {
	chromeDriver.quit();
}
}
