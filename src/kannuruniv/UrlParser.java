/*
 * UrlParser has a static parse method which takes a url of String type,
 * parses the input url using Jsoup, gets form request URL(form action)
 * and returns the request URL as an object of URI
 */
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
public abstract class UrlParser {
	
	public static URI parse(String url) throws IOException, URISyntaxException {
		Document htmlPage = Jsoup.connect(url).get();
		Element form = htmlPage.select("form").first();
		String phpFormAction = form.attr("action");
		
		/*
		 * phpFormAction is the form action which is absolute link
		 * lastIndex calculates the last occurance of "/" and replaces
		 * the rest of the characters with the form action
		 */
		int lastIndex = url.toString().lastIndexOf("/");
		URI uri = new URI(url.toString().substring(0, lastIndex+1)+phpFormAction);
		return uri;
	}
	
}
