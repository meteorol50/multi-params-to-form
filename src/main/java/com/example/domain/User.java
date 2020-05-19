package com.example.domain;

import java.util.List;

public class User {
	
	private String name;
	private Integer hobbyId;
	private Integer value;
	private List<String> hobbyList;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getHobbyList() {
		return hobbyList;
	}
	public void setHobbyList(List<String> hobbyList) {
		this.hobbyList = hobbyList;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", hobbyId=" + hobbyId + ", value=" + value + ", hobbyList=" + hobbyList + "]";
	}
	public Integer getHobbyId() {
		return hobbyId;
	}
	public void setHobbyId(Integer hobbyId) {
		this.hobbyId = hobbyId;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
}
