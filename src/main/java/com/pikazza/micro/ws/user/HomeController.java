package com.pikazza.micro.ws.user;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Path("/")
@Component
public class HomeController {

	@GET
	@Path("/info")
	//@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public String all() {
		return "{\"status\":\"true\",\"message\":\"Users Servcie is currently running\"}";
	}
}
