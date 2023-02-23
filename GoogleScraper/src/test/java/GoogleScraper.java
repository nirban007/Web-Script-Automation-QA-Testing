import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.swing.text.Element;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

//https://www.google.com/search?q=Nirban+Mitra+Joy
//Selector: yuRUbf a

public class GoogleScraper {
	public static final String USER_AGENT = "Mozilla/5.0 (Linux; Android 5.1; itel it1702 Build/LMY47D) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.89 Safari/537.36"
			+ "";


	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		final String query = "apple";
		
		final Document page = Jsoup.connect("https://google.com/search?q=" + URLEncoder.encode(query,"UTF-8")).userAgent("Crome").get();
		
		for (org.jsoup.nodes.Element searchResult : page.select("uEierd.v5yQqb a")) {
			final String title = searchResult.text();
			final String url = searchResult.attr("href");
			
			System.out.println(title + "=>" +url);
		}

	}

}
