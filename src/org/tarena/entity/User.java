package org.tarena.entity;

import java.io.Serializable;

public class User implements Serializable {
	private String username;//与请求参数key一致
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
