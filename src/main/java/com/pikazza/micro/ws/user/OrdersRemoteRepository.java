package com.pikazza.micro.ws.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class OrdersRemoteRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public OrdersRemoteRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	public List<Orders> getAllOrders() {
		String url = serviceUrl+"/v1.0/orders";
		//List<Orders> orders
		//ResponseEntity<List<Orders>> responseEntity= restTemplate.getForEntity(url, List<Orders>.class);
		//return Arrays.asList(responseEntity.getBody());
		
		/*System.out.println("Pikazza URL "+ url);
		Orders[] orders = restTemplate.getForObject(url, Orders[].class);*/
		//return Arrays.asList(orders);
		
		ResponseEntity<Orders[]> responseEntity = restTemplate.getForEntity(url, Orders[].class);
		System.out.println("Pikazza Output "+ responseEntity.getBody());
		return Arrays.asList(responseEntity.getBody());
	}

}
