package com.datatable;

public class Car {
	private String id;
	private String brand;
	private String color;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String id, String brand, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
