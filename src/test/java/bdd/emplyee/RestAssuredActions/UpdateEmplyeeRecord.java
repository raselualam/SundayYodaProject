package bdd.emplyee.RestAssuredActions;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdateEmplyeeRecord {
	
	public void UpdateEmplyeeRecordReturnOk(){
		Response resp = RestAssured.put("http://dummy.restapiexample.com/api/v1/employees");
		
		int code=resp.getStatusCode();
		
		//todo send update request payload
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 200);
	}
	
	public void UpdateEmplyeeRecordReturnBadRequest(){
		Response resp = RestAssured.put("http://dummy.restapiexample.com/api/v1/employees");
		
		int code=resp.getStatusCode();
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 400);
	}
	
	public void GetAllEmplyeeRecordReturnNotFound(){
		Response resp = RestAssured.put("http://dummy.restapiexample.com/api/v1/employees");
		
		int code=resp.getStatusCode();
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 404);
	}
	
}