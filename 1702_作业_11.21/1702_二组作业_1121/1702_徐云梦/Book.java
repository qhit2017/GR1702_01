/**
 * 
 */
package com.zk.qhit.statictest;

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��21�� ����11:19:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {
	//a����Book.java�ഴ���ĸ�˽�г�Ա����������countΪstatic�� 
	private String no;
	private String name;
	private double price;
	private static int count = 0;
	
	//b���ڹ��췽����ʵ��countֵ�ĵ�����ͬʱ��countֵ������΢��ת�丳ֵ������no
	
	public Book(){
		count++;
		no="TPOO"+count;
	}

	//c��ʵ�ֳ�Ա����name, price�ķ�װ 
	public Book(String name, double price) {
		count++;
		no="TPOO"+count;
		this.name = name;
		this.price = price;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	//d��Ϊno,count�ṩֻ������ 
	public static int getCount(){
		return count;
	}
	
	public String getNo(){
		return no;
	}
	
	// e��getInfo������������鼮�Ļ�����Ϣ
	public void getInfo(){
		System.out.println("��ţ�"+this.getNo()+"   ��"+this.getName()   
				                +"��  ��ͼ��ݹ��в��飺 "+Book.getCount());
	}
	

}
