package com.ibm.cloudoe.samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.acn.codedecodeservice.client.CodeDecodeServiceUtil;
import com.acn.schema.jaxb.response.Output;

/**
 * Servlet implementation class InterceptRequestServlet
 */
@WebServlet("/InterceptRequestServlet")
public class InterceptRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public InterceptRequestServlet() {
        // TODO Auto-generated constructor stub
    	//doPost(request,response);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Output resObj = (Output)CodeDecodeServiceUtil.getUnmarshalObject("from");
		request.setAttribute("resObj", resObj);
		Output toResObj = (Output)CodeDecodeServiceUtil.getUnmarshalObject("to");
		request.setAttribute("toResObj", toResObj);

		RequestDispatcher rd = request.getRequestDispatcher("/Home.jsp");
    	rd.forward(request, response);
		
    	//String inputXML = "<Input><categories><category>USA</category></categories><codetypename>Airport</codetypename><index>0</index><effectivedate></effectivedate></Input>";
    	//String url = "https://api.eu.apim.ibmcloud.com/bluemixacitgmailcom-dev/sb/codesservice/CodeTypes/xml"; 

 /*   	try
    	{
    	System.out.println("Post parameters : "+url);
	  StringEntity entity = new StringEntity(inputXML, ContentType.create(
			    "application/xml", Consts.UTF_8));
			  entity.setChunked(true);
			  HttpPost httppost = new HttpPost(url);

			  httppost.setEntity(entity);
				System.out.println("Post parameters : here ");

			  HttpClient client = HttpClients.createDefault();
			  
			  HttpResponse res = client.execute(httppost);
			  System.out.println("\nSending 'POST' request to URL : " + url);
	    System.out.println("Post parameters : " + httppost.getEntity());
	    System.out.println("Response Code : " + 
	    		res.getStatusLine().getStatusCode());

	    BufferedReader rd = new BufferedReader(
	                    new InputStreamReader(res.getEntity().getContent()));
	    
	    StringBuffer result = new StringBuffer();
	    String line = "";
	    while ((line = rd.readLine()) != null) {
	    	System.out.println("Line:"+line);
	        result.append(line);
	    }
	    
	    System.out.println(result.toString());
    }catch(Exception e)
    {
    	e.printStackTrace();
    }

    	RequestDispatcher rd = request.getRequestDispatcher("/index.html");
    	rd.forward(request, response);*/
	}
	
	

}
