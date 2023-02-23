import java.io.IOException;



import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;

public class JshupTest {

	public static void main(String[] args) throws IOException {
		final Document doc =Jsoup.connect("https://en.wikipedia.org/").get();
		
		final Elements newsHeadlines =doc.select("#mp-itn b a");
		
		for (Element headline : newsHeadlines) {
			System.out.println(headline.text());
		}
		System.out.println("\n\n-----------------------------\n\n");
		
		System.out.println(doc.outerHtml());
		
	}

}
