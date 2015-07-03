package com.acn.codedecodeservice.client;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import com.acn.schema.jaxb.request.Input;
import com.acn.schema.jaxb.request.Input.Categories;
import com.acn.schema.jaxb.request.ObjectFactory;
import com.acn.schema.jaxb.response.Output;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class CodeDecodeServiceUtil {
	public static void main(String[] args) {
		try {

			//Input st = new Input();
			Input st = new ObjectFactory().createInput();
			st.setCodetypename("Vehicle");
			List<String> value = new ArrayList<String>();
			value.add("Honda");
			Categories values = new Categories();
			values.getCategory().addAll(value);			
			st.setCategories(values);

			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:9080/CodeDecodeService/api/codeservice/CodeTypes/xml");

			ClientResponse response = webResource.accept("application/atom+xml")
					.post(ClientResponse.class,st);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			String output = response.getEntity(String.class);
			JAXBContext jc = JAXBContext.newInstance(Output.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			StreamSource streamSource = new StreamSource(new StringReader(output));
			JAXBElement<Output> je = unmarshaller.unmarshal(streamSource,Output.class);
			Output obj = (Output)je.getValue();


			System.out.println("Server response : \n");
			System.out.println(output);
			System.out.println(obj.getCDBeans().get(0).getDecodes());

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	public static Object getUnmarshalObject(String strType){
		
		System.out.println("in method");
		Input st = new ObjectFactory().createInput();
		st.setCodetypename("Airport");
		List<String> value = new ArrayList<String>();
		if(strType.equalsIgnoreCase("from"))
		{
			value.add("USA");
		}else if(strType.equalsIgnoreCase("to"))
		{
			value.add("UK");
		}
		Categories values = new Categories();
		values.getCategory().addAll(value);			
		st.setCategories(values);

		Client client = Client.create();

		WebResource webResource = client.resource("https://api.eu.apim.ibmcloud.com/bluemixacitgmailcom-dev/sb/codesservice/CodeTypes/xml");

		ClientResponse response = webResource.accept("application/atom+xml")
				.post(ClientResponse.class,st);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}
		System.out.println("obj here:");
		String output = response.getEntity(String.class);
		JAXBContext jc;
		Output obj = null;
		try {
			jc = JAXBContext.newInstance(Output.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			StreamSource streamSource = new StreamSource(new StringReader(output));
			JAXBElement<Output> je = unmarshaller.unmarshal(streamSource,Output.class);
			obj = (Output)je.getValue();
			System.out.println("obj:"+obj.getCDBeans().get(0).getDecodes());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
}
