package bdd.newtours.PageActions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import bdd.newtours.PageElements.NewtoursRegisterConfPageLocators;
import bdd.utilities.SetupDrivers;

public class NewtoursRegisterConfPageAction {

	
	NewtoursRegisterConfPageLocators NewToursConfirmPageLocatorObj;

	public NewtoursRegisterConfPageAction(){
		NewToursConfirmPageLocatorObj = new NewtoursRegisterConfPageLocators();
		PageFactory.initElements(SetupDrivers.driver, NewToursConfirmPageLocatorObj);

	}

	public void VerifyConfirmationPage() throws Exception{
		String confirmMsg = NewToursConfirmPageLocatorObj.txtThankYou.getText();
		Assert.assertEquals(confirmMsg, "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
		
		// Take a Screenshot
		File screenshot = ((TakesScreenshot)SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\TTSoftware\\ScreenShot\\Screenshot.jpg"));

	}


	
	
}
