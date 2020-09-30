package bdd.stepDef;

import bdd.emplyee.RestAssuredActions.CreateEmplyeeRecord;
import bdd.emplyee.RestAssuredActions.DeleteEmplyeeRecord;
import bdd.emplyee.RestAssuredActions.GetAllEmplyeeRecord;
import bdd.emplyee.RestAssuredActions.GetEmplyeeRecord;
import bdd.emplyee.RestAssuredActions.UpdateEmplyeeRecord;
import bdd.newtours.PageActions.NewtoursHomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApiTestingSteps {
	
	GetAllEmplyeeRecord GetAllEmplyeeRecordActions = new GetAllEmplyeeRecord();
	CreateEmplyeeRecord CreateEmplyeeRecordActions = new CreateEmplyeeRecord();
	UpdateEmplyeeRecord UpdateEmplyeeRecordActions = new UpdateEmplyeeRecord();
	GetEmplyeeRecord GetEmplyeeRecordActions = new GetEmplyeeRecord();
	DeleteEmplyeeRecord DeleteEmplyeeRecordActions = new DeleteEmplyeeRecord();

	int EmployeeId;
	
	@Given("^Create new employee record \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" in database$")
	public void create_new_employee_record_and_in_database(String arg1, String arg2, String arg3) throws Throwable {
		//to do
		//CreateEmplyeeRecordActions.CreateEmplyeeRecordReturnOk();
	}

	@Given("^Update an employee Salary with \"([^\"]*)\"$")
	public void update_an_employee_Salary_with(String arg1) throws Throwable {
		//to do
		//UpdateEmplyeeRecordActions.UpdateEmplyeeRecordReturnOk();
	}

	@When("^Get all employee data$")
	public void get_all_employee_data() throws Throwable {
		GetAllEmplyeeRecordActions.GetAllEmplyeeRecordReturnOk();
	}

	@When("^Get a single employee data by id$")
	public void get_a_single_employee_data_by_id() throws Throwable {
		//GetEmplyeeRecordActions.GetByIdEmplyeeRecordReturnOk();
	}

	@Then("^Delete an employee record$")
	public void delete_an_employee_record() throws Throwable {
		//DeleteEmplyeeRecordActions.DeleteEmplyeeRecordReturnOk();
	}
}
