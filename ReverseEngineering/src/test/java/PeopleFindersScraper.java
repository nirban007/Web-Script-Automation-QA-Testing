import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.Unirest;


public class PeopleFindersScraper {
	final static String firstName = "Will";
	final static String lastName = "Smith";
	final static String city = "New Work";
	final static String state = "NA";
	

	public static void main(String[] args) throws Exception {
		final HttpResponse<String> response = Unirest.get("https://in.hotjar.com/api/v2/client/sites/2798290/visit-data?sv=6").
				queryString("FirstName", firstName).
				queryString("ln", lastName).
				queryString("LastName", lastName).
				queryString("city", city).
				queryString("state", state).asString();
		final Document htmlSnippet = (Document) Jsoup.parseBodyFragment(response.getBody());
		
		for(Element peopleResult : htmlSnippet.select("div.person-search-results > a.record > div.record__data > div.col-12")) {
			System.out.println(peopleResult.child(0).text());
			
		}
				

	}

}
