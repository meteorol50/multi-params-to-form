package com.example.form;

import java.util.List;

import com.example.domain.Hobby2;

public class UserForm {
	private String name;
	private String email;
	private String password;
	/** 趣味のリスト　Hobby2の型で受け取る */
	private List<Hobby2> hobbies;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Hobby2> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<Hobby2> hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "UserForm [name=" + name + ", email=" + email + ", password=" + password + ", hobbies=" + hobbies + "]";
	}
}
