/*
 * Tester class is used only for testing purpose
 */

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;

import kannuruniv.NetworkCall;
import kannuruniv.RequestUri;
import kannuruniv.StudentDetails;

public class Tester {
	static String URI = "http://14.139.185.42/kannur/assistant/online/btech8regular2015/hallticket8.php";
	
	public static void main(String args[]) throws URISyntaxException, ClientProtocolException, IOException {
		
		StudentDetails profile = new StudentDetails("B1ENCS5106", "28", "8", "1993");
		RequestUri uri = new RequestUri(URI);
		NetworkCall call = new NetworkCall();
		call.sendRequest(profile, uri);
		
	}

}
