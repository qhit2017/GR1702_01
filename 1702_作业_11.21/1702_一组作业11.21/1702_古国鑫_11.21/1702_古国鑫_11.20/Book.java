package com.zk.qhit.statictest;


/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月20日 下午7:38:35 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {

	
	private String no;
	private String name;
	private double price;
	
	static int count = 0;
	
	public Book(){
		count++;
		setNo("tp00" + count);
	}
	public Book(String name,double price){
		count++;
		setNo("tp00" + count);
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public static int getCount(){
		return count;
	}
	
	
	public void getInfo(){
		System.out.println("《"+this.getName()+"》"+",图书馆的藏书为:"+Book.getCount());
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
}
