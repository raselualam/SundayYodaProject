package bdd.newtours.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.newtours.PageElements.NewtoursHomePageLocators;
import bdd.utilities.SetupDrivers;

public class NewtoursHomePageActions {
	
	NewtoursHomePageLocators NewtoursHomePageLocatorsObj;
	
	public NewtoursHomePageActions(){
		NewtoursHomePageLocatorsObj = new NewtoursHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, NewtoursHomePageLocatorsObj);
	}

	public void loadNewtourHomepage(){
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("http://demo.guru99.com/test/newtours/index.php");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void navigateRegisterPage(){
		NewtoursHomePageLocatorsObj.lnkRegister.click();
	}
	
}