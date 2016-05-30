package com.example.restservicedemo.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rocket {
	
	private long id;
	private String mark;
	private String model;	
	private int price;
	
	public Rocket(long id, String mark, String model, int price) {
		super();
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.price = price;
	}
	
	public Rocket() {
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
