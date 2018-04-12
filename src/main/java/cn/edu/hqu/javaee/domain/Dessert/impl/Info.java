package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.stereotype.Component;

@Component
public class Info {
	private String name="张三";
	private String location="KFC";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
