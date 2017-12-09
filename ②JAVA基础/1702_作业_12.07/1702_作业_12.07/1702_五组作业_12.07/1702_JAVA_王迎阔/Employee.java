package com.wyk;
/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Employee {

	private String id;
	private String name;
	private Double price;
	private Double quantity;
	
	
	
	/**
	 * 
	 */
	public Employee() {
		super();
	}



	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public Employee(String id, String name, Double price, Double quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Double getQuantity() {
		return quantity;
	}



	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	
}
