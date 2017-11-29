package com.zk.qhit.statictest;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月20日 下午5:39:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {
	private static int count=0;
	private String name;
	private double price;
	private String no;
	
	public Book(){
		count++;
		no = "Tpoo"+count;
		
	}
	public Book(String name, double price) {
		count++;
		no = "Tpoo"+count;
		this.name = name;
		this.price = price;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getprice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public static int getCount(){
		return count;
	}
	public String getNo(){
		return no;
	}
	public void getInfo(){
		System.out.println("编号:"+this.getNo()+
"《"+this.getName()+"》,图书官共有藏书:"+Book.getCount());
		
	}

}
