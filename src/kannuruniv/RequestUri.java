/*
 * RequestUri stores the url of the form
 * It has a parseRequestUri to parse the URL to get
 * the form action url
 */
package kannuruniv;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

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
		this.uri = UrlParser.parse(uri.toString());
	}
}
