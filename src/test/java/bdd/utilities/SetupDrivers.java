package bdd.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {
	
	public static WebDriver driver;

	
	public static void setupDriver() {

		WebDriverManager.chromedriver().browserVersion("85.0.4183.121").setup();
//    	System.setProperty("webdriver.chrome.driver", "C:/TTSoftware/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void tearDownDriver() {
		driver.quit();
	}
}
