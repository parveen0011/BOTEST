package com.testautomationclass.testNG.java;

import static io.restassured.RestAssured.given;

import org.hamcrest.core.Is;
import org.testng.annotations.Test;

import static  org.hamcrest.Matcher.*;

import io.restassured.RestAssured;

public class StudentAPIAutomation {

	@Test(enabled = true)
	public  void GetStudentAPI() {
		
		RestAssured.baseURI="http://localhost:8080/";
		given().log().all().header("Content-Type","application/json")
		.when().post("fetchStudents")
		.then().log().all().assertThat().statusCode(200);
		

	}
	@Test(enabled = true)
	public void PostStudentAPI(){
		RestAssured.baseURI="http://localhost:8080/";
		given().log().all().header("Content-Type","application/json")
		.body("{\r\n"+
		 "  \"id\": \" 4 \",\r\n"+
		 "  \"firstName\": \"TestFirstName\",\r\n"  +
		 "  \"lastName\": \"TestLastName\",\r\n" +
		 "  \"class_\": \"E\",\r\n" +
		 "  \"nationality\": \"India\" [\r\n" +
		 "  }\r\n"+ 
		 "").when().post("addStudent")
		.then().log().all().assertThat().statusCode(200);

	}
	@Test(enabled = true)
	public void PutStudentAPI(){
		RestAssured.baseURI="http://localhost:8080/";
		given().log().all().header("Content-Type","application/json")
		.body("{\r\n"+
		 "  \"id\": \" 3 \",\r\n"+
		 "  \"firstName\": \"TestFirstName\",\r\n"  +
		 "  \"lastName\": \"TestLastName\",\r\n" +
		 "  \"class_\": \"C\",\r\n" +
		 "  \"nationality\": \"India\" [\r\n" +
		 "  }\r\n"+ 
		 "").when().put("updateStudent/id=3")
		.then().log().all().assertThat().statusCode(200);

	}
	
	@Test(enabled = true)
	public void DeleteStudentAPI(){
		RestAssured.baseURI="http://localhost:8080/";
		given().log().all().header("Content-Type","application/json")
		.when().delete("deleteStudent/id=3")
		.then().log().all().assertThat().statusCode(200);

	}
	

}
