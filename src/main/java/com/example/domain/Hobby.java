package com.example.domain;

public class Hobby {
	private Integer id;
	private String name;
	public Hobby() {
	}
	public Hobby(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Hobby [id=" + id + ", name=" + name + "]";
	}
}
