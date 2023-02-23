
import lombok.Getter;

@Getter
public class SearchResult {
	private final String title;
	
	private final String url;
	
	public SearchResult(String title, String url) {
		this.title = title;
		this.url=url;
	}
	

}
