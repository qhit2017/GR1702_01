package com.qk;
/**制作者：陈亮亮
 *制作时间：2017年12月7日上午8:54:34
 *邮箱：2507147605@qq.com
 */
public class Commodity {
	String name;
	String id;
	double price ;
	double  quantity ;
	public Commodity() {
	}
	public Commodity(String name, String id, double price, double quantity) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Commodity [name=" + name + ", id=" + id + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	

	
}
