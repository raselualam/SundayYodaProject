package bdd.newtours.PageActions;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import bdd.newtours.PageElements.NewtoursRegisterPageLocators;
import bdd.utilities.GenerateRandom;
import bdd.utilities.ReadExcelSheetData;
import bdd.utilities.SetupDrivers;

public class NewtoursRegisterPageActions {
	
	NewtoursRegisterPageLocators NewtoursRegisterPageLocatorsObj;
	
	public NewtoursRegisterPageActions(){
		NewtoursRegisterPageLocatorsObj = new NewtoursRegisterPageLocators();
		PageFactory.initElements(SetupDrivers.driver, NewtoursRegisterPageLocatorsObj);
	}

	public void fillContactInfo() throws Exception{
		NewtoursRegisterPageLocatorsObj.txtFirstName.clear();
		NewtoursRegisterPageLocatorsObj.txtFirstName.sendKeys(ReadExcelSheetData.getMapData("FirstName"));
		NewtoursRegisterPageLocatorsObj.txtLastName.clear();
		NewtoursRegisterPageLocatorsObj.txtLastName.sendKeys(ReadExcelSheetData.getMapData("LastName"));		
		NewtoursRegisterPageLocatorsObj.txtPhone.clear();
		NewtoursRegisterPageLocatorsObj.txtPhone.sendKeys(ReadExcelSheetData.getMapData("Phone"));
		NewtoursRegisterPageLocatorsObj.txtEmail.clear();
		NewtoursRegisterPageLocatorsObj.txtEmail.sendKeys(ReadExcelSheetData.getMapData("Email"));
	}

	
	public void fillMailingInfo() {
		NewtoursRegisterPageLocatorsObj.txtAddress.sendKeys(GenerateRandom.getString(10));
		NewtoursRegisterPageLocatorsObj.txtCity.sendKeys(GenerateRandom.getString(5));
		NewtoursRegisterPageLocatorsObj.txtStateProvince.sendKeys("Texas");
		NewtoursRegisterPageLocatorsObj.txtPostalCode.sendKeys("46363");
		
		//Drop Down 
		Select dropdown = new Select(NewtoursRegisterPageLocatorsObj.txtCountry);
		dropdown.selectByValue("UNITED STATES"); 
	}
	
	public void fillUserInfo(String UserName, String PassWord){
		NewtoursRegisterPageLocatorsObj.txtUserName.sendKeys(UserName);
		NewtoursRegisterPageLocatorsObj.txtPassword.sendKeys(PassWord);
		NewtoursRegisterPageLocatorsObj.txtConfirmPassword.sendKeys(PassWord);
		
	}
	
	public void submitRegForm() throws Exception{

		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(SetupDrivers.driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(NewtoursRegisterPageLocatorsObj.lnkSubmit));
		
		Thread.sleep(2000);

		NewtoursRegisterPageLocatorsObj.lnkSubmit.click();

	}
	
}
