package com.ed.util;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
/**
 * httpclient工具类
 * @author yaoli
 *
 */
public class HttpClientUtil {
	static CloseableHttpClient client = null;
	static {
		client = HttpClients.createDefault();
	}
  

	/**
	 * get 请求  带参数 
	 * @param url
	 * @param params  
	 * @return
	 * @throws Exception
	 */
    public static String get(String url,HashMap<String, Object> params) throws Exception {
		HttpGet httpGet = new HttpGet();
		Set<String> keySet = params.keySet();
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(url).append("?t=").append(System.currentTimeMillis());
		for (String key : keySet) {
			stringBuffer.append("&").append(key).append("=").append(params.get(key));
		}
		httpGet.setURI(new URI(stringBuffer.toString()));
		CloseableHttpResponse execute = client.execute(httpGet);
		int statusCode = execute.getStatusLine().getStatusCode();
		if (200 != statusCode) {
			return "";
		}
		return EntityUtils.toString(execute.getEntity(), "utf-8");
	}
    /**
     *  post 请求  带 头部信息  和  参数请求
     * @param url
     * @param params
     * @param headers
     * @return
     * @throws Exception
     */
	public static String post(String url,HashMap<String, Object> params,HashMap<String, Object> headers) throws Exception {
		HttpPost httpPost = new HttpPost();
		Set<String> keySet2 = headers.keySet();
		Iterator<String> iterator = keySet2.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = headers.get(key).toString();
			httpPost.addHeader(key, value);
		}
	
		httpPost.setURI(new URI(url));
		List<NameValuePair> parameters = new ArrayList<NameValuePair>();
		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			NameValuePair e = new BasicNameValuePair(key, params.get(key).toString());
			parameters.add(e);
		}
		HttpEntity entity = new UrlEncodedFormEntity(parameters , "utf-8");
		httpPost.setEntity(entity );
		CloseableHttpResponse execute = client.execute(httpPost);
		int statusCode = execute.getStatusLine().getStatusCode();
		if (200 != statusCode) {
			return "";
		}
		return EntityUtils.toString(execute.getEntity(), "utf-8");
	}
    
	/**
	 * post 请求  带body 参数
	 * @param url
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static String post(String url,HashMap<String, Object> params) throws Exception {
		HttpPost httpPost = new HttpPost();
		httpPost.setURI(new URI(url));
		List<NameValuePair> parameters = new ArrayList<NameValuePair>();
		Set<String> keySet = params.keySet();
		for (String key : keySet) {
			NameValuePair e = new BasicNameValuePair(key, params.get(key).toString());
			parameters.add(e);
		}
		HttpEntity entity = new UrlEncodedFormEntity(parameters , "utf-8");
		httpPost.setEntity(entity );
		CloseableHttpResponse execute = client.execute(httpPost);
		int statusCode = execute.getStatusLine().getStatusCode();
		if (200 != statusCode) {
			return "";
		}
		return EntityUtils.toString(execute.getEntity(), "utf-8");
	}
	
	/**
	 * post 请求  带json 参数 
	 * @param url
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static String postJson(String url,HashMap<String, Object> params) throws Exception {
		HttpPost httpPost = new HttpPost();
		httpPost.setURI(new URI(url));
		String jsonString = JSON.toJSONString(params);
		StringEntity stringEntity = new StringEntity(jsonString,"utf-8");
		stringEntity.setContentEncoding("UTF-8");
		stringEntity.setContentType("application/json");//发送json数据需要设置contentType
		httpPost.setEntity(stringEntity);
		CloseableHttpResponse execute = client.execute(httpPost);
		int statusCode = execute.getStatusLine().getStatusCode();
		if (200 != statusCode) {
			return "";
		}
		return EntityUtils.toString(execute.getEntity(), "utf-8");
	}
	
	
    
}