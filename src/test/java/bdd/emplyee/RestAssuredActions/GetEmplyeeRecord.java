package bdd.emplyee.RestAssuredActions;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetEmplyeeRecord {
	
	public void GetByIdEmplyeeRecordReturnOk(){
		Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees/5");
		
		int code=resp.getStatusCode();
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 200);
	}
	
	public void GetByIdEmplyeeRecordReturnBadRequest(){
		Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees/0");
		
		int code=resp.getStatusCode();
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 400);
	}
	
	public void GetByIdEmplyeeRecordReturnNotFound(){
		Response resp = RestAssured.get("http://dummy.restapiexample.com/api/v1/employees/5/Error");
		
		int code=resp.getStatusCode();
		
		String response =resp.asString();
		
		System.out.println("Status Code : "+code);
		System.out.println("Response Body : "+response);

		Assert.assertEquals(code, 404);
	}
	
}