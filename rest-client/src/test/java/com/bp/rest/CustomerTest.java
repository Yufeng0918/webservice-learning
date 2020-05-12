package com.bp.rest;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;


public class CustomerTest {

	@Test
	public void testGetCustomerById() throws Exception {

		URL url = new URL("http://localhost:8080/customerservice/customer/1");
		InputStream in = url.openStream();
		System.out.println(getStringFromInputStream(in));
	}

	@Test
	public void testGetOrderById() throws Exception {

		URL url = new URL("http://localhost:8080/customerservice/order/5");
		InputStream in = url.openStream();
		System.out.println(getStringFromInputStream(in));
	}

	@Test
	public void testPutCustomer() throws Exception {

		File input = new File( "src" + File.separator + "test" + File.separator + "resources" + File.separator + "update_customer.xml");

		HttpPut put = new HttpPut(
				"http://localhost:8080/customerservice/customers");
		HttpEntity entity = new FileEntity(input, ContentType.APPLICATION_XML);
		put.setEntity(entity);

		HttpClient httpClient = new DefaultHttpClient();
		HttpResponse response = httpClient.execute(put);

		System.out.println("code: " + response.getStatusLine().getStatusCode());
//		System.out.println(EntityUtils.toString(response.getEntity()));
		put.releaseConnection();
	}

	@Test
	public void testPostCustomer() throws Exception {

		File input = new File( "src" + File.separator + "test" + File.separator + "resources" + File.separator + "add_customer.xml");
		System.out.println(input.getAbsoluteFile());

		HttpPost post = new HttpPost(
				"http://localhost:8080/customerservice/customers");
		post.addHeader("Accept", "application/xml");

		HttpEntity entity = new FileEntity(input, ContentType.APPLICATION_XML);
		post.setEntity(entity);

		HttpClient httpClient = new DefaultHttpClient();
		HttpResponse response = httpClient.execute(post);

		System.out.println("code: " + response.getStatusLine().getStatusCode());
		System.out.println(EntityUtils.toString(response.getEntity()));
		post.releaseConnection();
	}

	
	@Test
	public void testDeleteCustomer() throws Exception {

		HttpDelete delete = new HttpDelete(
				"http://localhost:8080/customerservice/customers/1");

		HttpClient httpClient = new DefaultHttpClient();
		HttpResponse response = httpClient.execute(delete);

		System.out.println("code: " + response.getStatusLine().getStatusCode());
//		System.out.println(EntityUtils.toString(response.getEntity()));
		delete.releaseConnection();
	}

	private static String getStringFromInputStream(InputStream in)
			throws Exception {
		CachedOutputStream cos = new CachedOutputStream();
		IOUtils.copy(in, cos);
		in.close();
		cos.close();
		return cos.getOut().toString();
	}

}
