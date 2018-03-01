package com.pikazza.micro.ws.user;

import java.util.List;

public interface UsersService {

	List<Users> getAllUsers();

	Users getUser(String id);

	List<Orders> getOrderByUserId(String id);

}
