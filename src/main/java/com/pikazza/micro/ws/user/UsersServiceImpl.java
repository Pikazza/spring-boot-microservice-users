package com.pikazza.micro.ws.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	UsersStubRepository usersStubRepository;
	
	@Autowired
	OrdersRemoteRepository ordersRemoteRepository;

	public List<Users> getAllUsers() {
		 List<Users> users = usersStubRepository.getAllUsers();
		return users;
	}

	public Users getUser(String id) {
		Users user = usersStubRepository.getUser(id);
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public List<Orders> getOrderByUserId(String id) {
		List<Orders> orders = ordersRemoteRepository.getAllOrders();
		return orders;
	}

	
}
