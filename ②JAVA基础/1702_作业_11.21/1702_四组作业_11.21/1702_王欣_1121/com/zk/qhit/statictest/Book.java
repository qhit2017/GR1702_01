package com.zk.qhit.statictest;
/*�����ˣ�����
 *����ʱ�䣺2017��11��20������7:05:24
 *���䣺2408368509@qq.com
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
		System.out.println("��ţ�"+this.getPage()+"��"+this.getName()+"����ͼ��ݹ��в��飺"+Book.getCount());
	}
	
	
	
	
	
	
	
	
}
