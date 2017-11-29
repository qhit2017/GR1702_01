package com.zk.qhit.statictest;

/** 
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����5:39:17 
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
		System.out.println("���:"+this.getNo()+
"��"+this.getName()+"��,ͼ��ٹ��в���:"+Book.getCount());
		
	}

}
