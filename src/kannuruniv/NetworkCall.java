/*
 * Network call takes care of all HttpRequests. 
 * requestHallTicket method is used to download hall ticket
 * requestMarkList method is used to download mark list
 */
package kannuruniv;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
	
	public int requestHallTicket(HallTicket hallTicket, RequestUri requestUri)
			throws ClientProtocolException, IOException {
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost postRequest = new HttpPost(requestUri.getUri());

		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("login", hallTicket.getRegisterNo()));
		urlParameters.add(new BasicNameValuePair("dobd", hallTicket.getBirthDay()));
		urlParameters.add(new BasicNameValuePair("dobm", hallTicket.getBirthMonth()));
		urlParameters.add(new BasicNameValuePair("doby", hallTicket.getBirthYear()));
		
		postRequest.setEntity(new UrlEncodedFormEntity(urlParameters));
		HttpResponse response = client.execute(postRequest);
		
		if (response.getStatusLine().getStatusCode() != 200) {
			return 0;
		}
		
		saveFileToDisk(response, "Hallticket " + hallTicket.getRegisterNo()+".pdf");
		
		return response.getStatusLine().getStatusCode();
	}
	
	public int requestMarkList(MarkList markList, RequestUri requestUri)
			throws IllegalStateException, IOException {
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpPost postRequest = new HttpPost(requestUri.getUri());

		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
		urlParameters.add(new BasicNameValuePair("regno", markList.getRegisterNo()));
		urlParameters.add(new BasicNameValuePair("type", markList.getExamType()));
		
		postRequest.setEntity(new UrlEncodedFormEntity(urlParameters));
		HttpResponse response = client.execute(postRequest);
		
		if (response.getStatusLine().getStatusCode() != 200) {
			return 0;
		}
		
		saveFileToDisk(response, "Result " + markList.getRegisterNo()+".pdf");
		
		return response.getStatusLine().getStatusCode();
	}
	
	public void saveFileToDisk(HttpResponse response, String fileDirectory)
			throws IllegalStateException, IOException {
		
		InputStream fromResponse = response.getEntity().getContent();
		OutputStream toDisk = new FileOutputStream(fileDirectory);
		int length;
		byte b[] = new byte[1024];
		
		while((length = fromResponse.read(b))!=-1) {
			toDisk.write(b, 0, length);
		}
		
		fromResponse.close();
		toDisk.close();		
	}
	
}
