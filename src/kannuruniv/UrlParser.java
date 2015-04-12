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
public class UrlParser {
	
	public static URI parse(String url) throws IOException, URISyntaxException {
		Document htmlPage = Jsoup.connect(url).get();
		Element form = htmlPage.select("form").first();
		String phpFormAction = form.attr("action");
		
		int lastIndex = url.toString().lastIndexOf("/");
		URI uri = new URI(url.toString().substring(0, lastIndex+1)+phpFormAction);
		return uri;
	}
	
}
