/**
 * 
 */
package com.zk.qhit.statictest;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺20 Nov 2017 6:50:59 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Book {
/*1������Java Project���̣�����������com.zk.qhit.statictest ���ڰ��д���class ��Book.java�� 
   a����Book.java�ഴ���ĸ�˽�г�Ա����������countΪstatic�� ��
   b���ڹ��췽����ʵ��countֵ�ĵ�����ͬʱ��countֵ������΢��ת�丳ֵ������no��
   c��ʵ�ֳ�Ա����name, price�ķ�װ ��
   d��Ϊno,count�ṩֻ������ ��
   e��getInfo������������鼮�Ļ�����Ϣ ��
   f����com.tsinghua���´���������TestBook.java ��*/   
	     private String name;
	     private String no;
	     private double price;
	 private static int count =0;
	public Book(){
	count++;
	no ="tpoo"+count;}
	public Book( String name,double price){
		count++;
	this.name=name;
    this.price=price;}

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
	 
	public static int getCount() {
		return count;
	}
	 
	public  String getNo(){
		return no;
	}
	 public void getInfo(){
	System.out.println("��ţ�"+this.getNo()+"  ��"+this.getName()+" ����ͼ��ݹ��в��飺"+Book.getCount());
	
	
	
	
	
	
	
	
	

}}