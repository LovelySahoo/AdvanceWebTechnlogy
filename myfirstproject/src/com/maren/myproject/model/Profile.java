//java package(lovely)
package com.maren.myproject.model;
//class profile(lovely)
    
public class Profile
 {
	//private access specifier so that it can be only accessed inside the same class(lovely)
	private String userid;

	private String name;

	private String email;

	private long mobile;
      	
	
	//deafault contsructor(lovely)
public Profile() {

	}
//copy constructor(lovely)
	public Profile(String userid, String name, String email, long mobile) {
//super keyword is the reference variable that is used to refer parent class objects(lovely)
		super();
//this keyword works as a refernce for the current object(lovely)
	this.userid = userid;

	this.name = name;
	
	this.email = email;

		this.mobile = mobile;
	
}
	//returns the value of variable userid(lovely)
	public String getUserid()
 {
		return userid;

	}
	//sets the value of userid(lovely)
	public void setUserid(String userid) {

		this.userid = userid;
	
	}
	//returns the value of variable name(lovely)
	public String getName() {
	
	return name;
	
	}
   //sets the value of name(lovely)
	public void setName(String name) {

		this.name = name;
	
}
    //returns the value of variable email(lovely)
	public String getEmail() {

	return email;

	}
    //sets the value of email(lovely)
	public void setEmail(String email) {

		this.email = email;
	}
	//return the value of variable mobile(lovely)
	public long getMobile() {
		return mobile;
	}
	//sets the value of variable mobile(lovely)
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
}

