package com.pikazza.micro.ws.user;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;



@Path("/v1.0")
@Controller
public class UsersController {
	
	private Logger logger = Logger
			.getLogger(this.getClass().getName());
	
	@Autowired
	private UsersService usersService;
	
	@GET
	@Path("/users")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//@RequestMapping("/users")
	public List<Users> all() {
		logger.info("accounts-microservice all() invoked");
		List<Users> users = usersService.getAllUsers();
		logger.info("accounts-microservice all() found: " + users.size());
		return users;
	}
	
	@GET
	@Path("/users/{id}")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//@RequestMapping("/users/{id}")
	public Users byId(@PathParam("id") String id) {
		logger.info("accounts-microservice byId() invoked: " + id);
		Users user = usersService.getUser(id);
		logger.info("accounts-microservice byId() found: " + user);
		return user;
	}
	
	@GET
	@Path("/users/{id}/orders")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	//@RequestMapping("/users/{id}")
	public List<Orders> getOrderByUserId(@PathParam("id") String id) {
		logger.info("accounts-microservice byId() invoked: " + id);
		List<Orders> orders = usersService.getOrderByUserId(id);
		logger.info("accounts-microservice byId() found: " + orders);
		return orders;
	}
}
