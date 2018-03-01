package com.pikazza.micro.ws.user;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Users {

	long userId;
	
	public Users(long userId, String firstName, String lastName, String email, String mobileNo) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	
	String firstName;
	String lastName;
	String email;
	String mobileNo;
}
