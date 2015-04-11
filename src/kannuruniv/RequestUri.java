package kannuruniv;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * @author Anjith Sasindran
 *
 */
public class RequestUri {
	private URI uri;
	
	/**
	 * @param uri
	 */
	public RequestUri(URI uri) {
		this.uri = uri;
	}
	
	public RequestUri(String uri) throws URISyntaxException {
		this.uri = new URI(uri);
	}

	public URI getUri() {
		return uri;
	}

	public void setUri(URI uri) {
		this.uri = uri;
	}
	
	public void setUri(String uri) throws URISyntaxException {
		this.uri = new URI(uri);
	}
	
	public void parseRequestUri() throws IOException, URISyntaxException {
		
		Document htmlPage = Jsoup.connect(uri.toString()).get();
		Element form = htmlPage.select("form").first();
		String phpFile = form.attr("action");
		
		int lastIndex = uri.toString().lastIndexOf("/");
		this.uri = new URI(uri.toString().substring(0, lastIndex+1)+phpFile);
	}
}
