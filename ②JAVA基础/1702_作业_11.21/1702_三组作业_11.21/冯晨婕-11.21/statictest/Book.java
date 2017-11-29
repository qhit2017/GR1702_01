/**
 * 
 */
package com.zk.qhit.statictest;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：20 Nov 2017 6:50:59 Ntambama
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
/*1、创建Java Project工程，并创建包名com.zk.qhit.statictest ，在包中创建class 类Book.java。 
   a、给Book.java类创建四个私有成员变量；其中count为static的 。
   b、在构造方法中实现count值的递增，同时将count值进行稍微的转变赋值给变量no。
   c、实现成员变量name, price的封装 。
   d、为no,count提供只读操作 。
   e、getInfo（）方法输出书籍的基本信息 。
   f、在com.tsinghua包下创建测试类TestBook.java 。*/   
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
	System.out.println("编号："+this.getNo()+"  《"+this.getName()+" 》，图书馆共有藏书："+Book.getCount());
	
	
	
	
	
	
	
	
	

}}