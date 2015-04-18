/**
 * Example program to download mark list from kannur-university website
 */
package example;

import java.io.IOException;
import java.net.URISyntaxException;

import kannuruniv.MarkList;
import kannuruniv.NetworkCall;
import kannuruniv.RequestUri;

/**
 * @author Anjith Sasindran
 *
 */
public class Example {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws URISyntaxException, IOException {
		// TODO Auto-generated method stub
		MarkList markList = new MarkList("B1ENCS5106", "R");
		RequestUri uri = new RequestUri("http://14.139.185.42/kannur/assistant/btech7Result112014ren/btech7th.php");
		uri.parseRequestUri();
		
		NetworkCall call = new NetworkCall();
		
		if (call.requestMarkList(markList, uri) > 0) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
		}
	}

}
