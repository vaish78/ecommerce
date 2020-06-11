package com.myapp.webapp.models;

public class Product {
	private String prod_id;
	private String prod_name;
	private String prod_description;
	private double price;
	
	
	
	public Product(String prod_id, String prod_name, String prod_description, double price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_description = prod_description;
		this.price = price;
	}
	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_description() {
		return prod_description;
	}
	public void setProd_description(String prod_description) {
		this.prod_description = prod_description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
