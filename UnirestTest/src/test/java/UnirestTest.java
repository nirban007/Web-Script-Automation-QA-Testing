
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.HttpRequest;

import org.apache.http.HttpHost;
import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.ObjectMapper;

public class UnirestTest {

	public static void main(String[] args) throws Exception {
//		Change the default user-agent header
//		Unirest.setDefaultHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36");
////		Use a proxy
//		Unirest.setProxy(new HttpHost("61.135.217.12",80));
//		
//		//Making a simple get request to httpbin.org
//		final HttpResponse<JsonNode> getResponse = Unirest.get("http://httpbin.org/get").queryString("limit",10).asJson();
//		System.out.println("IP-Address:" +getResponse.getBody().getObject().getString("origin"));
//		System.out.println("User-Agent" + getResponse.getBody().getObject().getJSONObject("headers").getString("User-Agent"));
//		
//		System.out.println("\n\n----------------\n\n");
//		//Make a post request with form data
		
		final HttpResponse<String>postResponseOne = Unirest.post("https://reqres.in/api/users").field("job","leader").asString();
		System.out.println(postResponseOne.getBody());
		
		System.out.println("\"\\n\\n----------------\\n\\n\"");
		
		//Make a post request with body data(Json)
		final JSONObject exampleJson = new JSONObject().put("createdAt", "2023-02-22T06:56:28.357Z");
		final HttpResponse<String>postResponseTwo = Unirest.post("https://reqres.in/api/users").body(exampleJson).asString();
		System.out.println(postResponseTwo.getBody());
		

	}

}
