package bdd.utilities;

import cucumber.api.java.After;

public class AfterActions {
	
	@After
	public void afterAction(){
		SetupDrivers.tearDownDriver();
		System.out.println("----- Test Completed");
	}

}
