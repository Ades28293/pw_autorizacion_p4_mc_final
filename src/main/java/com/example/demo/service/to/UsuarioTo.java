package com.example.demo.service.to;

import java.io.Serializable;


public class UsuarioTo implements Serializable{

	private static final long serialVersionUID = 1L;

	private String username;

	private String password;

	//SET y GET

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
