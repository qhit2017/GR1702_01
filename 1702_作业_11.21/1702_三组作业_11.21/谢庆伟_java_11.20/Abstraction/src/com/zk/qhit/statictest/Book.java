package com.zk.qhit.statictest;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����6:48:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Book {
	private String no;
	private String name;  //����
	private final int version=2014;  //�汾
	private double price;  //�۸�
	private static int count=0;
	public Book(){
		count++;
		no="��"+count+"������";
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
		System.out.println("������"+getName()+"\n���°汾��"+version+"\n"
				+ "�۸�"+getPrice()+"Ԫ");
	}
	

}
