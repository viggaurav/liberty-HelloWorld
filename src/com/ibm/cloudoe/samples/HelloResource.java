package com.ibm.cloudoe.samples;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


@Path("/hello")
public class HelloResource {


	@GET
	public void getInformation() {

		// 'VCAP_APPLICATION' is in JSON format, it contains useful information about a deployed application
		// String envApp = System.getenv("VCAP_APPLICATION");

		// 'VCAP_SERVICES' contains all the credentials of services bound to this application.
		// String envServices = System.getenv("VCAP_SERVICES");
		// JSONObject sysEnv = new JSONObject(System.getenv());
		
		try
	    {

	    	System.out.println("Post parameters : ");
	    	DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

	        // root elements
	        Document doc = docBuilder.newDocument();
	        Element rootElement = doc.createElement("Input");
	        doc.appendChild(rootElement);

	        // staff elements
	        Element categories = doc.createElement("categories");
	        rootElement.appendChild(categories);

	        // set attribute to staff element

	        // firstname elements
	        Element category = doc.createElement("category");
	        category.appendChild(doc.createTextNode("USA"));
	        categories.appendChild(category);

	        // lastname elements
	        Element codetypename = doc.createElement("codetypename");
	        codetypename.appendChild(doc.createTextNode("Airport"));
	        rootElement.appendChild(codetypename);
			System.out.println("Doc: "+doc.getNodeValue());
			/*TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			//StreamResult result = new StreamResult(new File("C:\\file.xml"));
			StreamResult result1 = new StreamResult(System.out);
			transformer.transform(source, result1);*/
	    	
	    	String inputXML = "<Input><categories><category>USA</category></categories><codetypename>Airport</codetypename><index>0</index><effectivedate></effectivedate></Input>";
		String url = "https://api.eu.apim.ibmcloud.com/bluemixacitgmailcom-dev/sb/codesservice/CodeTypes/xml"; 

		System.out.println("Post parameters : "+url);
		  StringEntity entity = new StringEntity(inputXML, ContentType.create(
				    "application/xml", Consts.UTF_8));
				  entity.setChunked(true);
				  HttpPost httppost = new HttpPost(url);

				  httppost.setEntity(entity);
					System.out.println("Post parameters : here ");

				  HttpClient client = HttpClients.createDefault();
				  
				  HttpResponse response = client.execute(httppost);
				  System.out.println("\nSending 'POST' request to URL : " + url);
		    System.out.println("Post parameters : " + httppost.getEntity());
		    System.out.println("Response Code : " + 
		                                response.getStatusLine().getStatusCode());

		    BufferedReader rd = new BufferedReader(
		                    new InputStreamReader(response.getEntity().getContent()));

		    StringBuffer result = new StringBuffer();
		    String line = "";
		    while ((line = rd.readLine()) != null) {
		        result.append(line);
		    }

		    System.out.println(result.toString());
		    
	    java.net.URI location = new java.net.URI("/index.html");
	    Response.temporaryRedirect(location).build();
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	
		//return "Hi World!";

	}
}