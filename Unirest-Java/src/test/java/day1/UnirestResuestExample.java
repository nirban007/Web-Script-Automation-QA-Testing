package day1;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestResuestExample {
	
	public void getRequest() throws UnirestException {
		
		HttpResponse<JsonNode> jsonResponse= 
				Unirest.get("https://reqres.in/api/users/2").asJson();
		System.out.println("Get Request:");
		System.out.println("Status code:"+jsonResponse.getStatus());
		System.out.println("Status Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
	}
	public void postRequest() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse= Unirest.post("https://reqres.in/api/users").
		body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\",\r\n"
				+ "    \"id\": \"764\",\r\n"
				+ "    \"createdAt\": \"2023-02-15T19:24:47.776Z\"\r\n"
				+ "}").asJson();
		System.out.println("Post Request:");
		System.out.println("Status code:"+jsonResponse.getStatus());
		System.out.println("Status Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
	}
	
	public void updateRequest() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse= Unirest.post("https://reqres.in/api/users/2").
		body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\",\r\n"
				+ "    \"updatedAt\": \"2023-02-15T19:37:54.449Z\"\r\n"
				+ "}").asJson();
		System.out.println("Update Request:");
		System.out.println("Status code:"+jsonResponse.getStatus());
		System.out.println("Status Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
	}
	
	public void deleteRequest() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse= 
				Unirest.get("https://reqres.in/api/users/2").asJson();
		
		System.out.println("Delete Request:");
		System.out.println("Status code:"+jsonResponse.getStatus());
		System.out.println("Status Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
		
	}
	
	public void postLoginRequest() throws UnirestException {
		HttpResponse<JsonNode> jsonResponse= Unirest.post("https://reqres.in/api/login").
		body("{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"cityslicka\"\r\n"
				+ "}").asJson();
		System.out.println("Login Request:");
		System.out.println("Status code:"+jsonResponse.getStatus());
		System.out.println("Status Message:"+jsonResponse.getStatusText());
		System.out.println("Response Body:"+jsonResponse.getBody());
		
	}
	
	
	
	
	
	
	public static void main(String[] args) throws UnirestException{
		UnirestResuestExample example = new UnirestResuestExample();
		example.getRequest();
		example.postRequest();
		example.updateRequest();
		example.deleteRequest();
		example.postLoginRequest();
	}

}

