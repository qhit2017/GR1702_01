package com.qhit;

public class Commodity {
	
	private String number;//���
	private String name;//����
	private double price;//�۸�
	private int quantity;//����
	
	
	public Commodity(String number, String name, double price, int quantity) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Commodity [number=" + number + ", name=" + name + ", price="
				+ price + ", quantity=" + quantity + "]";
	}
	
	
	
}
