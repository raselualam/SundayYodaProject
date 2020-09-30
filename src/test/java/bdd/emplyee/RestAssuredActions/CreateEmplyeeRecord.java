package bdd.emplyee.RestAssuredActions;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateEmplyeeRecord {
	
	public void CreateEmplyeeRecordReturnOk(){
		Response resp = RestAssured.post("http://dummy.restapiexample.com/api/v1/employees");
		
		//todo Send Payload
		
		int code=resp.getStatusCode();
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 200);
	}
	
	public void CreateEmplyeeRecordReturnBadRequest(){
		Response resp = RestAssured.post("http://dummy.restapiexample.com/api/v1/employees");
		
		//todo Send wrong Payload
		
		int code=resp.getStatusCode();
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 400);
	}
	
	public void CreateEmplyeeRecordReturnNotFound(){
		Response resp = RestAssured.post("http://dummy.restapiexample.com/api/v1/employeesError");
	
		
		int code=resp.getStatusCode();
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 404);
	}
	
}