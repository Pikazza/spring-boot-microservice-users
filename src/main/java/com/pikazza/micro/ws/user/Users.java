package com.pikazza.micro.ws.user;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Users {
	
	@Id
	String userId;
	String firstName;
	String lastName;
	String email;
	String mobileNo;
	String role;
	
	public Users(){
		
	}
	
	public Users(String userId, String firstName, String lastName, String email, String mobileNo) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	
}
