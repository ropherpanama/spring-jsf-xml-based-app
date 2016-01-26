package com.web.app.managed.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginManagedBean extends AncestralManagedBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
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
	
	public String validateUser() {
		if(username.equals("rosendo"))
			return "welcome";
		else {
			addWarnMessage("Oops!", "Combinacion username/password incorrecta");
			return "goout";
		}
	}

}
