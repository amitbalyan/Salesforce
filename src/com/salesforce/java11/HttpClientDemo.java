/**
 * 
 */
package com.salesforce.java11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.xml.crypto.URIReferenceException;

/**
 * @author Dell
 *
 */
public class HttpClientDemo {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws URIReferenceException, URISyntaxException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		String url="https://www.google.com";
		HttpClient httpClient=HttpClient.newHttpClient();
		
		HttpRequest httpRequest=HttpRequest.newBuilder(new URI(url)).GET().build();
		  
		  HttpResponse httpResponse=httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());
		 
		   System.out.println("Request:---->" +httpRequest);
		   System.out.println("Responce--->" +httpResponse.body());
		
	
	}

}
