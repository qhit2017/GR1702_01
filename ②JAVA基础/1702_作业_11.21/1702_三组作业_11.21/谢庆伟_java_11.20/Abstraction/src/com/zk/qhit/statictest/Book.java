package com.zk.qhit.statictest;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月20日 下午6:48:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {
	private String no;
	private String name;  //名称
	private final int version=2014;  //版本
	private double price;  //价格
	private static int count=0;
	public Book(){
		count++;
		no="第"+count+"个对象";
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
	public String getNo() {
		return no;
	}
	public static int getCount() {
		return count;
	}
	public void getinfo(){
		System.out.println("书名："+getName()+"\n最新版本："+version+"\n"
				+ "价格："+getPrice()+"元");
	}
	

}
