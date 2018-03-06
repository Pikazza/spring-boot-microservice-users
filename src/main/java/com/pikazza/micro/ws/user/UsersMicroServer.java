package com.pikazza.micro.ws.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
public class UsersMicroServer {
	
	public static final String ORDERS_SERVICE_URL = "http://PIKAZZA-ORDERS-MICROSERVICE";
	
	public static void main(String[] args) {
		SpringApplication.run(UsersMicroServer.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public OrdersRemoteRepository ordersRemoteRepository(){
		return new OrdersRemoteRepository(ORDERS_SERVICE_URL);
	}

}
