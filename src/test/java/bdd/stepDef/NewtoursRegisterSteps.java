package bdd.stepDef;

import bdd.newtours.PageActions.NewtoursHomePageActions;
import bdd.newtours.PageActions.NewtoursRegisterConfPageAction;
import bdd.newtours.PageActions.NewtoursRegisterPageActions;
import bdd.usps.PageActions.UspsDraft;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewtoursRegisterSteps {
	
	NewtoursHomePageActions NewtoursHomePageActionsObj = new NewtoursHomePageActions();
	NewtoursRegisterPageActions NewtoursRegisterPageActionsObj = new NewtoursRegisterPageActions();
	NewtoursRegisterConfPageAction NewtoursRegisterConfPageActionObj = new NewtoursRegisterConfPageAction();
	UspsDraft UspsHomePageActionsObj = new UspsDraft();
	

	@Given("^Browse to Newtours homepage$")
	public void browse_to_Newtours_homepage() throws Throwable {
		NewtoursHomePageActionsObj.loadNewtourHomepage();
	}

	@When("^Navigate to Register page$")
	public void navigate_to_Register_page() throws Throwable {
		NewtoursHomePageActionsObj.navigateRegisterPage();
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {
		NewtoursRegisterPageActionsObj.adpopup();
		NewtoursRegisterPageActionsObj.fillContactInfo();
		NewtoursRegisterPageActionsObj.fillMailingInfo();
	}

	@When("^Complete creating account \"([^\"]*)\" with \"([^\"]*)\"$")
	public void complete_creating_account_with(String UserName, String PassWord) throws Throwable {
		NewtoursRegisterPageActionsObj.fillUserInfo(UserName, PassWord);
		NewtoursRegisterPageActionsObj.submitRegForm();
	}

	@Then("^Verify account created successfully$")
	public void verify_account_created_successfully() throws Throwable {
		NewtoursRegisterConfPageActionObj.VerifyConfirmationPage();
//		UspsHomePageActionsObj.practiceHoverOver();
	}
	
}
