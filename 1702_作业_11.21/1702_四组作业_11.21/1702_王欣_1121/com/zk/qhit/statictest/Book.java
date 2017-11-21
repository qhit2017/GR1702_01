package com.zk.qhit.statictest;
/*制作人：王欣
 *制作时间：2017年11月20日下午7:05:24
 *邮箱：2408368509@qq.com
 */
public class Book {
	private String name;
	private String no;
	private double price;
	private String colour;
	private static int count =0;
	
	public Book(){
		count++;
		no = "WX00"+count;
	}
	public Book(String name,double price){
	count++;
	no ="WX00"+count;
	this.name=name;
	this.price=price;
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
	public static int getCount(){
		return count;
	}
	public String getPage(){
		return no;
	}
	public void getInfo(){
		System.out.println("编号："+this.getPage()+"《"+this.getName()+"》，图书馆共有藏书："+Book.getCount());
	}
	
	
	
	
	
	
	
	
}
