package com.zk.qhit.statictest;


/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��21�� ����9:02:31 
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
	private static int count=0;
	
	
	public Book() {
	count++;
	no="TPOO"+count;
	
	}
	
	public Book(String name,double price){
		count++;
		no="TPOO"+count;
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
	public String getNo(){
		return no;
	}
	public void getInfo(){
		System.out.println("���"+this.getNo()+"��"+this.getName()+"����ͼ��ݹ��в���:"+Book.getCount());
	}
	
}
