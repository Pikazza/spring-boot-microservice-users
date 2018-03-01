package com.pikazza.micro.ws.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * @author Dinesh.Rajput
 *
 */
@Repository
public class UsersStubRepository{
	
	private Map<String, Users> usersByNumber = new HashMap<String, Users>();
	
	public UsersStubRepository() {
		Users user = new Users(1l, "Pikazza" , "Mathi", "pika@zza.com","7373478346");
		usersByNumber.put("1", user);
		user = new Users(2l, "Karan" , "pika", "karan@zza.com","73734783461");
		usersByNumber.put("2", user);
		Logger.getLogger(UsersStubRepository.class).info("Created StubAccountRepository");
	}
	
	public List<Users> getAllUsers() {
		return new ArrayList<Users>(usersByNumber.values());
	}


	public Users getUser(String number) {
		return usersByNumber.get(number);
	}

}
