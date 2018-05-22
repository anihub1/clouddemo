package com.nisum.demo.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long userId;
	private String userName;
	private String role;
	
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId() {
		this.userId=userId;
	}
	
	public String getUserName() {
		return this.userName;
	}
	public void setUserName() {
		this.userName=userName;
	}
   public String getRole() {
	   return this.role;
   }
   public void setRole() {
	   this.role=role;
	   
   }
}
