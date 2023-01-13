package com.example.Cdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cdemo {
	private int id;
	private String name;
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
		return "Cdemo [id=" + id + ", name=" + name + "]";
	}
	

}
