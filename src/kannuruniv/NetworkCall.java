/*
 * NetworkCall class methods are being developed
 */
package kannuruniv;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @author Anjith Sasindran
 *
 */
public class NetworkCall {
	
	public void sendRequest(StudentDetails studentDetails, RequestUri requestUri) {
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost request = new HttpPost(requestUri.getUri());
		
	}
	
}
