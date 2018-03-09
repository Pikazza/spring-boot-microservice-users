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
	
	@Autowired
	UsersRepository usersRepository;

	public List<Users> getAllUsers() {
		 List<Users> users = usersRepository.findAll();
		return users;
	}

	public Users getUser(String id) {
		Users user = usersRepository.findOne(id);
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public List<Orders> getOrderByUserId(String id) {
		List<Orders> orders = ordersRemoteRepository.getOrderByUserId(id);
		return orders;
	}

	@Override
	public Users postUser(Users user) {
		Users ss = usersRepository.save(user);
		return ss;
	}

	@Override
	public Users putUser(Users user) {
		System.out.println("Pikazza userids "+ user.getUserId());
		Users us = usersRepository.findOne(user.getUserId());
		System.out.println("Pikazza userids "+ us.getUserId());
		us.setEmail(user.getEmail());
		us.setMobileNo(user.getMobileNo());
		us.setFirstName(user.getFirstName());
		us.setLastName(user.getLastName());
		// TODO Auto-generated method stub
		Users us1 = usersRepository.save(us);
		return us1;
	}

	
}
