package kannuruniv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;

/**
 * @author Anjith Sasindran
 *
 */
public class NetworkCall {
	
	public void sendRequest(StudentDetails studentDetails, RequestUri requestUri) throws ClientProtocolException, IOException {
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost postRequest = new HttpPost(requestUri.getUri());

		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("login", studentDetails.getRegisterNo()));
		urlParameters.add(new BasicNameValuePair("dobd", studentDetails.getBirthDay()));
		urlParameters.add(new BasicNameValuePair("dobm", studentDetails.getBirthMonth()));
		urlParameters.add(new BasicNameValuePair("doby", studentDetails.getBirthYear()));
		
		postRequest.setEntity(new UrlEncodedFormEntity(urlParameters));
		HttpResponse response = client.execute(postRequest);
		
		System.out.println("Response Code: " + response.getStatusLine());
		
	}
	
}
