package com.example.domain;

public class Hobby2 {
	private Integer hobbyId;
	private Integer value;
	public Integer getHobbyId() {
		return hobbyId;
	}
	public void setHobbyId(Integer id) {
		this.hobbyId = id;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Hobby2 [hobbyId=" + hobbyId + ", value=" + value + "]";
	}
}
